package storePRactice.storePRactice.models;

//import jakarta.persistence.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Products extends BaseModel{
   private String  title;
   private double price;
    private String  category;
    private String   description;
    private String   image;
    private double rating;

}
