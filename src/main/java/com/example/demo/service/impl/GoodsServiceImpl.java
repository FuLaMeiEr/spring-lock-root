package com.example.demo.service.impl;

import com.example.demo.bean.GoodsBean;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 15:30 2020/2/19
 **/
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public GoodsBean getGoodsById(String goodsId) {
        GoodsBean goodsBean = goodsMapper.getGoodsById(goodsId);
        return goodsBean;
    }

    @Override
    public void updateGoodsInventory(GoodsBean goodsBean) {
        goodsMapper.updateGoodsInventory(goodsBean);
    }
}
