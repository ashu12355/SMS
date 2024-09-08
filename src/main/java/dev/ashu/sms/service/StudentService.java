package dev.ashu.sms.service;


import dev.ashu.sms.domain.Student;
import dev.ashu.sms.dto.StudentDetailResponseDto;
import dev.ashu.sms.dto.StudentResponseDto;
import dev.ashu.sms.mapper.StudentMapper;
import dev.ashu.sms.repository.StudentDetailRepository;
import dev.ashu.sms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
   private final StudentRepository studentRepository;
   private final StudentDetailRepository studentDetailRepository;

    public Student addStudent(Student student) {
        student.getStudentDetail().setStudent(student);

        return studentRepository.save(student);

    }
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(int roll){
        return studentRepository.findById(roll).orElseThrow();
    }

    public Student updateStudent(int roll,Student student){
        student.setRoll(roll);
        studentRepository.save(student);
        return student;
    }

    public void removeStudent(int roll) {
        studentRepository.deleteById(roll);
    }
    public void incrementFee(int roll , double fee){
        studentRepository.incrementFee(fee,roll);

    }



}
