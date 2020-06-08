package com.erp;

import java.util.List;

import java.util.Map;

public class ConferenceLogic {
	ConferenceDao cdao = null;
	public ConferenceLogic() {
		cdao = new ConferenceDao();
	}

	public int conAddRoom(Map<String, Object> pMap) {
		int result = 0;
		return result;
		//회의실예약 버튼 이벤트
}
	//주석

	public int conDelRoom(Map<String, Object> pMap) {
		int result = 0;
		return result;
		//회의실 삭제버튼 이벤트
	}
	public List<Map<String,Object>> addRes() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = null;
		return result;
		//회의실 메인 조회버튼 
	}
}