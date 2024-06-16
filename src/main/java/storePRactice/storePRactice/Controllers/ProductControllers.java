package storePRactice.storePRactice.Controllers;

//import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import storePRactice.storePRactice.models.ProductServices;
import storePRactice.storePRactice.models.Products;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/Product")
public class ProductControllers {
    @Autowired
   @Qualifier("ProductServices")
    private ProductServices productServices;
    @PostMapping
  public ResponseEntity  createProducts(@RequestBody Products products) {
        Products products1=productServices.createProduct(products);
        return ResponseEntity.ok().body(products1);
    }
//    @GetMapping("{id}")
//    public ResponseEntity  getProducts(@PathVariable("id") UUID id) {
//       Products getprod= productServices.getProductbyid(id);
//        return ResponseEntity.ok().body(getprod);
//    }
    @GetMapping()
    public ResponseEntity updateProduct(Products products) {
        List<Products> products1= productServices.getALLProducts(products);
        return ResponseEntity.ok().body(products1);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity  deleteProducts(@PathVariable("id") UUID id) {
        productServices.deleteProduct(id);
        if(id==null){
            throw new RuntimeException("id not found"+id);
        }
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity  updateProducts(@PathVariable("id") UUID ID,@RequestBody Products products) {
      Products products1=  productServices.updateProduct(ID,products);
        return ResponseEntity.ok().body(products1);
    }
    @GetMapping("/{ProductName}")
    public ResponseEntity  getProductName(@PathVariable  ("ProductName")String ProductName){
      Products name=  productServices.getProductsbytitle(ProductName);
        return ResponseEntity.ok().body(name);
    }
    @GetMapping("/{min}/{max}")
    public ResponseEntity  getProductsbyPriceBetween(@PathVariable("min") double min,@PathVariable("max") double max){
        return ResponseEntity.ok(
                productServices.getProducts(min,max));
    }
}
