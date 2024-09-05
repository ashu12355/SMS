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
    student.setName("Ashutosh");
    student.setRoll(101);
    student.setFee(123.4);
    student.setHobbies(List.of("Singing","Playing"));

    var address = new Address();
    address.setCity("Forbesganj");
    address.setState("Bihar");

    student.setAddress(address);


    return student;
    }
}
