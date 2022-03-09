package net.guides.springboot2.springboot2jpacrudexample;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;

	public Application(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee("John","Doe","john@email.com"));
		employeeRepository.save(new Employee("Marry","Public","marry@email.com"));
		employeeRepository.save(new Employee("Sachin","Tendulkar","sachin@email.com"));
		employeeRepository.save(new Employee("Rahul","Dravid","rahul@email.com"));
	}
}
