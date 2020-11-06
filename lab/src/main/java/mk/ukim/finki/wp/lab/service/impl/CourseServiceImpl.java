package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.repository.CourseRepository;
import mk.ukim.finki.wp.lab.service.CourseService;
import mk.ukim.finki.wp.lab.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final StudentService studentService;

    public CourseServiceImpl(CourseRepository courseRepository, StudentService studentService) {

        this.courseRepository = courseRepository;
        this.studentService = studentService;
    }
    public List<Course> findAllCourses() {

        return courseRepository.findAllCourses();
    }
    public Optional<Course> findById(Long courseId){
        return courseRepository.findById(courseId);
    }
    @Override
    public List<Student> findAllStudentsByCourse (Long courseId) {
        return courseRepository.findAllStudentsByCourse(courseId);
    }

    @Override
    public Course addStudentInCourse(String username, Long courseId) {
        return null;
    }


    public Course addStudentInCourse(Student student, Course course) {
        return courseRepository.addStudentToCourse(student, course);
    }


}
