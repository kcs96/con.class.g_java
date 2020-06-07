package com.erp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sun.net.httpserver.HttpsConfigurator;

public class EmpController implements Controller {

	String requestName = null;
	EmpLogic empLogic = null;
	Logger logger = Logger.getLogger(EmpController.class);
	public EmpController(String requestName) {
		logger.info("EmpController 생성 성공");
		this.requestName=requestName;
		empLogic = new EmpLogic();
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		return null;
	}

	@Override
	public ModelAndView process(String work, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ModelAndView mav = null;
		if(requestName.equals("login")) {
			Map<String,String[]> rMap = (Map<String,String[]>)req.getParameterMap();
			HashMapBuilder hmb = new HashMapBuilder();
			Map<String,Object> loginMap= hmb.hashMapBuilder(rMap);
			//rMap =empLogic.login(loginMap);
			//String empNO =rMap.get("EMPNO");
			//String empName =rMap.get("EMPNAME");
			//HttpSession session = req.getSession();
			//session.setattribute("empno",empNo);
			//session.setattribute("empName",empName);
			//path="xxx:xxx.jsp"
		}
		return mav;
	}

}
