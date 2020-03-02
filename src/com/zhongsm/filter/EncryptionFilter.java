package com.zhongsm.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "EncryptionFilter")
public class EncryptionFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("EncryptionFilter is Init");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");
        chain.doFilter(req, resp);
    }

    public void destroy() {
        System.out.println("EncryptionFilter destroy");
    }
}
