package com.lw.dao;

import com.lw.po.Product;

import java.util.List;

/**
 * @author LW
 * @create 2019-11-21-14:39
 */
public interface ProductDao {
    /**
     * 查询前部
     * @return
     */
    List<Product> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Product selectOne(int id);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 添加信息
     * @param pro
     * @return
     */
    int insert(Product pro);

    /**
     * 修改信息
     * @param id
     * @return
     */
    int update(Product product);
}

