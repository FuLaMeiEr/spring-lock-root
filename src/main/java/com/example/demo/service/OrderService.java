package com.example.demo.service;

import com.example.demo.bean.OrderBean;

public interface OrderService {
    OrderBean getOrderById(String orderId);

    void submitOrder(OrderBean orderBean);
}
