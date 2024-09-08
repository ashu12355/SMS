package dev.ashu.sms.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    private int roll;       // Primary Key
    private String name;    // Student name
    private double fee;     // Student fee
    private String email;
    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_detail_id")
    private StudentDetail studentDetail;
}
