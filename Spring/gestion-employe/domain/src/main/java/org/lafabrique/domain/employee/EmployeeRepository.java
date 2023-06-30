package org.lafabrique.domain.employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    List<EmployeeEntity> getAllEmployee();

    void createNewEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity getEmployeeById(String uid);
}
