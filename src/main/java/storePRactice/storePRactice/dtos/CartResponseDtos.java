package storePRactice.storePRactice.dtos;

import lombok.Getter;
import lombok.Setter;
import storePRactice.storePRactice.models.Products;
import storePRactice.storePRactice.models.ProductsQuantityDtos;

import java.util.List;
@Getter
@Setter
public class CartResponseDtos {
    private int id;
    private  int  userId;
    private  String date;
    private List<ProductsQuantityDtos> products;
    private int __v;

}
