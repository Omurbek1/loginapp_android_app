package com.xx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String username=req.getParameter("username").trim();
    	String pwd=req.getParameter("pwd").trim();
    	System.out.println("username="+username);
    	System.out.println("pwd="+pwd);
    	if(username!=null&&pwd!=null)
    	{
    		if(username.equals("guoqi")&&pwd.equals("123")){
    			resp.setCharacterEncoding("utf-8");
    			resp.getOutputStream().write("µÇÂ¼³É¹¦".getBytes("utf-8"));
    		}else{
    			resp.setCharacterEncoding("utf-8");
    			resp.getOutputStream().write("µÇÂ¼Ê§°Ü".getBytes("utf-8"));
    		}
    		
    	}
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(req, resp);
    }
}
