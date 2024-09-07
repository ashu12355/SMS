package dev.ashu.sms;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
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
    Student createStudent(@RequestBody Student student){
        log.info(student.toString());
        service.addStudent(student);
        return student;
    }
   @DeleteMapping("/{roll}")
   void deleteStudent(@PathVariable int roll){
        service.removeStudent(roll);
   }
}
