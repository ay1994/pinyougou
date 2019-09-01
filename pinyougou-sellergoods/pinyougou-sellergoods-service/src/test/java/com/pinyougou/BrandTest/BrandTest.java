package com.pinyougou.BrandTest;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.impl.BrandServiceImpl;

import java.util.List;

/**
 * 品牌访问数据测试
 */
public class BrandTest {

    public static void main(String[] args) {
        BrandServiceImpl brandService = new BrandServiceImpl();
        List<TbBrand> brandList = brandService.findAll();
        System.out.println(brandList);
    }
}
