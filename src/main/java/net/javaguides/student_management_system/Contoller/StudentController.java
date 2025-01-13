package net.javaguides.student_management_system.Contoller;

import jakarta.validation.Valid;
import net.javaguides.student_management_system.Service.StudentService;
import net.javaguides.student_management_system.dto.StdentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    //handle method to handle list of student request


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")  //this refer to students.html
    public String ListStudents(Model model){ //this mode is UI
        List<StdentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);
    return "students";  //this students is mean refer to students.html
    }

   // handler method to handle new student request
@GetMapping("/students/new")
    public String newStudent(Model model){
//student model object to store student form data
    StdentDto stdentDto = new StdentDto();
    model.addAttribute("student", stdentDto);
    return "create_student";
    }

    //handler method to handle save student form submit request
   @PostMapping("/students")  //action on form(html)
    public  String saveStudent(@Valid @ModelAttribute("student") StdentDto student,
                               BindingResult result,
                               Model model){//student this the object in html
if(result.hasErrors()){
    model.addAttribute("students",student);
return  "create_student";
}

        studentService.createStudent(student);
return "redirect:/students";
    }

    //handler method to handle edit student request
    //put the information and edit page to be ready as UI
   @GetMapping("/students/{studentId}/edit")
    public  String editStudent(@PathVariable("studentId") Long studentId,
                               Model model){

        StdentDto student = studentService.getStudentById(studentId);
model.addAttribute("student",student); //this add in the UI the student information
       //"student" this refer in the .html
return "edit_student" ; //view name
    }

    //update inform
    //handler method to handle edit student form sub,it request
    @PostMapping("/students/{studentId}")
    public  String UpdateStudent(@PathVariable("studentId") Long studentId
            ,@Valid @ModelAttribute("student") StdentDto stdentDto
              ,BindingResult result
              , Model model){
        if(result.hasErrors()){
            model.addAttribute("student",stdentDto);
            return "edit_student";
        }
        stdentDto.setId(studentId);
        studentService.updateStudent(stdentDto);
        return "redirect:/students";
    }

    //handler method to delete student
@GetMapping("/students/{studentId}/delete")
    public  String deleteStudent(@PathVariable("studentId") Long studentId){
   studentService.deleteStudent(studentId);
return "redirect:/students";
}


//handler method of view student
    @GetMapping("/students/{studentId}/view")
    public String viewStudent(@PathVariable ("studentId")Long studentId , Model model){
        StdentDto student = studentService.getStudentById(studentId);
        model.addAttribute("student",student); //this add in the UI the student information
        //"student" this refer in the .html
        return "view_student" ; //view name
    }
}
