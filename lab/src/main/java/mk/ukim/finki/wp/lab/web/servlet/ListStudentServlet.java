package mk.ukim.finki.wp.lab.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import java.util.List;
import java.io.PrintWriter;
import mk.ukim.finki.wp.lab.service.StudentService;
import mk.ukim.finki.wp.lab.service.CourseService;

@WebServlet(name = "ListStudentServlet ", urlPatterns = "/АddStudent")
public class ListStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //List<Student> student = StudentService.listAll();
        String ipAddress = req.getRemoteAddr();
        String clientAgent = req.getHeader("User-Agent");


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Add new Student to Course</title>");
        writer.println("<style type=\"text/css\"></style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<header>");
        writer.println("<h1>Student Enrollment - Select the Student</h1>");
        writer.println("</header>");
        writer.println("<section>");
        writer.println("<h2>Select the student to enroll:</h2>");
        writer.println("<form method='post' action='/servlet/createStudent'>" + "<input type='submit' value='Create New Student'/> <br/> <br/>" + "<input type=\"radio\" name=\"size\" value=\"petar.petrov\"> Петар Петров <br/>" +
                " <input type=\"radio\" name=\"size\" value=\"mile.milev\"> Миле Милев <br/>"+
                "<input type=\"radio\" name=\"size\" value=\"gjorgji.gjorgjiev\"> Ѓорѓи Ѓорѓиев <br/>"+
                "</form>");
        writer.println("<form method='post' action='/servlet/StudentEnrollmentSummary'>" + "<input type='submit' value='Submit'/>");
        writer.println("</section>");
        writer.println("<aside>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<th colspan=\"2\">");
        writer.println("Your Enrollment Status");
        writer.println("</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td><b>Course Id</b></td>");
        writer.println("<td>2</td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</aside>");
        writer.println("</body>");
        writer.println("</html>");

        writer.flush();
    }
}
