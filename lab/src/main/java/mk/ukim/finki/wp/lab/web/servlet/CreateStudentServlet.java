package mk.ukim.finki.wp.lab.web.servlet;

import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CreateStudentServlet", urlPatterns = "/CreateStudent")
public class CreateStudentServlet extends HttpServlet {
    private List<Student> studentList = null;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentName = req.getParameter("name");
        addStudent(studentName);
        resp.sendRedirect("/servlet/StudentEnrollmentSummary");
    }

    public void addStudent(String name) {
        if (name!=null && !name.isEmpty()) {
            studentList.add(new Student("username","password", "name", "surname" ));
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> student = StudentService.listAll();
        String ipAddress = req.getRemoteAddr();
        String clientAgent = req.getHeader("User-Agent");


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Create a New Student Page</title>");
        writer.println("<style type=\"text/css\"></style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<header>");
        writer.println("<h1>Student Enrollment - Create a New Student </h1>");
        writer.println("</header>");
        writer.println("<section>");
        writer.println("<h2>Select the student to enroll:</h2>");
        writer.println("<form method='post' action='/servlet/addStudent'>" + "<label for='username'>Username:</label><input id='username' type='text' name='username'/><br/>" + "<label for='password'>Password:</label><input id='password' type='password' name='password'/><br/>" +
                "<label for='name'>Name:</label><input id='name' type='text' name='name'/><br/>"+
                "<label for='name'>Surname:</label><input id='surname' type='text' name='surname'/><br/>"+
                "</form>");
        writer.println("<input type='submit' value='Submit'/>");
        writer.println("</section>");

        writer.println("</body>");
        writer.println("</html>");

        writer.flush();
    }
}

