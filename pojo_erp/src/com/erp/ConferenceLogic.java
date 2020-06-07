package com.erp;

import java.util.Map;

public class ConferenceLogic {
	ConferenceDao cdao = null;
	public ConferenceLogic() {
		cdao = new ConferenceDao();
	}
	
	public void conAddRoom(Map<String, Object> pMap) {
		//회의실예약 버튼 이벤트
	}

	public void conDelRoom(Map<String, Object> pMap) {
		//회의실 삭제 이벤트 
	}

}
