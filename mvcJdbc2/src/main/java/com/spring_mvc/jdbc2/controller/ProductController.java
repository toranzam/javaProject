package com.spring_mvc.jdbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring_mvc.jdbc2.model.ProductDAO;

@Controller
public class ProductController {
    private final ProductDAO productDAO;

    @Autowired
    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewIndex() {
        return "index";
    }

    @RequestMapping(value = "/product/productSelect", method = RequestMethod.GET)
    public String selectProduct(Model model) {
        model.addAttribute("prdList", productDAO.productSelect());
        return "product/productListView";
    }
}
