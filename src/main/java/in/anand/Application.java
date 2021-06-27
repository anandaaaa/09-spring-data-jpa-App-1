package in.anand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.anand.entity.Employee;
import in.anand.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository bean = context.getBean(EmployeeRepository.class);
		
		System.out.println("name::::"+bean.getClass().getName());
		
		/*
		 * Employee emp=new Employee(); emp.setEmployeeID(1);
		 * emp.setEmployeeName("anand"); emp.setEmployeeSalary(5000f);
		 */	
		/* bean.save(emp); */
		
		
		Employee findByEmployeeName = bean.findByEmployeeName("anand");
		System.out.println(findByEmployeeName);
		context.close();
	}

}
