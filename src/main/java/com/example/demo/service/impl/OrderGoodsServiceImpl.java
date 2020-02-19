/*
package com.example.demo.service.impl;

import com.example.demo.bean.GoodsOrderVO;
import com.example.demo.mapper.OrderGoodsMapper;
import com.example.demo.service.GoodsService;
import com.example.demo.service.OrdergGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

*/
/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:30 2020/2/19
 **//*

@Service
public class OrderGoodsServiceImpl implements OrdergGoodsService {

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;


    @Override
    public GoodsOrderVO getOrderGoodsVO(String orderId) {
        GoodsOrderVO goodsOrderVO = orderGoodsMapper.getGoodsOrderVO(orderId);
        return goodsOrderVO;
    }
}
*/
