package com.lw.service;

import com.lw.dao.ProductDao;
import com.lw.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LW
 * @create 2019-11-21-15:32
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Resource
    private ProductDao pd;


    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int id) {
        return pd.selectOne(id);
    }

    public int delete(int id) {
        return pd.delete(id);
    }

    public int inser(Product pro) {
        return pd.insert(pro);
    }

    public int update(Product product) {
        return pd.update(product);
    }
}
