package ra.file.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.file.dto.request.EmployeeDTO;
import ra.file.model.Employee;
import ra.file.repository.EmployeeRepository;
import ra.file.service.EmployeeService;
import ra.file.service.UploadFileService;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UploadFileService uploadFileService;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean create(EmployeeDTO employeeDTO) {
        //1. Upload File len firebase --> URL file trên firebase
        String avatarUrlFirebase = uploadFileService.uploadFileToLocal(employeeDTO.getAvatar());
        //2. Chuyển DTO --> entity
        Employee employee = Employee.builder().empName(employeeDTO.getEmpName())
                .age(employeeDTO.getAge())
                .avatar(avatarUrlFirebase)
                .build();
        //3. Gọi sang repository để thêm nhân viên
        return employeeRepository.create(employee);
    }
}
