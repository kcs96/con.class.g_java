package com.erp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class MyServiceController implements Controller {
	Logger logger = Logger.getLogger(MyServiceController.class);
	String requestName = null;
	MyServiceLogic myServiceLogic = null;
	
	public MyServiceController(String requestName) {
		logger.info("MyServiceController 호출 성공");
		this.requestName = requestName;
		myServiceLogic = new MyServiceLogic();
	}

	@Override
	public String process(String cud, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = null;
		Map<String, Object> pMap = null;
		if(cud.equals("myGoWork")) { //insert 출근테이블에 오늘 출근 row추가
			//출근버튼 눌렀을때
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myGoWork(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("myGoHome")) { //update 오늘 출근row에 퇴근값 추가
			//퇴근버튼 눌렀을때
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myGoHome(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("myGoOut")) { //update 상태컬럼 : 정상 -> 외출
			//외출버튼 눌렀을 때
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myGoOut(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("myAddSchedule")) { //insert 일정 추가
			//내 일정 내용 추가
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myAddSchedule(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("myUpdSchedule")) { //update 일정 수정
			//내 일정 내용 수정
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myUpdSchedule(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("myDelSchedule")) { //delete 일정 삭제
			//내 일정 삭제
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.myDelSchedule(pMap);
			path="redirect:xxx.jsp";
		}
		return path;
	}

	@Override
	public ModelAndView process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ModelAndView mav = new ModelAndView(req,res);
		if(requestName.equals("inOutManager")) {
			//출퇴관리 insert here
			Map<String,Object> pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.inOutManager(pMap);
			mav.setViewName("");
		}else if(requestName.equals("commManager")) {
			//급여관리  insert here
			Map<String,Object> pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.commManager(pMap);
			mav.setViewName("");
		}else if(requestName.equals("monthPay")) {
			//당월급여 insert here
			Map<String,Object> pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.monthPay(pMap);
			mav.setViewName("");
		}else if(requestName.equals("allPay")) {
			//전체급여 insert here
			Map<String,Object> pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.allPay(pMap);
			mav.setViewName("");
		}else if(requestName.equals("mySchedule")) {
			//개인일정 insert here
			Map<String,Object> pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			myServiceLogic.mySchedule(pMap);
			mav.setViewName("");
		}
		return mav;
	}

}
