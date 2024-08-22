package ra.file.service;

import ra.file.dto.request.EmployeeDTO;
import ra.file.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    boolean create(EmployeeDTO employeeDTO);
}
