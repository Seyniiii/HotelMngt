package com.spring.hotelmngt.repo;

import com.spring.hotelmngt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long > {
   Employee findByEmplId(long id);
    Employee getEmployeeByUsername(String username);
}
