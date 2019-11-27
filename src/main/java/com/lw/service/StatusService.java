package com.lw.service;

import com.lw.po.Status;

import java.util.List;

/**
 * @author LW
 * @create 2019-11-21-15:31
 */
public interface StatusService {
    List<Status> selectAll();

    Status selectOne(int id);

    int delete(int id);

    int insert(Status staint);

    int update(int id);
}
