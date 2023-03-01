package springBoot.spProject.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig
{
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository)
	{
		return args -> 
		{
			Student jadon=new Student("Jadon","sancho@gmail.com",LocalDate.of(1999,Month.DECEMBER,30));
			
			Student marcus=new Student("Marcus","rashford@gmail.com",LocalDate.of(1998,Month.JULY,12));
			
			studentRepository.saveAll(List.of(jadon,marcus));
		};
	}
}
