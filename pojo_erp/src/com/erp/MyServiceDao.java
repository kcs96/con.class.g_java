package com.erp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

public class MyServiceDao {
	Logger logger = Logger.getLogger(MyServiceDao.class);
	public SqlSessionFactory sqlMapper = null;
	public SqlSession sqlSec = null;
	
	public MyServiceDao() {
		logger.info("MyServiceDao() 호출 성공"); 
		sqlMapper= MyBatisCommonFactory.getSqlSessionFactory();
		sqlSec = sqlMapper.openSession();
	}
	
	public Map<String, Object> myInOutInfo(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> weekInOutInfo(Map<String, Object> pMap) {
		//주 단위 내 출퇴관리 정보
		return null;
	}

	public List<Map<String, Object>> commList(Map<String, Object> pMap) {
		
		return null;
	}

	public Map<String, Object> monthPay(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> allPay(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> mySchedule(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}
	public int myGoWork() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int myGoOut(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int myAddSchedule(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int myUpdSchedule(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int myDelSchedule(Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return 0;
	}

}
