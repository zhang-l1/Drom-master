package com.zl.dorm.web.servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zl.dorm.domain.User;
import com.zl.dorm.service.UserService ;
import com.zl.dorm.service.impl.UserServiceImpl ;

@WebServlet("/selectFind/*")
public class SelectStuServlet  extends BaseServlet{

    private UserService userService = new UserServiceImpl();;

    public void selectStuCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String keyword = request.getParameter("keyword");
        System.out.println(keyword);
        if(keyword!=null){
            User student = userService.findByStuCode(Integer.valueOf(keyword));
            System.out.println(student);
            List<User> students = new LinkedList<>();
            students.add(student);
            request.setAttribute("students",students);
            request.setAttribute("mainRight","/WEB-INF/jsp/studentList.jsp");
            request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request,response);
        }


    }



}