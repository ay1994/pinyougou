package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class BrandMapperTest {

    // 1.注入dao对象
    @Autowired
    private BrandMapper brandMapper;

    // 测试dao的方法
    @Test
    public void findAll(){
        List<TbBrand> brandList = brandMapper.findAll();
        for (TbBrand tbBrand : brandList) {
            System.out.println(tbBrand);
        }
    }
}
