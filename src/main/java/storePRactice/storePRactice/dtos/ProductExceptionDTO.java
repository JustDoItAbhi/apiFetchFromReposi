package storePRactice.storePRactice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductExceptionDTO {
private String massege;
private int code;

    public ProductExceptionDTO(String massege, int code) {
        this.massege = massege;
        this.code = code;
    }
}
