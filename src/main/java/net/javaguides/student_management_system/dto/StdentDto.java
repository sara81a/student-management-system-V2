package net.javaguides.student_management_system.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//it's like Model its between view layer and controller
@Getter
@Setter


public class StdentDto {

    private  Long id;
    @NotEmpty(message = "Student First name should not be empty ")
    private  String firstName;
    @NotEmpty(message = "Student last name should not be empty ")
    private  String lastName;
    @NotEmpty(message = "Student email should not be empty ")
    @Email
    private  String email;


    public  StdentDto(){

    }
    public StdentDto(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters
    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
}
