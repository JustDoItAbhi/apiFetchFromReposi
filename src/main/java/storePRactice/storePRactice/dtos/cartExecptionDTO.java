package storePRactice.storePRactice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class cartExecptionDTO {
    private String massege;
    private int code;

    public cartExecptionDTO(String massege, int code) {
        this.massege = massege;
        this.code = code;
    }
}
