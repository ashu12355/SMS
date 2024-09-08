package dev.ashu.sms.controller;

import dev.ashu.sms.domain.Student;
import dev.ashu.sms.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/students")

@RequiredArgsConstructor
@Slf4j

public class StudentController {
    private final StudentService service;


    @GetMapping
    List<Student> students(){
        return service.getStudents();
    }
    @GetMapping("/{roll}")
    Student student(@PathVariable int roll){
        return service.getStudent(roll);
}

    @PutMapping("/{roll}")
    Student updateStudent(@PathVariable int roll , @RequestBody Student student) {
        return service.updateStudent(roll,student);
    }

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
    Student createStudent(@RequestBody Student student){
        log.info(student.toString());
        service.addStudent(student);
        return student;
    }
   @DeleteMapping("/{roll}")
   void deleteStudent(@PathVariable int roll){
        service.removeStudent(roll);
   }
   @PatchMapping("/{roll}/increment/{fee}")
    public void incrementFee(@PathVariable int roll , @PathVariable double fee){
        service.incrementFee(roll, fee);
   }
}
