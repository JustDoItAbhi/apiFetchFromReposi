package storePRactice.storePRactice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import storePRactice.storePRactice.dtos.ProductExceptionDTO;
@ControllerAdvice
public class ProductNotFExecption {
    @ExceptionHandler( ProductNotFoundException.class)
    public ResponseEntity productExepntionHandler(ProductExceptionDTO pe){
        ProductExceptionDTO productExceptionDTO=new ProductExceptionDTO(
                pe.getMassege(),
                404
        );
        return new  ResponseEntity<>(productExceptionDTO, HttpStatus.NOT_FOUND);
    }
}
