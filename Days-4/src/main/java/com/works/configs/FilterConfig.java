package com.works.configs;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Configuration
public class FilterConfig implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        System.out.println("App Up");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String url = req.getRequestURI();

        // info
        String agent = req.getHeader("user-agent");
        String ip = "";
        ip = req.getRemoteAddr();
        System.out.println(url + " - " + agent + " - " + ip);


        String[] urls = {"/customer/register", "/customer/login"};
        boolean loginStatus = true;
        for ( String item : urls ) {
            if ( item.equals(url) ) {
                loginStatus = false;
                break;
            }
        }
        if ( loginStatus ) {
            // Session Control
            boolean status = req.getSession().getAttribute("user") == null;
            if (status) {
                PrintWriter printWriter = res.getWriter();
                printWriter.write("Please Login");
                res.setStatus(401);
            }else {
                filterChain.doFilter(req, res);
            }
        }else {
            filterChain.doFilter(req, res);
        }

    }

    @Override
    public void destroy() {
        System.out.println("App Down!");
    }

}
