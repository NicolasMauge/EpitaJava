package org.lafabrique.domain.employee;

import java.util.List;

public interface EmployeeRepository {
    List<EmployeeEntity> getAllEmployee();

    void createNewEmployee(EmployeeEntity employeeEntity);
}
