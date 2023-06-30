package org.lafabrique.exposition.employee;

import org.lafabrique.application.EmployeeApplicationServicePort;
import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.exposition.common.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gestion-employees")
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

    @PostMapping("")
    public ResponseEntity<String> createNewEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeApplicationServicePort.createNewEmployee(mapper.mapDtoToEntity(employeeDto));
        return new ResponseEntity<String>("User created", HttpStatus.CREATED);
    }

    @GetMapping("/{uid}")
    public EmployeeDto getEmployeeById(@PathVariable("uid") String uid) {
        EmployeeEntity employeeEntity = employeeApplicationServicePort.getEmployeeById(uid);
        return mapper.mapEntityToDto(employeeEntity);


    }
}
