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
public class MasterOrderList {

        
    ArrayList<Order>orderList;
    
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public MasterOrderList() {
        this.orderList= new ArrayList<>();
    }
    
    public void addNewOrder(Order o){
        this.orderList.add(o);
    }
    
    
    
}
