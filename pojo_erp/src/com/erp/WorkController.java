package com.erp;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class WorkController implements Controller {
	
	String requestName = null; //Mapper에서 requestName을 받아옴.
	WorkLogic workLogic = null;
	public WorkController(String requestName) {
		//requestName을 파라미터로 받아서 전역변수로 넘겨줌.
		this.requestName = requestName;
		workLogic = new WorkLogic();
		
	}

	@Override
	public String process(String cud, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = null;
		int result = 0;
		Map<String,Object> pMap = null;
		if(cud.equals("workAddDocument")) { 
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
		    result = workLogic.workAddDocument(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workDelDocument")) { 
			//양식 삭제 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			result = workLogic.workDelDocument(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workWrite")) { 
			//결재 작성 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workWrite(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workAgree")) {
			//결재 승인 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workAgree(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workDeny")) {
			//결재 기각 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workDeny(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workAddEmp")) {
			//사원등록 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workAddEmp(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workUpdEmp")) {
			//사원수정 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workUpdEmp(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workAddOut")) {
			//파견등록 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workAddOut(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workDelEmp")) {
			//사원삭제 insert here 
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workDelEmp(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workAddSchedule")) {
			//부서일정 추가 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workAddSchedule(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workUpdSchedule")) {
			//부서일정 수정 insert here
		    pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workUpdSchedule(pMap);
			path = "redirect:xxx.jsp";
		}else if(cud.equals("workDelSchedule")) {
			//부서일정 삭제 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			workLogic.workDelSchedule(pMap);
			path = "redirect:xxx.jsp";
		}
		return path;
	}

	@Override
	public ModelAndView process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Map<String,Object> pMap = null;
		Map<String,Object> rMap = null;
		ModelAndView mav = new ModelAndView(req,res);
		HttpSession session = req.getSession();
		String empno =  (String)session.getAttribute("empno");
		if(requestName.equals("mySign")) {
			//전자결재 insert here
			List<Map<String,Object>> slist = null;
		    pMap = new HashMap();
		    pMap.put("pname", empno);
		    slist = workLogic.smySign(pMap);
		    mav.addObject("smySignList", slist);
		    
		    List<Map<String,Object>> rlist = null;
		    rMap = new HashMap();
		    rMap.put("empno",empno);
			rlist = workLogic.rmySign(rMap);
			mav.addObject("rmySignList", rlist);
			mav.setViewName("");
		}else if(requestName.equals("signForm")) {
			//결재양식 insert here
			List<Map<String,Object>> rlist = null;
		    rlist = workLogic.signForm(pMap); //Map or List 그냥 리스트함.
		    mav.addObject("signFormList",rlist);
		    mav.setViewName("");
		}else if(requestName.equals("signSend")) {
			//결재신청 insert here
			List<Map<String,Object>> rlist = null;
			pMap = new HashMap();
			pMap.put("empno", empno);
			rlist = workLogic.signSend(pMap);
			mav.addObject("sigSendList",rlist);
			mav.setViewName("");
		}else if(requestName.equals("humanResource")) {
			//인사 insert here
		}else if(requestName.equals("empList")) {
			//사원조회 insert here
			List<Map<String,Object>> rlist = null;
			rlist = workLogic.empList(pMap);
			mav.addObject("empList", rlist);
			mav.setViewName("");
		}else if(requestName.equals("empRetire")) {
			List<Map<String,Object>> rlist = null;
			rlist = workLogic.empRetire(pMap);
			mav.addObject("empRetireList", rlist);
			mav.setViewName("");
		}else if(requestName.equals("empSend")) {
			List<Map<String,Object>> rlist = null;
			rlist = workLogic.empSend(pMap);
			mav.addObject("empSendList", rlist);
			mav.setViewName("");
		}else if(requestName.equals("branchList")) {
			List<Map<String,Object>> rlist = null;
			rlist = workLogic.branchList(pMap);
			mav.addObject("branchList", rlist);
			mav.setViewName("");
		}
		else if(requestName.equals("deptSchedule")) {
			//부서일정 insert here
			List<Map<String,Object>> rlist = null;
			pMap = new HashMap();
			pMap.put("empno",empno);
			rlist = workLogic.deptSchedule(pMap);
			mav.addObject("deptScheduleList", rlist);
			mav.setViewName("");
		}
		return mav;
	}

}
