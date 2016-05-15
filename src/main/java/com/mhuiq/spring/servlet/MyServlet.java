package com.mhuiq.spring.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	private static int i = 0;
	public MyServlet() {
		System.out.println("MyServlet is starting ...");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		super.doGet(req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doHead(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doTrace(arg0, arg1);
	}

	@Override
	protected long getLastModified(HttpServletRequest req) {
		System.out.println("getLastModified");
		return super.getLastModified(req);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Http Service");
		super.service(arg0, arg1);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(i++);
		System.out.println("Servlet Service");
		super.service(req, res);
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}

	@Override
	public String getInitParameter(String name) {
		System.out.println("getInitParameter");
		return super.getInitParameter(name);
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		System.out.println("getInitParameterNames");
		return super.getInitParameterNames();
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return super.getServletConfig();
	}

	@Override
	public ServletContext getServletContext() {
		System.out.println("getServletContext");
		return super.getServletContext();
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return super.getServletInfo();
	}

	@Override
	public String getServletName() {
		System.out.println("getServletName");
		return super.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init params");
		super.init(config);
	}

	@Override
	public void log(String message, Throwable t) {
		System.out.println("log");
		super.log(message, t);
	}

	@Override
	public void log(String msg) {
		System.out.println("log params");
		super.log(msg);
	}
	
	
}
