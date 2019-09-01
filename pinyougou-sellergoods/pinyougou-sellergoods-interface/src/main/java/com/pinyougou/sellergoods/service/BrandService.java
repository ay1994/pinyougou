package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口类
 */
public interface BrandService {

    // 1.查询所有品牌
    public List<TbBrand> findAll();
}
