package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌类控制器
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    // 注入品牌接口对象
    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}
