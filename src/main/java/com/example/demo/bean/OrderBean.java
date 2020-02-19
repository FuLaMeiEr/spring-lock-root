package com.example.demo.bean;

import com.sun.javafx.beans.IDProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@ApiModel(description = "订单实体类")
public class OrderBean implements Serializable {


    private int orderId;

    //private String createTime;

    private int orderPrice;

    private String orderType;

    private String goodsId;

    private int goodNumber;

    //private List<GoodsBean> goodsBeanList;




}
