package org.lafabrique.exposition.common;

import org.lafabrique.domain.employee.ResourceAlreadyExistException;
import org.lafabrique.domain.employee.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControlAdviceException extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<ErrorModel> handleResourceNotFoundException(final ResourceNotFoundException ex) {
        ErrorModel model = new ErrorModel("404", ex.getLocalizedMessage(), "Resource not found");
        return new ResponseEntity<ErrorModel>(model, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<ErrorModel> handleResourceAlreadyExists(final ResourceAlreadyExistException ex) {
        ErrorModel model = new ErrorModel("208", ex.getLocalizedMessage(), "Resource already exists");
        return new ResponseEntity<ErrorModel>(model, HttpStatus.ALREADY_REPORTED);
    }
}
