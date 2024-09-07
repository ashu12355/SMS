package dev.ashu.sms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    private int roll;       // Primary Key
    private String name;    // Student name
    private double fee;     // Student fee
    private String email;   // Student email
}
