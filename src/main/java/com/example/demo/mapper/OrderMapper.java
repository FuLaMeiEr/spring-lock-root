package com.example.demo.mapper;

import com.example.demo.bean.OrderBean;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    OrderBean getOrderById(String orderId);

    void submitOrder(OrderBean orderBean);
}
