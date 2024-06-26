package com.assignment.demo.services;

import com.assignment.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.demo.entity.Product;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
        System.out.println("Product saved");
    }

    public Product getProduct(int id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
        System.out.println("Product deleted with id : "+id);
    }
    public void updateProduct(Product product,int id){
        Product oldProduct=productRepository.findById(id).orElse(null);
        assert oldProduct != null;
        oldProduct.setName(product.getName());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setExpiryDate(product.getExpiryDate());

        productRepository.save(oldProduct);
        System.out.println("Product updated");
    }
}
