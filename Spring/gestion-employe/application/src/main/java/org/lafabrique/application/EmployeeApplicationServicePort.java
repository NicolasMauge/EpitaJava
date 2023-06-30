package org.lafabrique.application;

import org.lafabrique.domain.employee.EmployeeEntity;

import java.util.List;

public interface EmployeeApplicationServicePort {

    List<EmployeeEntity> getAllEmployee();
}
