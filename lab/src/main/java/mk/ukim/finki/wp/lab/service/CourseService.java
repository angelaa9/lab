package mk.ukim.finki.wp.lab.service;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
@Service
public interface CourseService {
    static List<Student> findAllCourses(){
        return null;
    }
    Optional<Course> findById(Long courseId);
    List<Student> findAllStudentsByCourse(Long courseId);
    Course addStudentInCourse(String username, Long courseId);
}
