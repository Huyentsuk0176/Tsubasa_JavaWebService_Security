package ra.boot.controller;
import ra.boot.model.Product;
import ra.boot.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAllProducts();
    }
}
