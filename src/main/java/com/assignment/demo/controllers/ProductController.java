package com.assignment.demo.controllers;

import com.assignment.demo.entity.Product;
import com.assignment.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
//    @Autowired
//    private ProductServices productServices;
//
//    // to add single product
//    @PostMapping("/addProduct")
//    public void addProduct(@RequestBody Product product){
//         productServices.saveProduct(product);
//    }
//
//
//    // to add multiple products
//    @PostMapping("/addProducts")
//    public void addProducts(@RequestBody List<Product> products){
//        productServices.saveProducts(products);
//    }
//
//
//    // to get a single product
//    @GetMapping("/getProduct/{id}")
//    public Product getProduct(@PathVariable int id){
//        return productServices.getProduct(id);
//    }
//
//    // to get all products
//    @GetMapping("/getProducts")
//    public List<Product> getProducts(){
//        return productServices.getProducts();
//    }
//
//    // update a product
//    @PutMapping("/updateProduct/{id}")
//    public void updateProduct(@RequestBody Product product, @PathVariable int id){
//        productServices.updateProduct(product,id);
//    }
//
//    // deleting a product
//    @DeleteMapping("/deleteProduct/{id}")
//    public void deleteProduct(@PathVariable int id){
//        productServices.deleteProduct(id);
//    }
}
