package com.ra.productdemo.service;
import com.ra.productdemo.entity.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product>
            productList = new ArrayList<>();
    private Long nextId = 1L;

    //get
    public List<Product> getAll() {
        return productList;
    }

    //post
    public Product add(Product product) {
        product.setId(nextId++);
        productList.add(product);
        return product;
    }
    //put
    public Product update(Long id, Product newProduct){
        Optional<Product>
                optional =productList.stream().filter(p ->p.getId().equals(id)).findFirst();
        if (optional.isPresent()){
            Product product=optional.get();
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
            return  product;
        }
        return null;
    }
    //delete
    public boolean delete(Long id){
        return
                productList.removeIf(product -> product.getId().equals(id));
    }
}
