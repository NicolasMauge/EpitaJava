package org.lafabrique.domain.employee;

public class ResourceAlreadyExistException extends BusinessException {

    public ResourceAlreadyExistException(String message) {
        super(message);
    }
}
