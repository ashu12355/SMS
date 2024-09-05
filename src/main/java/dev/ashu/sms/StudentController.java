package dev.ashu.sms;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @GetMapping({"/","/student"})
    Student home() {
    var student = new Student();
    return student;
    }
}
