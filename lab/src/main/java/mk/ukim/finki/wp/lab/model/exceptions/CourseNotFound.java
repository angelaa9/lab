package mk.ukim.finki.wp.lab.model.exceptions;

public class CourseNotFound extends RuntimeException{

    public CourseNotFound(){
        super("There is no course with that courseId");
    }
}
