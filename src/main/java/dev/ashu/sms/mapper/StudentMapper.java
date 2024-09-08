package dev.ashu.sms.mapper;

import dev.ashu.sms.domain.Student;
import dev.ashu.sms.dto.StudentDetailResponseDto;
import dev.ashu.sms.dto.StudentResponseDto;
import org.springframework.beans.BeanUtils;

public class StudentMapper {

    public static StudentResponseDto convertStudent(Student student){
        var response = new StudentResponseDto();
        BeanUtils.copyProperties(student , response);

        var studentDetailResponseDto = new StudentDetailResponseDto();
        BeanUtils.copyProperties(student.getStudentDetail(),studentDetailResponseDto);
        response.setStudentDetail(studentDetailResponseDto);
        return response;
    }
}
