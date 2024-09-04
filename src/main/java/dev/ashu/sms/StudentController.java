package dev.ashu.sms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping
    Student home() {
    var student = new Student();
    student.setRoll(101);
    student.setName("Ashutosh");
    student.setFee(123.4);

    return student;
    }
}
