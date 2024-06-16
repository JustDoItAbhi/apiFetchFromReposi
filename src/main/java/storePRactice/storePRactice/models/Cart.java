package storePRactice.storePRactice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Cart extends BaseModel {
    private String customerName;
    @OneToMany
    private List<Products> productsList;

    public Cart() {

    }
}
