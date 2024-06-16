package storePRactice.storePRactice.Respositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import storePRactice.storePRactice.models.Products;

import java.util.List;
import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<Products, UUID> {
Products findProductsBytitle(String title);
List<Products> findProductsBypriceBetween(double minPrice, double maxPrice);


}
