import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/nisarga",loadOnStartup = 1)
public class ActorServlet extends GenericServlet {
    public ActorServlet(){
        System.out.println("Actor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in ActorServlet");
        String name=servletRequest.getParameter("name");
        String lang=servletRequest.getParameter("lang");
        String salary=servletRequest.getParameter("salary");
        String blockBusters=servletRequest.getParameter("blockBusters");
        String flops = servletRequest.getParameter("flops");
        String upcomingMovie=servletRequest.getParameter("upcomingMovie");
        String upcomingMovieProducer=servletRequest.getParameter("upcomingMovieProducer");
        String upcomingMovieDirector=servletRequest.getParameter("upcomingMovieDirector");
        String upcomingMovieBudget=servletRequest.getParameter("upcomingMovieBudget");

        System.out.println("Namr: "+name+ ", Lang: "+lang+ ", Salary: "+salary+ ", Block Buster: "+blockBusters+ ", Flops: "+flops+ ", Upcoming Movie: "+upcomingMovie+ ", Producer: "+upcomingMovieProducer+ ", Director: "+upcomingMovieDirector+ ", Budget: "+upcomingMovieBudget);

        servletResponse.setContentType("text/html");
       PrintWriter writer=servletResponse.getWriter();
       writer.println("<html>");
       writer.println("<body>");
       writer.println("<h1 style='color:red;'>");
       writer.println(name+", your Details entered");
       writer.println("</h1>");
       writer.println("</body>");
       writer.println("</html>");



    }
}
