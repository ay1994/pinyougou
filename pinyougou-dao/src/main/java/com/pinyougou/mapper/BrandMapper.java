package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 品牌dao数据访问层
 */
public interface BrandMapper extends Mapper<TbBrand> {

    // 1.查询所有品牌
    public List<TbBrand> findAll();
}
