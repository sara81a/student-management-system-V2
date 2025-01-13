package net.javaguides.student_management_system.repository;

import net.javaguides.student_management_system.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepositry extends JpaRepository<Student,Long> {
//BY default it implement method of jpa

}
