package net.javaguides.student_management_system.Service.impl;

import net.javaguides.student_management_system.Service.StudentService;
import net.javaguides.student_management_system.dto.StdentDto;
import net.javaguides.student_management_system.entitiy.Student;
import net.javaguides.student_management_system.mapper.StudentMapper;
import net.javaguides.student_management_system.repository.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
  private StudentRepositry studentRepositry;


    public StudentServiceImpl(StudentRepositry studentRepositry) {
        this.studentRepositry = studentRepositry;
    }

    @Override
    public List<StdentDto> getAllStudents() {

       List<Student> students = studentRepositry.findAll(); //form jpa return all student
        //convert to dto
        List<StdentDto> studentDtos = students.stream()
                .map(student -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentDtos;
    }

    @Override
    public void createStudent(StdentDto studentDto) {
Student student = StudentMapper.mapToStudent(studentDto);
studentRepositry.save(student);

    }

    @Override
    public StdentDto getStudentById(Long studentId) {
     Student student = studentRepositry.findById(studentId).get();
StdentDto stdentDto = StudentMapper.mapToStudentDto(student);
        return stdentDto;
    }

    @Override
    public void updateStudent(StdentDto stdentDto) {
        Student student = StudentMapper.mapToStudent(stdentDto);
                studentRepositry.save(student);

    }

    @Override
    public void deleteStudent(Long StudentId) {
    studentRepositry.deleteById(StudentId);

    }


}
