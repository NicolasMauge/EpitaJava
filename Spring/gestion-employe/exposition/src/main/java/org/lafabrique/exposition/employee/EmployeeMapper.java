package org.lafabrique.exposition.employee;

import org.lafabrique.domain.employee.EmployeeEntity;
import org.lafabrique.exposition.common.Mapper;

public class EmployeeMapper extends Mapper<EmployeeEntity, EmployeeDto> {


    @Override
    public EmployeeDto mapEntityToDto(EmployeeEntity input) {
        return new EmployeeDto(input.getUid(), input.getFirstname(), input.getLastname());
    }

    @Override
    public EmployeeEntity mapDtoToEntity(EmployeeDto input) {
        return new EmployeeEntity(input.getUid(), input.getFirstname(), input.getLastname());
    }
}
