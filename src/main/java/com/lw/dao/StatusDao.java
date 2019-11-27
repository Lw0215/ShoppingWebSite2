package com.lw.dao;

import com.lw.po.Status;

import java.util.List;

/**
 * @author LW;
 * @create 2019-11-21-14:54
 */
public interface StatusDao {

    List<Status> selectAll();

    Status selectOne(int id);

    int delete(int id);

    int insert(Status status);

    int update(Status status);

}
