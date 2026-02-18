package ra.boot.service;
import ra.boot.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private final List<Product>
    products=new ArrayList<>();
    public ProductService(){
        products.add(new Product(1L,"Laptop",1500.0));
        products.add(new Product(2L,"Phone",800.0));
        products.add(new Product(3L,"Table",500.0));

    }
    public List<Product>
    getAllProducts(){
        return products;

        }
    }

