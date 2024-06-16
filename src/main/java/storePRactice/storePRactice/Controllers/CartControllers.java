package storePRactice.storePRactice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import storePRactice.storePRactice.FakeStorecLIENT.FakeStoreClient;
import storePRactice.storePRactice.dtos.CartResponseDtos;

import java.util.List;

@RestController
public class CartControllers {
    @Autowired
private FakeStoreClient fakeStoreClient;
    @GetMapping("/cart/{userid}")
    public ResponseEntity getCart(@PathVariable ("userid")int userid) {
  List<CartResponseDtos> carts=fakeStoreClient.getcart(userid);
    return ResponseEntity.ok().body(carts);
    }

    @GetMapping("/cartExecption")
        public ResponseEntity getCartException() {
        throw new RuntimeException("cart controller execption");
        }
}
