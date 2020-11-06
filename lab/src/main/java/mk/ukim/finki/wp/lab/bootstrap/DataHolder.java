package mk.ukim.finki.wp.lab.bootstrap;
import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.model.Course;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Getter

public class DataHolder {
    public static List<Student> student = new ArrayList<>();
    public static List<Course> course = new ArrayList<>();
    public static List<Student> studentsWP = new ArrayList<>();
    public static List<Student> studentsOOP = new ArrayList<>();
    public static List<Student> studentsIS = new ArrayList<>();
    public static List<Student> studentsDM = new ArrayList<>();
    public static List<Student> studentsAPS = new ArrayList<>();


    @PostConstruct
    public void init() {
        student.add(new Student("username1", "pas1", "name1", "sur1"));
        student.add(new Student("username2", "pas2", "name2", "sur2"));
        student.add(new Student("username3", "pas3", "name3", "sur3"));
        student.add(new Student("username4", "pas4", "name4", "sur4"));
        student.add(new Student("username5", "pas5", "name5", "sur5"));

        studentsWP.add(student.get(0));
        studentsWP.add(student.get(2));
        studentsWP.add(student.get(4));

        studentsOOP.add(student.get(1));
        studentsOOP.add(student.get(2));

        studentsIS.add(student.get(3));
        studentsIS.add(student.get(4));

        studentsDM.add(student.get(0));
        studentsDM.add(student.get(1));
        studentsDM.add(student.get(4));

        studentsAPS.add(student.get(2));
        studentsAPS.add(student.get(3));
        studentsAPS.add(student.get(4));

        course.add(new Course(1l,"Web prog","WP", studentsWP));
        course.add(new Course(2l,"Objektno","OOP", studentsOOP));
        course.add(new Course(3l,"is","IS", studentsIS));
        course.add(new Course(4l,"DiskreMat","DM", studentsDM));
        course.add(new Course(5l,"Algoritmi","APS", studentsAPS));




        Student students = new Student("username6", "pas6", "name6", "sur6");
        student.add(students);
        student.add(new Student("username7", "pas7", "name7", "sur7"));


    }
}

