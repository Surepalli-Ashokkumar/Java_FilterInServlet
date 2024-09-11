package com.cisco.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/filter")
public class Filter1 implements Filter
{

	@Override
	public void destroy() 
	{
		
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		String uname = request.getParameter("uname");
		
		if(uname != null)
		{
			chain.doFilter(request, response);
			
		}
		else
		{
			response.getWriter().println("Invvalid user");
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		
		Filter.super.init(filterConfig);
	}

}
