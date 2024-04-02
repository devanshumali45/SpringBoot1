package com.assignment.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="qty")
    private int qty;

    @Column(name="selling_price")
    private double sellingPrice;

    @Column(name="purchase_price")
    private double purchasePrice;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name="grand_total")
    private double grandTotal;

    @OneToOne
    private Product product;

    public Order() {
    }

    public Order(int id, int qty, double sellingPrice, double purchasePrice, double totalAmount, double grandTotal) {
        this.id = id;
        this.qty = qty;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.totalAmount = totalAmount;
        this.grandTotal = grandTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", qty=" + qty +
                ", sellingPrice=" + sellingPrice +
                ", purchasePrice=" + purchasePrice +
                ", totalAmount=" + totalAmount +
                ", grandTotal=" + grandTotal +
                ", products=" + product +
                '}';
    }
}
