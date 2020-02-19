package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(description = "商品实体类")
public class GoodsBean implements Serializable {

    private String goodsId;

    private String name;

    private int price;

    private int inventory;

    //private int needNumber;

    //private List<OrderBean> orderBeanList;

}
