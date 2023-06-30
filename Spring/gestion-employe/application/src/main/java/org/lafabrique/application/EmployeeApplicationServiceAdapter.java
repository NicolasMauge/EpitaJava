package org.lafabrique.application;

import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.domain.employee.EmployeeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeApplicationServiceAdapter implements EmployeeApplicationServicePort {
    private EmployeeRepository employeeRepository;

    public EmployeeApplicationServiceAdapter(
            EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }
}
