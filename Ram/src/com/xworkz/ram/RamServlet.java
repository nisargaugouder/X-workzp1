package com.xworkz.ram;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/nisarga",loadOnStartup = 1)
public class RamServlet extends GenericServlet {
    public RamServlet(){
        System.out.println("Index");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method is running in genericServlet");

        System.out.println("Accessories Details");
        String name=servletRequest.getParameter("name");
        String type=servletRequest.getParameter("type1");
        String warranty=servletRequest.getParameter("warranty1");
        String price=servletRequest.getParameter("price1");
        String quantity=servletRequest.getParameter("quantity1");

        System.out.println("Name: "+name+", Type: "+type+", Warranty: "+warranty+", Price:"+price+", Quantity: "+quantity);


        System.out.println("Aquarium Details");
        String model2=servletRequest.getParameter("model2");
        String cost2=servletRequest.getParameter("cost2");
        String size2=servletRequest.getParameter("size2");
        String company2=servletRequest.getParameter("company2");
        String capacity2=servletRequest.getParameter("capacity2");

        System.out.println("Model: "+model2+", Cost: "+cost2+", Size: "+size2+", Company:"+company2+", Capacity: "+capacity2);


        System.out.println("Fish Details");
        String name3=servletRequest.getParameter("name3");
        String color3=servletRequest.getParameter("color3");
        String lifespan3=servletRequest.getParameter("lifespan3");
        String cost3=servletRequest.getParameter("cost3");
        String type3=servletRequest.getParameter("type3");
        String size3=servletRequest.getParameter("size3");

        System.out.println("Name: "+name3+", Color: "+color3+", Lifespan: "+lifespan3+", Cost:"+cost3+", Type: "+type3+ ", Size:"+size3);


        System.out.println("FishFood Details");
        String name4=servletRequest.getParameter("name4");
        String brand4=servletRequest.getParameter("brand4");
        String quantity4=servletRequest.getParameter("quantity4");
        String cost4=servletRequest.getParameter("cost4");

        System.out.println("Name: "+name4+", Brand: "+brand4+", Quantity: "+quantity4+", Cost:"+cost4);


        System.out.println("Plant Details");
        String name5=servletRequest.getParameter("name5");
        String cost5=servletRequest.getParameter("cost5");
        String type5=servletRequest.getParameter("type5");
        String soilType5=servletRequest.getParameter("soilType5");

        System.out.println("Name: "+name5+", Cost: "+cost5+", Type: "+type5+", SoilType: "+soilType5);




        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 style='color:red;'>");
        writer.println("Your Details entered");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
