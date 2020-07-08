package com.mytoshika.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter{
	
	private Logger log = LogManager.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {

		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("Routing this method :: "+request.getMethod() +" and url : "+request.getRequestURL());

		return null;
	}

	@Override
	public String filterType() {

		return "route";
	}

	@Override
	public int filterOrder() {

		return 1;
	}

}
