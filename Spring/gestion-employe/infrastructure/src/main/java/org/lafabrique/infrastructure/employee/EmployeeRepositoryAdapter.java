package org.lafabrique.infrastructure.employee;

import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.domain.employee.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepositoryAdapter implements EmployeeRepository {
    private EmployeeJpaRepository employeeJpaRepository;

    public EmployeeRepositoryAdapter(
            EmployeeJpaRepository employeeJpaRepository) {
        this.employeeJpaRepository = employeeJpaRepository;
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeJpaRepository.findAll();
    }
}
