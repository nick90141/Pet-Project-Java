package com.example.pet_project.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "orderDetails")
public class OrderDetail {
    @Id
    @Column(name = "orderDetailId")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderDetailId;

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    @NotNull
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    @NotNull
    private Product product;

    @Column (name = "quantity")
    @NotNull
    private int quantity;

    @Column (name = "price")
    @NotNull
    private double price;

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
