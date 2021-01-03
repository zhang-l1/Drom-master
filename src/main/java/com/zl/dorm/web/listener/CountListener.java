package com.zl.dorm.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class CountListener implements HttpSessionListener{
    private int num;
    public CountListener() {
    }



    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        num++;
        ServletContext context=se.getSession().getServletContext();
        context.setAttribute("onlineUserNum",num);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        num--;
        ServletContext context=se.getSession().getServletContext();
        context.setAttribute("onlineUserNum",num);
    }


}
