package storePRactice.storePRactice.FakeStorecLIENT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import storePRactice.storePRactice.dtos.CartResponseDtos;
import storePRactice.storePRactice.dtos.FakeStoreResponseDTOS;
import storePRactice.storePRactice.dtos.ProductResponseDtos;

import java.util.List;
import java.util.UUID;

@Component

public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder builder;
    @Value("${fakestore.api.web.base.url}")
    private String FakeStoreurl;
    @Value("${fakestore.api.products.path}")
    private String FakeStoreProducts;
    @Value("${fakestore.api.category.path}")
    private String FakeStoreCategory;
    @Value("${fakestore.api.cart.for.user.path}")
    private String CartStoreCarts;
    public List<FakeStoreResponseDTOS> getallProduc(){
        String url = FakeStoreurl.concat(FakeStoreProducts);
        RestTemplate restTemplate = builder.build();
        ResponseEntity<FakeStoreResponseDTOS[]> response = restTemplate.
                getForEntity(url, FakeStoreResponseDTOS[].class);
        return List.of(response.getBody());
    }
    public FakeStoreResponseDTOS getProductbyID(int id){
        String url = FakeStoreurl.concat(FakeStoreProducts).concat("/"+id);
        RestTemplate restTemplate = builder.build();
        ResponseEntity<FakeStoreResponseDTOS> response = restTemplate.getForEntity(url, FakeStoreResponseDTOS.class);
    return response.getBody();
    }
    public List<CartResponseDtos> getcart(int userid){
        if(userid<1){
            return null;
        }
        String url = FakeStoreurl.concat(CartStoreCarts).concat(String.valueOf(userid));
        RestTemplate restTemplate = builder.build();
        ResponseEntity<CartResponseDtos[]> response = restTemplate.getForEntity(url, CartResponseDtos[].class);
        return List.of(response.getBody());
    }
}
