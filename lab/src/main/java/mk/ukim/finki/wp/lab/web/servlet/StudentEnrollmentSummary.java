package mk.ukim.finki.wp.lab.web.servlet;

import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.service.CourseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "StudentEnrollmentSummary", urlPatterns = "/servlet/listCourses")
public class StudentEnrollmentSummary extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ipAddress = req.getRemoteAddr();
        String clientAgent = req.getHeader("User-Agent");


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>WP lab - Students in Course</title>");
        writer.println("<style type=\"text/css\"></style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<header>");
        writer.println("<h1>Students in Course </h1>");
        writer.println("</header>");
        writer.println("<section>");
        writer.println("<div>Веб програмирање</div>");
        writer.println("<ul>");
        writer.println("<li>Петар Петров (petar.petrov)</li>");
        writer.println("<li>Јован Јованов (jovan.jovanov)</li>");
        writer.println("</ul>");
        writer.println("<form method='post' action='/servlet/listCourses'>");
        writer.println("<input type='submit' value='Back'/>");
        writer.println("</section>");
        writer.println("</body>");
        writer.println("</html>");

        writer.flush();
    }
}
