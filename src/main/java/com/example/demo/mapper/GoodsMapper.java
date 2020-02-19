package com.example.demo.mapper;

import com.example.demo.bean.GoodsBean;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {
    GoodsBean getGoodsById(String goodsId);

    void updateGoodsInventory(GoodsBean goodsBean);
}
