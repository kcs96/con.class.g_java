package com.erp;

import java.util.Map;

public class MyServiceLogic {
	
	MyServiceDao myServiceDao = null;
	public MyServiceLogic() {
		this.myServiceDao=new MyServiceDao();
	}
	
	public void inOutManager(Map<String, Object> pMap) {
		//출퇴관리 탭 이벤트
	}

	public void commManager(Map<String, Object> pMap) {
		//급여조회 탭 이벤트
	}

	public void monthPay(Map<String, Object> pMap) {
		//당월급여 조회 탭 이벤트
	}

	public void allPay(Map<String, Object> pMap) {
		//전체 급여 조회 탭 이벤트
	}

	public void mySchedule(Map<String, Object> pMap) {
		//내 일정 관리 탭 이벤트
		
	}
	public void myGoWork(Map<String, Object> pMap) {
		//출근 버튼 이벤트 탭 이벤트
		
	}
	public void myGoHome(Map<String, Object> pMap) {
		//퇴근 버튼 이벤트 탭 이벤트
		
	}
	public void myGoOut(Map<String, Object> pMap) {
		//외출 버튼 이벤트
	}

	public void myAddSchedule(Map<String, Object> pMap) {
		//일정추가 버튼 이벤트
	}

	public void myUpdSchedule(Map<String, Object> pMap) {
		//일정수정 버튼 이벤트
	}

	public void myDelSchedule(Map<String, Object> pMap) {
		//일정삭제 버튼 이벤트
		
	}
}
