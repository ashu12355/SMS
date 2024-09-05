package dev.ashu.sms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Student {
    @Id
    private int roll;
    private String name;
    private double fee;
    private String email;
}
