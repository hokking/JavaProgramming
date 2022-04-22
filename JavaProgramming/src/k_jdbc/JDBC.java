package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		// Java Database Connectivity
		// - 자바와 데이터베이스를 연결해주는 라이브러리
		// - ojdbc : 오라클 JDBC

		// JDBC 작성 단계
		// 1. Connection 생성(DB 연결)
		// 2. Statement 생성(쿼리 작성)
		// 3. Query 실행
		// 4. ResultSet에서 결과 추출(select인 경우)
		// 5. ResultSet, Statement, Connection 닫기

		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PJE0118";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from member";
			ps = con.prepareCall(sql);

			// select
			rs = ps.executeQuery();

			// insert, update, delete
			// int result = ps.executeUpdate(); // 영향받은 행의 개수 리턴

			while (rs.next()) { // 다음행의 유무를 확인 있으면 true, 없으면 false 한줄한줄 바라본다
				String memId = rs.getString(1); // 첫번째 컬럼
				String memPass = rs.getString("MEM_PASS"); // 컬럼의 이름이나 순서를 넘겨주면
															// 된다

				System.out.println("MEM_ID : " + memId + " / MEM_PASS : "
						+ memPass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}

	}

}
