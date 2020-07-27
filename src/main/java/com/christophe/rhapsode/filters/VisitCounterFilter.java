package com.christophe.rhapsode.filters;

import com.christophe.rhapsode.service.VisitCounterService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.filters.RequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import java.io.IOException;


@Slf4j
public class VisitCounterFilter implements  Filter{

    VisitCounterService visitCounterService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        visitCounterService = (VisitCounterService) WebApplicationContextUtils.getRequiredWebApplicationContext(filterConfig.getServletContext()).getBean("visitCounterService");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String ip = request.getRemoteAddr();
        log.info(ip);
        visitCounterService.increaseCount(ip);
        chain.doFilter(request,response);
    }
}
