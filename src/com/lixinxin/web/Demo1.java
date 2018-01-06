package com.lixinxin.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		请求体
//		String method = request.getMethod();
//		System.out.println("method:"+method);
//		String requestURI = request.getRequestURI();
//		StringBuffer requestURL = request.getRequestURL();
//		System.out.println("requestURI:"+requestURI);
//		System.out.println("requestURL:"+requestURL);
//		String path = request.getContextPath();
//		System.out.println("path:"+path);
//		String queryString = request.getQueryString();
//		System.out.println("queryString:"+queryString);
//		请求头
//		Enumeration<String> names = request.getHeaderNames();
//		while(names.hasMoreElements()){
//			String name = names.nextElement();
//			String value = request.getHeader(name);
//			System.out.println(name+":"+value);
//		}
//		防盗链
//		response.setContentType("text/html;charset=utf-8");
//		String header = request.getHeader("referer");
//		if(header!=null&&header.startsWith("http://localhost:8080/")){
//		response.getWriter().write("今日头条：今天天气真好");			
//		}else{
//			response.getWriter().write("版权问题");
//		}
// 		请求体
//		Enumeration<String> names = request.getParameterNames();
//		while(names.hasMoreElements()){
//			String name = names.nextElement();
//			String value = request.getParameter(name);
//			String[] values = request.getParameterValues(name);
//			System.out.println(name+":"+value);
//			System.out.println(name+":"+Arrays.toString(values));
//		}
//		Map<String, String[]> map = request.getParameterMap();
//		Set<String> keySet = map.keySet();
//		for(String key:keySet){
//			String[] values = map.get(key);
//			System.out.println(key+":"+Arrays.toString(values));
//		}
//		Map<String, String[]> map = request.getParameterMap();
//		Set<Entry<String, String[]>> entrySet = map.entrySet();
//		for(Map.Entry<String, String[]> entry:entrySet){
//			String key = entry.getKey();
//			String[] values = entry.getValue();
//			System.out.println(key+":"+Arrays.toString(values));			
//		}
//		post提交方式
//		request.setCharacterEncoding("utf-8");
	
//		Map<String, String[]> map = request.getParameterMap();
//		Set<Entry<String, String[]>> entrySet = map.entrySet();
//		Iterator<Entry<String, String[]>> it=entrySet.iterator();
//		while(it.hasNext()){
//			Map.Entry<String, String[]> entry = it.next();
//			String key = entry.getKey();
//			String[] values = entry.getValue();
//			System.out.println(key+":"+Arrays.toString(values));
//		}
//		get提交方式
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso8859-1"), "utf-8");
		System.out.println(username);
//		重定向
	RequestDispatcher dispatcher = request.getRequestDispatcher("/demo2");
	dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}