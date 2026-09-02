package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Util;


public class ProductDAO {

	public ArrayList<ProductDTO> productSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ProductDTO> memList = new ArrayList<ProductDTO>();

		try {
			con = Util.getConn();
			String query = "select * from product";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 1개의 레코드(resultset)를 처리 -> rs에서 추출해서 memberVO에 저장하고 arraylist에 추가
				String id = rs.getString("productId");
				String name = rs.getString("productName");
				int price = rs.getInt("price");
				int stock = rs.getInt("stock");
				

				ProductDTO dto = new ProductDTO();
				dto.setId(id);
				dto.setName(name);
				dto.setPrice(price);
				dto.setStock(stock);
				memList.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return memList;

	}

}
