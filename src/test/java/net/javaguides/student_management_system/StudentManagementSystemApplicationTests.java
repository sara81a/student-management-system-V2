package net.javaguides.student_management_system;

import net.javaguides.student_management_system.Contoller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = StudentManagementSystemApplication.class)
@ContextConfiguration(classes = StudentManagementSystemApplication.class)
class StudentManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}

}
