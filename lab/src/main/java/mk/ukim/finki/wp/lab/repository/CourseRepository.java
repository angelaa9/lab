package mk.ukim.finki.wp.lab.repository;
import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class CourseRepository {


    public List<Course> findAllCourses() {
        return DataHolder.course;
    }

    public Optional<Course> findById(Long courseId) {
        return DataHolder.course.stream().filter(i -> i.getCourseId().equals(courseId)).findFirst();
    }

    public List <Student> findAllStudentsByCourse (Long courseId){
        Optional<Course> courseOptional = DataHolder.course.stream().filter(i->i.getCourseId().equals(courseId)).findFirst();
        return courseOptional.get().getStudents();
    }

    public Course addStudentToCourse(Student student, Course course) {
        List<Student> courseStudents = course.getStudents();
        if (!courseStudents.contains(student)) {
            courseStudents.add(student);
        }
    return course;
    }


}





