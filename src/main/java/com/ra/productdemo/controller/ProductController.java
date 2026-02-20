package com.ra.productdemo.controller;
import com.ra.productdemo.entity.Product;
import com.ra.productdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController{
    @Autowired
    private ProductService productService;
    //get
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    // post
    @PostMapping
    public Product add(@RequestBody Product product){
        return productService.add(product);
    }
    //put
    @PutMapping("/{id}")
    public Product
    update(@PathVariable Long id, @RequestBody Product product){
        return productService.update(id,product);
    }
    //delete
    @DeleteMapping("/{id}")
    public String
    delete(@PathVariable Long id){
        boolean result= productService.delete(id);
        return result ? "Deleted successfully":"Product not found";
    }
}

