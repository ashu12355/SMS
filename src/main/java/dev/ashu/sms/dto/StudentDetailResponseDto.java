package dev.ashu.sms.dto;


import lombok.Data;

@Data
public class StudentDetailResponseDto {
    private int slNo;
    private String motherName;
    private String fatherName;
    private String aadharNumber;
    private StudentDetailResponseDto studentDetail;
}
