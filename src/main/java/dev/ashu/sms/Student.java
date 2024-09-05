package dev.ashu.sms;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String name;
    private int roll;
    private double fee;
    private List<String> hobbies;
    private Address address;
}
