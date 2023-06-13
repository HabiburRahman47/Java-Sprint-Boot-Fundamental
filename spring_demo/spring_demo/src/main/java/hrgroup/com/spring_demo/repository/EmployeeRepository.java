package hrgroup.com.spring_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hrgroup.com.spring_demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
