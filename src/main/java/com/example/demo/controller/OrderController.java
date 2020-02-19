package com.example.demo.controller;


import com.example.demo.bean.GoodsBean;
import com.example.demo.bean.OrderBean;
import com.example.demo.service.GoodsService;
import com.example.demo.service.OrderService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Api(tags = "订单接口")
@Controller
@RequestMapping("/lock")
public class OrderController {


    @Autowired
    private OrderService orderService;

/*    @Autowired
    private OrdergGoodsService ordergGoodsService;*/

    @Autowired
    private GoodsService goodsService;


    @ApiOperation("根据条件获取订单")
    @GetMapping("/getOrder")
    @ResponseBody
    public OrderBean getOrderById(@ApiParam(required = true, name = "orderId", value = "订单ID", type = "string")
                                  @RequestParam(value = "orderId") String orderId) {
        OrderBean orderBean = orderService.getOrderById(orderId);
        return orderBean;
    }


    @ApiOperation("提交订单")
    @PutMapping("/submitOrder")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", dataType = "int", value = "订单ID"),
            @ApiImplicitParam(name = "orderType", dataType = "String", value = "订单类型"),
            @ApiImplicitParam(name = "goodId", dataType = "String", value = "商品ID"),
            @ApiImplicitParam(name = "goodNumber", dataType = "int", value = "商品数量")
    })
    public void submitOrder(
            @RequestParam(value = "orderId",required = true) int orderId,
            @RequestParam(value = "orderType",required = false) String orderType,
            @RequestParam(value = "goodId",required = true) String goodId,
            @RequestParam(value = "goodNumber",required = true) int goodNumber) {

        OrderBean orderBean = new OrderBean();
        orderBean.setOrderId(orderId);
        orderBean.setOrderType(orderType);
        GoodsBean goodsBean = goodsService.getGoodsById(goodId);
        if (goodNumber> goodsBean.getInventory()) {
            goodsBean.setInventory(goodsBean.getInventory()- goodNumber);
            goodsService.updateGoodsInventory(goodsBean);


            orderBean.setGoodsId(goodId);
            orderBean.setOrderPrice(goodNumber * goodsBean.getPrice() );
            orderBean.setGoodNumber(goodNumber);
            orderService.submitOrder(orderBean);
        }


    }


    public void myThreadPool() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i <= 10; i++) {
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    //submitOrder();
                }
            });

        }

    }
}

