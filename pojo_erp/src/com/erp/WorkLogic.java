package com.erp;

import java.util.List;
import java.util.Map;

public class WorkLogic {
	WorkDao workDao = null;
	public WorkLogic() {
		workDao = new WorkDao();
	}
	public List<Map<String,Object>> webSign(Map<String, Object> pMap) {
		//전자 결재 탭 이벤트
		List<Map<String,Object>> result = null;
		return result;
	}
	public List<Map<String,Object>> mySign(Map<String, Object> pMap) {
		//내결재함 탭 이벤트
		List<Map<String,Object>> result = null;
		return result;
	}
	public List<Map<String,Object>> signForm(Map<String,Object> pMap) {
		//결재양식 탭 이벤트
		List<Map<String,Object>> result = null;
		return result;
	}
	public List<Map<String,Object>> signSend(Map<String, Object> pMap) {
		//결재신청 탭 이벤트
		List<Map<String,Object>> result  = null;
		return result;
	}
	public List<Map<String,Object>> empManageMent(Map<String,Object> pMap) {
		List<Map<String,Object>> result = null;
		return result;
		//인사 탭 이벤트
	}
	public List<Map<String,Object>>  deptSchedule(Map<String,Object> pMap) {
		List<Map<String,Object>> result = null;
		return result;
		//부서일정 탭 이벤트
		//주석
		
	}
	public int workAddDocument(Map<String, Object> pMap) {
		//결재 양식 추가 탭 이벤트
		int result = 0;
		return result;
	}
	public int workDelDocument(Map<String, Object> pMap) {
		// 결재양식 삭제 탭 이벤트
		int result = 0;
		return result;
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
