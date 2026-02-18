package ra.boot.controller;
import ra.boot.model.Product;
import ra.boot.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @RequestMapping("/api/products")
    public List<Product> getAll(){
        return productService.getAllProducts();
    }
}
