package ra.file.repository;

import ra.file.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    boolean create(Employee employee);
}
