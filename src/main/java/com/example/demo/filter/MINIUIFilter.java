package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

public class MINIUIFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        //        if("application/x-www-form-urlencoded;charset=UTF-8".equalsIgnoreCase(servletRequest.getContentType())){
//            servletRequest.
//        }
//        servletRequest.getContentType()
    }

    @Override
    public void destroy() {

    }
}
