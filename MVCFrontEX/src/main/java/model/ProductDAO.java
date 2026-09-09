package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ProductDAO {
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;

	public ProductDAO() {
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:/comp/env");
			this.dataFactory = (DataSource) envCtx.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ProductVO> listProducts() {
		List<ProductVO> productList = new ArrayList<>();

		try {
			conn = dataFactory.getConnection();
			String query = "select * from product";
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("PRODUCTID");
				String name = rs.getString("PRODUCTNAME");
				int price = rs.getInt("PRICE");
				int stock = rs.getInt("STOCK");
				ProductVO productVO = new ProductVO(id, name, price, stock);
				productList.add(productVO);
			}

			rs.close();
			pstmt.close();
			conn.close(); // connection pool로 반환

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	public void addProduct(ProductVO p) {
		try {
			conn = dataFactory.getConnection();
			String id = p.getId();
			String name = p.getName();
			int price = p.getPrice();
			int stock = p.getStock();
			String query = "INSERT INTO product (productId, productName, price, stock)" + " VALUES(?, ? ,? ,?)";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setInt(4, stock);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ProductVO findProduct(String _id) {
		ProductVO productInfo = null;
		try {
			conn = dataFactory.getConnection();
			String query = "select * from  product where productId=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
			String id = rs.getString("PRODUCTID");
			String name = rs.getString("PRODUCTNAME");
			int price = rs.getInt("PRICE");
			int stock = rs.getInt("STOCK");
			
			productInfo = new ProductVO(id, name, price, stock);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productInfo;
	}

	public void modProduct(ProductVO productVO) {
		String id = productVO.getId();
		int price = productVO.getPrice();
		String name = productVO.getName();
		int stock = productVO.getStock();
		try {
			conn = dataFactory.getConnection();
			String query = "update product set productName=?,price=?,stock=? where productId=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.setInt(3, stock);
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delProduct(String id) {
		try {
			conn = dataFactory.getConnection();
			String query = "delete from product where productId=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
