package com.elon.item.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.elon.item.api.ItemService;
import com.elon.item.dao.ItemMapper;
import com.elon.item.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 徐贵平
 * @time 2018年05月10日
 * @since JDK1.7
 **/
//dubbo必须制定对应的接口,否则dubbo代理就是void.class
@Service(version = "1.0.0")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public void add(Item item) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void update(Item item) {

    }

    @Override
    public Item query(Integer k) {
        Item item = itemMapper.query(k);
        System.out.println("222"+com.alibaba.fastjson.JSON.toJSONString(item));
        return item;
    }
}
