/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author yashwanth
 */
public class Order {
    
    ArrayList<OrderItem>orderItems;

    public Order() {
        
        this.orderItems= new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    public void addNewOrderItem(Product p, double price, int quantity){
        OrderItem newOrderItem = new OrderItem(p,price,quantity);
        orderItems.add(newOrderItem);
    }
    
    
    public OrderItem findProduct(Product p){
        for(OrderItem o: orderItems){
            if(o.getProduct()==p){
                return o;
            }
        }
        return null;
    }
    
    public void deleteItem(OrderItem p){
        this.orderItems.remove(p);
    }
    
    
    
    
}
