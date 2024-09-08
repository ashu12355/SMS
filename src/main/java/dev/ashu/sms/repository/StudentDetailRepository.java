package dev.ashu.sms.repository;

import dev.ashu.sms.domain.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailRepository extends JpaRepository<StudentDetail , Integer> {

}
