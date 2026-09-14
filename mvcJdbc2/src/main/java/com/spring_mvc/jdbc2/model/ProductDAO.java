package com.spring_mvc.jdbc2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring_mvc.jdbc2.dto.ProductDTO;

@Repository
public class ProductDAO {
    private final DataSource dataSource;

    @Autowired
    public ProductDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ArrayList<ProductDTO> productSelect() {
        ArrayList<ProductDTO> prdList = new ArrayList<ProductDTO>();
        String sql = "SELECT productId, productName, price, stock FROM product ORDER BY productId";
       
        try (Connection con = dataSource.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ProductDTO dto = new ProductDTO();
                dto.setProductId(rs.getLong("productId"));
                dto.setProductName(rs.getString("productName"));
                dto.setPrice(rs.getBigDecimal("price"));
                dto.setStock(rs.getBigDecimal("stock"));
                prdList.add(dto);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("상품 목록 조회에 실패했습니다.", e);
        }
        return prdList;
    }
}
