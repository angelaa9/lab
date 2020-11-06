package mk.ukim.finki.wp.lab.repository;
import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {


    public List<Student> findAll() {

        return DataHolder.student;
    }
    public Optional<Student> findAllByNameOrSurname(String text){
        return DataHolder.student.stream().filter(r->r.getName().contains(text) && r.getSurname().contains(text)).findFirst();
    }

    public Optional<Student> save(String username, String password, String name, String surname){
        DataHolder.student.removeIf(i -> i.getName().equals(name));
        Student students = new Student(username, password, name, surname);
        DataHolder.student.add(students);
        return Optional.of(students);


    }
}


