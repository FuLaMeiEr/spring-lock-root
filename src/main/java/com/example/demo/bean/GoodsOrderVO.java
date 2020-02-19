package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 16:06 2020/2/19
 **/
@Data
@ApiModel(description = "订单商品关联表")
public class GoodsOrderVO implements Serializable {

    private int id;

    private String orderId;

    private String goodsId;

}
