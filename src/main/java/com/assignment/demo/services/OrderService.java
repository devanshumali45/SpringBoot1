package com.assignment.demo.services;

import com.assignment.demo.entity.Order;
import com.assignment.demo.entity.Product;
import com.assignment.demo.repository.OrderRepository;
import com.assignment.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private  OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;
//
    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
//
//    // Add methods for CRUD operations
//
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
//
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
//
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }
//
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
//
    public void updateOrder(Order order, int id){
        Order oldOrder=orderRepository.findById(id).orElse(null);

        oldOrder.setQty(order.getQty());
        oldOrder.setGrandTotal(order.getGrandTotal());
        oldOrder.setSellingPrice(order.getSellingPrice());
        oldOrder.setPurchasePrice(order.getPurchasePrice());
        System.out.println("This is new Order "+ order.getProduct());
        if(order.getProduct()!=null)
            oldOrder.setProduct(order.getProduct());
        oldOrder.setTotalAmount(order.getTotalAmount());
        orderRepository.save(oldOrder);
        System.out.println("Order updated");
    }

    public void addProductToOrder(int orderId, int productId) {
        Product product=productRepository.findById(productId).orElse(null);
        Order order=orderRepository.findById(orderId).orElse(null);

        if (product != null && isDiscountApplicable(product.getExpiryDate())) {
            // Apply discount logic
            if (order != null) {
                order.setSellingPrice(order.getSellingPrice() * 0.4); // 60% discount
            }
            assert order != null;
            order.setGrandTotal(order.getSellingPrice() * order.getQty());

            // Log discount applied
            System.out.println("Discount of 60% applied due to expiry within 10 days.");
        }

        assert order != null;
        order.setProduct(product);
        orderRepository.save(order);

    }
    private boolean isDiscountApplicable(String expiryDate) {
        try {
            // Parse the expiry date string to a Date object
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date expiry = dateFormat.parse(expiryDate);

            // Get the current date
            Date currentDate = new Date();

            // Calculate the difference in milliseconds
            long differenceInMilliseconds = expiry.getTime() - currentDate.getTime();

            // Convert milliseconds to days
            long differenceInDays = differenceInMilliseconds / (1000 * 60 * 60 * 24);

            // Check if the expiry date is within 10 days
            return differenceInDays <= 10 && differenceInDays >= 0;
        } catch (ParseException e) {
            // Handle parsing exception
            e.printStackTrace();
            return false; // Return false in case of exception
        }
    }
}

