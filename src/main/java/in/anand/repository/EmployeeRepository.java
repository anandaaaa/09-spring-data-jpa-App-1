package in.anand.repository;

import org.springframework.data.repository.CrudRepository;

import in.anand.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

	public Employee findByEmployeeName(String name);
}
