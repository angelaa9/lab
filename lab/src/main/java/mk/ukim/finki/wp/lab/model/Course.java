package mk.ukim.finki.wp.lab.model;
import java.util.ArrayList;
import java.util.List;


public class Course {
    public Long getCourseId() {
        return courseId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public List<Student> getStudents() {
        return students;
    }

    private Long courseId;
    private String name;
    private String description;
    private List<Student> students = new ArrayList<>();

    public Course(Long courseId, String name, String description, List<Student> students) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.students=students;

    }
}