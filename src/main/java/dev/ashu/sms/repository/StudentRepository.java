package dev.ashu.sms.repository;

import dev.ashu.sms.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("UPDATE Student s SET s.fee = s.fee + :fee WHERE s.roll = :roll")
    @Modifying
    @Transactional
    void incrementFee(@Param("fee") double fee ,@Param("roll") int roll);
}
