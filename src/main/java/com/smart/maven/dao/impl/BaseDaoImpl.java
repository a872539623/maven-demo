package com.smart.maven.dao.impl;

import com.smart.maven.dao.BaseDao;
import com.smart.maven.dao.Col;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @param <T>
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    /**
     * select * from 表名
     * <p>
     * entity
     * 类名对应表名
     * 属性对应列名
     * 列名 跟属性名不一样的时候
     * 通过注解解决
     * 通过配置文件的方式
     * cloun name    propptry username
     *
     * @param id
     * @return
     */
    @Override
    public T select(String id, T t) {
        //表名不能写死  需要动态获取
        // 列名不能写死 需要动态的获取
        Class<?> clz = t.getClass();
        StringBuffer sql = new StringBuffer("SELECT ");
        // select id,name,
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            // 获取属性的名称
            String name = null;
            Col annotation = field.getAnnotation(Col.class);
            if (annotation != null && !annotation.value().equals("")) {
                name = annotation.value();
            } else {
                name = field.getName();
            }
            sql.append(name).append(",");
        }
        return null;
    }

    @Override
    public int insert(T t) {
        return 0;
    }

    @Override
    public List<T> selectList(int page, int size) {
        return null;
    }
}
