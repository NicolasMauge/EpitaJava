package org.lafabrique.infrastructure.employee;

import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.domain.employee.EmployeeRepository;
import org.lafabrique.domain.employee.ResourceAlreadyExistException;
import org.lafabrique.domain.employee.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void createNewEmployee(EmployeeEntity employeeEntity) {
        if (employeeJpaRepository.findById(employeeEntity.getUid()).isPresent()) {
            throw new ResourceAlreadyExistException("Employee already exists");
        }
        employeeJpaRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity getEmployeeById(String uid) {
        Optional<EmployeeEntity> employeeEntity = employeeJpaRepository.findById(uid);
        if(employeeEntity.isPresent()) {
            return employeeEntity.get();
        }
        throw new ResourceNotFoundException("Employee not found with this UID");
    }

    @Override
    public void deleteEmployeeById(String uid) {
        employeeJpaRepository.deleteById(uid);
    }


}
