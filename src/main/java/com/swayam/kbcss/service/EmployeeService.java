package com.swayam.kbcss.service;

import com.swayam.kbcss.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployee(long id);

    Page< Employee > findPaginated(int pageNo, int pageSize);
}
