package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

//import mk.ukim.finki.wp.lab.repository.StudentRepository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentService {

   public  static List<Student> listAll(){
    return null;
   };
    Optional<Student> searchByNameOrSurname(String text);
    Optional<Student> save(String username, String password, String name, String surname);
}