package net.javaguides.student_management_system.Service;

import net.javaguides.student_management_system.dto.StdentDto;

import java.util.List;

public interface StudentService {

    List<StdentDto> getAllStudents();

    void createStudent(StdentDto studentDto);

    StdentDto getStudentById(Long studentId);

    void  updateStudent(StdentDto stdentDto);
    void  deleteStudent(Long StudentId);

}
