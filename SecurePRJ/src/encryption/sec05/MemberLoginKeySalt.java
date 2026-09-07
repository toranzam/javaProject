package encryption.sec05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberLoginKeySalt {

	public static void main(String[] args) {
		DBConn dbCon = new DBConn();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;

		ResultSet rs = null; // select 구문

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("ID 입력 : ");
			String memID = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			String memPass = sc.nextLine();
			System.out.println(memPass);

			// select 쿼리문 작성 - 취약한 페이지
			String sql = "select * from member where memID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memID);
			rs = pstmt.executeQuery();

			// 회원가입시 중복 아이디는 허용하지 않음
			// 위 쿼리의 결과는 레코드가 1개거나 아니면 없거나
			if (rs.next()) {
				String salt = rs.getString("salt");

				for (int i = 0; i < 10; i++) {
					memPass = MemberJoinKeySalt2.sha256(memPass, salt);
				}

				String dbPass = rs.getString("memPWD");

				if (memPass.equals(dbPass)) {
					System.out.println("로그인 되었습니다");

				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("로그인 실패");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
