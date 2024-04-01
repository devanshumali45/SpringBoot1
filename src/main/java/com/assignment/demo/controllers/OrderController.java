package com.assignment.demo.controllers;

import com.assignment.demo.entity.Order;
import com.assignment.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

//    private final OrderService orderService;
//
//    @Autowired
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    // Add a single order
//    @PostMapping("/addOrder")
//    public void addOrder(@RequestBody Order order) {
//        orderService.saveOrder(order);
//    }
//
////    // Add multiple orders
////    @PostMapping("/addOrders")
////    public void addOrders(@RequestBody List<Order> orders) {
////        orderService.saveOrders(orders);
////    }
//
//    // Get a single order
//    @GetMapping("/getOrder/{id}")
//    public ResponseEntity<Order> getOrder(@PathVariable int id) {
//        Order order = orderService.getOrderById(id);
//        if (order != null) {
//            return new ResponseEntity<>(order, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Get all orders
//    @GetMapping("/getOrders")
//    public List<Order> getOrders() {
//        return orderService.getAllOrders();
//    }
//
//    // Update an order
//    @PutMapping("/updateOrder/{id}")
//    public void updateOrder(@RequestBody Order order, @PathVariable int id) {
//        orderService.updateOrder(order, id);
//    }
//
//    // Delete an order
//    @DeleteMapping("/deleteOrder/{id}")
//    public void deleteOrder(@PathVariable int id) {
//        orderService.deleteOrder(id);
//    }
}

