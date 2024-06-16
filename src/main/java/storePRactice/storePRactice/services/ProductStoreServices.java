package storePRactice.storePRactice.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import storePRactice.storePRactice.Respositroy.ProductRepository;
import storePRactice.storePRactice.exceptions.ProductNotFoundException;
import storePRactice.storePRactice.models.ProductServices;
import storePRactice.storePRactice.models.Products;

import java.util.List;
import java.util.UUID;

@Service("ProductServices")
@Qualifier
public class ProductStoreServices implements ProductServices {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Products createProduct(Products product) {
        Products productSaved = productRepository.save(product);
        return productSaved;
    }

    @Override
    public Products updateProduct(UUID ID, Products product) {
        Products productSaved = productRepository.findById(ID).orElseThrow(
                () -> new ProductNotFoundException(ID.toString()));
        productSaved.setId(ID);
        productSaved.setTitle(product.getTitle());
        productSaved.setPrice(product.getPrice());
        productSaved.setCategory(product.getCategory());
        productSaved.setDescription(product.getDescription());
        productSaved.setRating(product.getRating());
        productSaved.setImage(product.getImage());
        productRepository.save(productSaved);
        return productSaved;
    }

    @Override
    public Products getProductbyid(UUID ID) throws ProductNotFoundException {
        Products productSaved = productRepository.findById(ID).get();
        return productSaved;
    }

    @Override
    public List<Products> getALLProducts(Products products) {
        List<Products> productsSaved = productRepository.findAll();
        return productsSaved;
    }

    @Override
    public boolean deleteProduct(UUID ID) {
        productRepository.deleteById(ID);
        return true;
    }

    @Override
    public Products getProductsbytitle(String name) {
        Products productSaved = productRepository.findProductsBytitle(name);
        return productSaved;
    }

    @Override
    public List<Products> getProducts(double min, double max) {
List<Products>productsList= productRepository.findProductsBypriceBetween(min,max);
return productsList;
    }

}


