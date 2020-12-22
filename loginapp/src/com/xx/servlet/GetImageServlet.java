package com.xx.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetImageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path=this.getServletContext().getRealPath("/images/timg.jpg");
		
		  InputStream is=new FileInputStream(path);
		  resp.setHeader("content-disposition", "attachment;filename=timg.jpg");
		  OutputStream out=resp.getOutputStream();
		  byte buffer[]=new byte[1024];
		  int len=0;
		  while((len=is.read(buffer))>0){
			  out.write(buffer, 0, len);
		  }
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
