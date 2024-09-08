package dev.ashu.sms.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
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
    private String email;
    @Embedded
    private Address address;
}
