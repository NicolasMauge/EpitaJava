package org.lafabrique.application;

import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.domain.employee.EmployeeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void createNewEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.createNewEmployee(employeeEntity);
    }

    @Override
    public EmployeeEntity getEmployeeById(String uid) {
        return employeeRepository.getEmployeeById(uid);
    }

    @Override
    public void deleteEmployeeById(String uid) {
        employeeRepository.deleteEmployeeById(uid);
    }


}
