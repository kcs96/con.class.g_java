package com.erp;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConferenceController implements Controller {
	String requestName = null;
	ConferenceLogic con = null;
	ModelAndView mv = null;
	public ConferenceController(String requestName) {
		this.requestName = requestName;
		con = new ConferenceLogic();
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, Object> pMap = null;
		String cud = req.getParameter("cud");
		String path =null;
		if(cud.equals("conAddRoom")) {//insert
			//회의실예약 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			con.conAddRoom(pMap);
			path="redirect:xxx.jsp";
		}else if(cud.equals("conDelRoom")) {//delete
			//회의실예약취소 insert here
			pMap = HashMapBuilder.hashMapBuilder(req.getParameterMap());
			con.conDelRoom(pMap);
			path = "redirec:xxx.jsp";
		}
		return path;
	}

	@Override
		public ModelAndView process(String work, HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			ModelAndView mav = new ModelAndView();
			if(requestName.equals("addRes")) {
				//회의실예약 insert here
				List<Map<String,Object>> rlist = null;
				rlist = con.addRes();
				mv.addObject("addRes", rlist);
				//주석
			}
			return mav;
		}
}
