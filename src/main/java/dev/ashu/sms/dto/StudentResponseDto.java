package dev.ashu.sms.dto;


import dev.ashu.sms.domain.Address;
import lombok.Data;

@Data
public class StudentResponseDto {
    private int roll;
    private String name;
    private double fee;
    private String email;
    private Address address;
    private StudentDetailResponseDto studentDetail;
}
