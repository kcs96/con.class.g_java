package com.erp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorkLogic {
	WorkDao workDao = null;
	public WorkLogic() {
		workDao = new WorkDao();
	}
	public List<Map<String, Object>> smySign(Map<String, Object> pMap) {
		//내결재함(보낸 결재)
		List<Map<String,Object>> slist = new ArrayList<Map<String,Object>>();
		slist = workDao.smySign(pMap);
		return slist;
	}
	public List<Map<String, Object>> rmySign(Map<String, Object> rMap) {
		//내결재함(받은 결재)
		List<Map<String,Object>> rlist = new ArrayList();
		rlist = workDao.rmySign(rMap);
		return rlist;
	}
	public List<Map<String,Object>> signForm(Map<String,Object> pMap) {
		//결재양식 탭 이벤트
		List<Map<String,Object>> rlist = null;
		rlist = workDao.signForm(pMap);
		return rlist;
	}
	public List<Map<String,Object>> signSend(Map<String, Object> pMap) {
		//결재신청 탭 이벤트
		List<Map<String,Object>> rlist = null;
		rlist = workDao.signSend(pMap);
		return rlist;
	}
	public List<Map<String, Object>> empList(Map<String, Object> pMap) {
		//사원조회 탭
		List<Map<String,Object>> rlist = null;
		rlist = workDao.empList(pMap);
		return rlist;
	}
	public List<Map<String, Object>> empRetire(Map<String, Object> pMap) {
		//퇴직사원조회 탭 이벤트
		List<Map<String,Object>> rlist = null;
		rlist = workDao.empRetire(pMap);
		return rlist;
	}
	public List<Map<String, Object>> branchList(Map<String, Object> pMap) {
		//지사관리
		List<Map<String,Object>> rlist = null;
		rlist = workDao.branchList(pMap);
		return rlist;
	}
	public List deptSchedule(Map<String,Object> pMap) {
		//부서일정 탭 이벤트
		List<Map<String,Object>> rlist = null;
		rlist = workDao.deptSchedule(pMap);
		return rlist;
		
	}
	public List<Map<String, Object>> empSend(Map<String, Object> pMap) {
		///파견사원 조회
		List<Map<String,Object>> rlist = null;
		rlist = workDao.empSend(pMap);
		return rlist;
	}

	public int workAddDocument(Map<String, Object> pMap) {
		//결재 양식 추가 탭 이벤트
		int result = 0;
		return result ;
	}
	public int workDelDocument(Map<String, Object> pMap) {
		// 결재양식 삭제 탭 이벤트
		int result = 0;
		return result ;
	}
	public int workWrite(Map<String, Object> pMap) {
		//결재  작성 탭 이벤트
		int result = 0;
		return result;
	}
	public int workAgree(Map<String, Object> pMap) {
		//결재 승인 탭 이벤트
		int result = 0;
		return result;
	}
	public int workDeny(Map<String, Object> pMap) {
		//결재 기각 탭 이벤트
		int result = 0;
		return result;
	}
	public int workAddEmp(Map<String, Object> pMap) {
		//사원등록 탭 이벤트
		int result = 0;
		return result;
	}
	public int workUpdEmp(Map<String, Object> pMap) {
		//사원수정 탭 이벤트
		int result = 0;
		return result;
	}
	public int workAddOut(Map<String, Object> pMap) {
		//파견등록 탭 이벤트
		int result = 0;
		return result;
	}
	public int workDelEmp(Map<String, Object> pMap) {
		//사원삭제 탭 이벤트
		int result = 0;
		return result;
	}
	public int workAddSchedule(Map<String, Object> pMap) {
		//부서일정 추가 탭 이벤트
		int result = 0;
		return result;
	}
	public int workUpdSchedule(Map<String, Object> pMap) {
		//부서일정 수정 탭 이벤트
		int result = 0;
		return result;
	}
	public int workDelSchedule(Map<String, Object> pMap) {
		//부서일정 삭제 탭 이벤트
		int result = 0;
		return result;
	}
	

	


}
