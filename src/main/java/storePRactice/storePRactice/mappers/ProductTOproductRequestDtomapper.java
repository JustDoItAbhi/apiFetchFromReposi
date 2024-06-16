package storePRactice.storePRactice.mappers;

import storePRactice.storePRactice.dtos.ProductResponseDtos;
import storePRactice.storePRactice.dtos.ProductResquestDto;
import storePRactice.storePRactice.models.Products;

public class ProductTOproductRequestDtomapper {
    private static  ProductResquestDto  getallproductdtomapper(Products products) {
        ProductResquestDto resquestDto = new ProductResquestDto();
//        resquestDto.setProductId(products.getId());
        resquestDto.setTitle(products.getTitle());
        resquestDto.setPrice(products.getPrice());
        resquestDto.setDescription(products.getDescription());
//        resquestDto.setCategory(products.getCategory());
        resquestDto.setImage(products.getImage());
        resquestDto.setRating(products.getRating());
        return resquestDto;
    }
}
