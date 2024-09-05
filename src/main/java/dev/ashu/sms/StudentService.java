package dev.ashu.sms;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;


    public Student addStudent(Student student) {
        return repository.save(student);

    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudent(int roll){
        return repository.findById(roll).orElseThrow();
    }

    public void removeStudent(int roll) {
        repository.deleteById(roll);
    }



}
