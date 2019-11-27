package com.lw.service;

import com.lw.dao.StatusDao;
import com.lw.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LW
 * @create 2019-11-21-15:34
 */
@Service
public class StatusServiceImpl implements StatusService{

    @Resource
    private StatusDao sd;
    public List<Status> selectAll() {
        return sd.selectAll();
    }

    public Status selectOne(int id) {
        return sd.selectOne(id);
    }

    public int delete(int id) {
        return sd.delete(id);
    }

    public int insert(Status staint) {
        return sd.insert(staint);
    }

    public int update(Status status) {
        return sd.update(status);
    }
}
