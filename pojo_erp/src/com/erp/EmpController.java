package com.erp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

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
	public String process(String cud, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		return null;
	}

	@Override
	public ModelAndView process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ModelAndView mav = new ModelAndView();
		if(requestName.equals("login")) {
			Map<String,String[]> pMap = (Map<String,String[]>)req.getParameterMap();
			Map<String,Object> loginMap= HashMapBuilder.hashMapBuilder(pMap);
			Map<String,Object> rMap = new HashMap<>();
			rMap =empLogic.login(loginMap);
			String empno =rMap.get("EMPNO").toString();
			String ename =rMap.get("E_NAME").toString();
			HttpSession session = req.getSession();
			session.setAttribute("empno",empno);
			session.setAttribute("ename",ename);
			mav.setViewName("");
		}
		return mav;
	}

}
