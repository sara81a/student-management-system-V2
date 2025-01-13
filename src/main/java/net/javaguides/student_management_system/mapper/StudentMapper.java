package net.javaguides.student_management_system.mapper;

import net.javaguides.student_management_system.dto.StdentDto;
import net.javaguides.student_management_system.entitiy.Student;

public class StudentMapper {


    public static StdentDto mapToStudentDto(Student student){

        return new StdentDto(
                student.getId(),        // Ensure `getId()` exists in Student
                student.getFirstName(), // Ensure `getFirstName()` exists in Student
                student.getLastName(),  // Ensure `getLastName()` exists in Student
                student.getEmail()      // Ensure `getEmail()` exists in Student
        );


//        StdentDto studentDto = new StdentDto(
//           student.getId(),
//           student.getFirstName(),
//           student.getLastName(),
//           student.getEmail()
//   );
//   return studentDto;
    }

    public  static  Student mapToStudent(StdentDto studentDto){
        return new Student(
                studentDto.getId(),        // Ensure `getId()` exists in StdentDto
                studentDto.getFirstName(), // Ensure `getFirstName()` exists in StdentDto
                studentDto.getLastName(),  // Ensure `getLastName()` exists in StdentDto
                studentDto.getEmail()      // Ensure `getEmail()` exists in StdentDto
        );

        //Student student = new Student(
//    studentDto.getId(),
//    studentDto.getFirstName(),
//        studentDto.getLastName(),
//        studentDto.getEmail()
//);
//return  student;
    }



}
