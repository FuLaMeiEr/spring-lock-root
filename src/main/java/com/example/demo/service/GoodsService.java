package com.example.demo.service;

import com.example.demo.bean.GoodsBean;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:30 2020/2/19
 **/
public interface GoodsService {
    GoodsBean getGoodsById(String goodsId);

    void updateGoodsInventory(GoodsBean goodsBean);
}
