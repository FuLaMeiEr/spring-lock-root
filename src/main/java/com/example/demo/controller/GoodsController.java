package com.example.demo.controller;

import com.example.demo.bean.GoodsBean;
import com.example.demo.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName
 * @Description
 * @Author WangHaiQiang
 * @Date Created in 20:57 2020/2/18
 **/
@Api(tags = "商品接口")
@Controller
public class GoodsController {


    @Autowired
    private GoodsService goodsService;


    @ApiOperation("查询商品详细信息")
    @GetMapping("/getGoods")
    @ResponseBody
    public GoodsBean getGoodsById(@ApiParam(required = true, name = "goodsId", value = "商品编号", type = "string")
                                  @RequestParam(value = "goodsId", required = true) String goodsId) {

        GoodsBean goodsBean = goodsService.getGoodsById(goodsId);

        return goodsBean;
    }


}
