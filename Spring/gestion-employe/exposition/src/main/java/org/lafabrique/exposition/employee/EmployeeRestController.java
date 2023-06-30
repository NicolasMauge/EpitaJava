package org.lafabrique.exposition.employee;

import org.lafabrique.application.EmployeeApplicationServicePort;
import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.exposition.common.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
    private EmployeeApplicationServicePort employeeApplicationServicePort;
    private Mapper<EmployeeEntity, EmployeeDto> mapper;

    public EmployeeRestController(
            EmployeeApplicationServicePort employeeApplicationServicePort,
            Mapper<EmployeeEntity, EmployeeDto> mapper) {
        this.employeeApplicationServicePort = employeeApplicationServicePort;
        this.mapper = mapper;
    }

    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck() {
        //return "UP";
        return new ResponseEntity<>("UP", HttpStatus.OK);
    }

    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeApplicationServicePort.getAllEmployee();
        return mapper.mapListEntityToDto(employeeEntities);
    }
}
