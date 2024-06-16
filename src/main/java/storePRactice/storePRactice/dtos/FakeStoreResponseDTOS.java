package storePRactice.storePRactice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FakeStoreResponseDTOS {
private int id;
    private String  title;
    private double price;
    private String  category;
    private String   description;
    private String   image;
    private Ratings rating;
}
