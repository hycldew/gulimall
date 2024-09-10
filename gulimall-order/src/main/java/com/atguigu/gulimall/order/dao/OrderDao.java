package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author young
 * @email 2044124998@qq.com
 * @date 2024-09-10 10:19:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
