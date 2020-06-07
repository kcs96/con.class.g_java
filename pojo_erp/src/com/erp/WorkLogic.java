package com.erp;

import java.util.Map;

public class WorkLogic {
	WorkDao workDao = null;
	public WorkLogic() {
		workDao = new WorkDao();
	}
	public void webSign(Map<String, Object> pMap) {
		//전자 결재 탭 이벤트
	}
	public void mySign(Map<String, Object> pMap) {
		//내결재함 탭 이벤트
	}
	public void signForm(Map<String,Object> pMap) {
		//결재양식 탭 이벤트
	}
	public void signSend(Map<String, Object> pMap) {
		//결재신청 탭 이벤트
	}
	public void empManageMent(Map<String,Object> pMap) {
		//인사 탭 이벤트
	}
	public void deptSchedule(Map<String,Object> pMap) {
		//부서일정 탭 이벤트
		
	}
	public void workAddDocument(Map<String, Object> pMap) {
		//결재 양식 추가 탭 이벤트
		
	}
	public void workDelDocument(Map<String, Object> pMap) {
		// 결재양식 삭제 탭 이벤트
		
	}
	public void workWrite(Map<String, Object> pMap) {
		//결재  작성 탭 이벤트
		
	}
	public void workAgree(Map<String, Object> pMap) {
		//결재 승인 탭 이벤트
		
	}
	public void workDeny(Map<String, Object> pMap) {
		//결재 기각 탭 이벤트
		
	}
	public void workAddEmp(Map<String, Object> pMap) {
		//사원등록 탭 이벤트
		
	}
	public void workUpdEmp(Map<String, Object> pMap) {
		//사원수정 탭 이벤트
		
	}
	public void workAddOut(Map<String, Object> pMap) {
		//파견등록 탭 이벤트
		
	}
	public void workDelEmp(Map<String, Object> pMap) {
		//사원삭제 탭 이벤트
		
	}
	public void workAddSchedule(Map<String, Object> pMap) {
		//부서일정 추가 탭 이벤트
		
	}
	public void workUpdSchedule(Map<String, Object> pMap) {
		//부서일정 수정 탭 이벤트
		
	}
	public void workDelSchedule(Map<String, Object> pMap) {
		//부서일정 삭제 탭 이벤트
		
	}
	
	
	

	


}
