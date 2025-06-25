package com.xworkz.job.servlet;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.service.JobService;
import com.xworkz.job.service.JobServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@WebServlet(urlPatterns = "/job", loadOnStartup = 1)
public class JobServlet extends HttpServlet {
    public JobServlet() {
        System.out.println("no-arg const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service in JobServlet");
        String name=req.getParameter("fullName");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String qualification=req.getParameter("qualification");
        long convertedphone = Long.parseLong(phone);

        JobDTO dto=new JobDTO(name,email,convertedphone,qualification);


        JobService jobService=new JobServiceImp();
        jobService.validateAndSave(dto);


        req.setAttribute("dto",dto);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("JobApplicationRes.jsp");
        requestDispatcher.forward(req,resp);

   }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet in JobServlet");
        String id=req.getParameter("id");
        int convertedId=Integer.parseInt(id);
        System.out.println("search for convertedId:"+convertedId);
        JobService jobService=new JobServiceImp();
        JobDTO jobDTO=jobService.findById(convertedId);
        if(jobDTO==null){
            System.out.println("data is not found");
        }else{
            System.out.println("data is found....");
        }
    }
}
