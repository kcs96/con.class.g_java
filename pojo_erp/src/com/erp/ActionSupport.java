package com.erp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ActionSupport extends HttpServlet {
	Logger logger = Logger.getLogger(ActionSupport.class);
	
	public void doService(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String requestURI =req.getRequestURI(); 
		String contextPath = req.getContextPath();       
		String command = requestURI.substring(contextPath.length()+1);
		
		int end = command.lastIndexOf(".");
		command = command.substring(0,end);
		
		Controller controller = null;
		
		String cud = req.getParameter("cud");
		try {
			controller = ControllerMapper.getController(command);
		} catch (Exception e) {
			System.out.println("오류! 컨트롤러 맵핑 실패");
			e.printStackTrace();
		}
		
		if(controller!=null) {
			String pageMove[] = null;
			try {
				Object robj = null;
				if(cud==null) { 
					logger.info("cud가 null일때로 처리");
					robj = controller.process(command, req,res);
				}else { 
					logger.info("cud가 null이 아닐때로 처리");
					robj = controller.process(req,res);   
				}

				
				if(robj instanceof String) {
					pageMove = robj.toString().split(":");
					logger.info("pageMove[0] ==> "+pageMove[0]+"pageMove[1] ==>"+pageMove[1]);
				}else if(robj instanceof ModelAndView) {
					ModelAndView mav = (ModelAndView)robj;
					pageMove = new String[2];
					pageMove[0] = "forward";
					pageMove[1] = mav.getViewName();
				}
			} catch (Exception e) {
				logger.info("Exception : "+e.toString());
			}
			if(pageMove!=null) {
				String path = pageMove[1];
				if("redirect".equals(pageMove[0])) {//너 redirect 할꺼야?
					res.sendRedirect(path);
				}else{//너 forward 할꺼야?
					if("forward".equals(pageMove[0])) {
						RequestDispatcher view = req.getRequestDispatcher(path);
						view.forward(req, res);
					}else {
						res.sendRedirect("/error/pageMoveFail.jsp");
					}
				}
			}
		}/////////////////end of Controller가 널이 아닐때 ///////////////////////
	}//////////////////////end of doService/////////////////////////////
	
	@Override
	public void doGet(HttpServletRequest req,
			 	      HttpServletResponse res) throws ServletException, IOException {
		logger.info("doGet 호출 성공");
		doService(req,res);
	}
	@Override
	public void doPost(HttpServletRequest req,
	 	      HttpServletResponse res) throws ServletException, IOException {
		logger.info("doPost 호출 성공");
		doService(req,res);
	}
}
