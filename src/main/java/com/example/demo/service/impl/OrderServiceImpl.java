package com.example.demo.service.impl;

import com.example.demo.bean.OrderBean;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public OrderBean getOrderById(String orderId) {
        OrderBean orderBean = orderMapper.getOrderById(orderId);
        return orderBean;
    }

    @Override
    public void submitOrder(OrderBean orderBean) {

        orderMapper.submitOrder(orderBean);
    }
}
