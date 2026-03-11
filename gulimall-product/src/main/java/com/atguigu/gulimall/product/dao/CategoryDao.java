package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author JiYucheng
 * @email qranger0906@gmail.com
 * @date 2026-03-05 19:33:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
