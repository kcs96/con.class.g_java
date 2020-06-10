package com.erp;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String process(String cud,HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException;
	public ModelAndView process(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException;
}
