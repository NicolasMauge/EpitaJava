package org.lafabrique.application;

import org.lafabrique.domain.employee.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeApplicationServicePort {

    List<EmployeeEntity> getAllEmployee();

    void createNewEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity getEmployeeById(String uid);

    void deleteEmployeeById(String uid);
}
