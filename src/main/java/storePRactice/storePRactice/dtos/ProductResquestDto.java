package storePRactice.storePRactice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductResquestDto {
    private int productId;
    private String  title;
    private double price;
    private String  category;
    private String   description;
    private String   image;
    private double   rating;
}
