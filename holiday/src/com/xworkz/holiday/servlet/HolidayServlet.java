package com.xworkz.holiday.servlet;

import com.xworkz.holiday.dto.HolidayDTO;
import com.xworkz.holiday.service.HolidayService;
import com.xworkz.holiday.service.HolidayServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/holiday",loadOnStartup = 1)
public class HolidayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost in Holiday servlet");

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String reason=req.getParameter("reason");
        String start=req.getParameter("start");
        String end=req.getParameter("end");

        HolidayDTO holidayDTO=new HolidayDTO(name,email,reason,start,end);


        HolidayService holidayService=new HolidayServiceImpl();
        holidayService.validate(holidayDTO);

        req.setAttribute("holidayDTO",holidayDTO);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("HolidayReqRes.jsp");
        requestDispatcher.forward(req,resp);
    }
}
