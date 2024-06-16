package storePRactice.storePRactice.models;

import storePRactice.storePRactice.exceptions.ProductNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ProductServices {
    Products createProduct(Products product);
    Products updateProduct( UUID ID,Products product);
    Products getProductbyid(UUID ID)throws ProductNotFoundException;
    List<Products> getALLProducts(Products products);
    boolean deleteProduct(UUID ID);
    Products getProductsbytitle(String title);
    List<Products> getProducts(double min, double max);
}
