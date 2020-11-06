package mk.ukim.finki.wp.lab.web.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import mk.ukim.finki.wp.lab.service.StudentService;
import mk.ukim.finki.wp.lab.service.CourseService;

@WebServlet(name = "CoursesListServlet ", urlPatterns = "/listCourses")
public class CoursesListServlet extends HttpServlet {

    private  List<Course> listCourses = null;
    private final CourseService courseService;
    private final SpringTemplateEngine springTemplateEngine;


    @Override
    public void init() throws ServletException {
        super.init();
        listCourses = new ArrayList<>();
    }

    public CoursesListServlet(CourseService CourseService, SpringTemplateEngine springTemplateEngine) {
        this.courseService = CourseService;
        this.springTemplateEngine = springTemplateEngine;
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req,resp,req.getServletContext());
        List<Student> student = CourseService.findAllCourses();
        String ipAddress = req.getRemoteAddr();
        String clientAgent = req.getHeader("User-Agent");
        this.springTemplateEngine.process("listCourses.html", context,resp.getWriter());



    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Long courseId = req.getParameter("id");
        //String name = req.getParameter("name");
        //String description = req.getParameter("description");
        //addStudentInCourse(courseId, name, description);
        //resp.sendRedirect("/listCourses");
    }

}
