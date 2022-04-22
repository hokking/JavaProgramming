package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PJE0118";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			con=DriverManager.getConnection(url, user, password);
			
			String sql="update cart set cart_no = '2005061200001' where cart_no = '2005061100001'";
			ps=con.prepareStatement(sql);
			
			int result = ps.executeUpdate();
			System.out.println(result);
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
	}

}
