package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author young
 * @email 2044124998@qq.com
 * @date 2024-09-08 14:33:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
