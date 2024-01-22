package br.com.j38.springdatarest.repository;

import br.com.j38.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
