package com.spring_mvc.jdbc2.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private Long productId;
    private String productName;
    private BigDecimal price;
    private BigDecimal stock;

    public ProductDTO() {
    }

    public ProductDTO(Long productId, String productName, BigDecimal price, BigDecimal stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }
}
