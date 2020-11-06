package mk.ukim.finki.wp.lab.service.impl;
import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.repository.StudentRepository;
import mk.ukim.finki.wp.lab.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    @Override
    public Optional<Student> searchByNameOrSurname(String text){
        return studentRepository.findAllByNameOrSurname(text);
    }

    @Override
    public Optional<Student> save(String username, String password, String name, String surname) {
        return this.studentRepository.save(username, password, name, surname);
    }


}
