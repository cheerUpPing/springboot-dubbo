package com.elon.item.dao;

import com.elon.item.entity.Item;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 徐贵平
 * @time 2018年05月10日
 * @since JDK1.7
 **/
@Mapper
public interface ItemMapper extends BaseMapper<Item, Integer>{

}
