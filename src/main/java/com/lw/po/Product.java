package com.lw.po;

import lombok.Data;

/**
 * @author LW
 * @create 2019-11-21-14:38
 */
@Data
public class Product {
    private int productid;
    private String productname;
    private String productsum;
    private int productprice;
    private Status status_id;


}
