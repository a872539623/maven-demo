package com.smart.maven.dao;

import com.smart.maven.entity.TFilm;

import java.util.List;

/**
 *
 */
public interface BaseDao<T> {
    int insert(T t);

    T select(String id, T t);

    List<T> selectList(int page, int size);
    /**
     * Dao
     * 增
     * 删
     * 改
     * 查
     *
     * @param args
     */


}
