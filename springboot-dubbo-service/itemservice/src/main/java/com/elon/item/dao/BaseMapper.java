package com.elon.item.dao;

/**
 * @author 徐贵平
 * @time 2018年05月10日
 * @since JDK1.7
 **/
public interface BaseMapper<T, K> {

    void add(T t);

    void delete(K k);

    void update(T t);

    T query(K k);
}
