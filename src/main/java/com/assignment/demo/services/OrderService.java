package com.assignment.demo.services;

import com.assignment.demo.entity.Order;
import com.assignment.demo.entity.Product;
import com.assignment.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

//    private final OrderRepository orderRepository;
//
//    @Autowired
//    public OrderService(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    // Add methods for CRUD operations
//
//    public Order saveOrder(Order order) {
//        return orderRepository.save(order);
//    }
//
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    public Order getOrderById(int id) {
//        return orderRepository.findById(id).orElse(null);
//    }
//
//    public void deleteOrder(int id) {
//        orderRepository.deleteById(id);
//    }
//
//    public void updateOrder(Order order, int id){
//        Order oldOrder=orderRepository.findById(id).orElse(null);
//
//
//        orderRepository.save(oldOrder);
//        System.out.println("Order updated");
//    }
}

