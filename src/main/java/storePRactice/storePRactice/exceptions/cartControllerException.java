package storePRactice.storePRactice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import storePRactice.storePRactice.Controllers.CartControllers;
import storePRactice.storePRactice.dtos.cartExecptionDTO;

@ControllerAdvice(basePackageClasses= CartControllers.class)
public class cartControllerException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleException(RuntimeException ex){
        cartExecptionDTO cartExecptionDTO=new cartExecptionDTO(
                ex.getMessage(),
                404
        );
        return new ResponseEntity<>(cartExecptionDTO, HttpStatus.NOT_FOUND);
    }



}
