package com.lw.handler;

import com.lw.po.Product;
import com.lw.service.ProductService;
import com.lw.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author LW
 * @create 2019-11-21-14:39
 */

@Controller
@RequestMapping("/product")
public class ProductHandler {

    @Autowired
    private ProductService ps;
    @Autowired
    private StatusService ss;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        model.addAttribute("pros",ps.selectAll());
        return "select";
    }

    @RequestMapping("/selectOne")
    public String selectOne(int product_id,Model model){
        model.addAttribute("pro",ps.selectOne(product_id));
        model.addAttribute("statusList",ss.selectAll());
        return "update";

    }

    @RequestMapping("/update")
    public String update(Product product){
        ps.update(product);
        return "redirect:/product/selectAll";

    }
}
