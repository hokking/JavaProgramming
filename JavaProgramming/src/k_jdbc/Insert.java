package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PJE0118";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			con=DriverManager.getConnection(url, user, password);
			
			String sql="insert into cart values(?, ?, ?, ?) ";
			ps=con.prepareStatement(sql);
			ps.setString(1, "c001");
			ps.setString(2, "2005061200001");
			ps.setString(3, "P302000023");
			ps.setInt(4, 2);
			
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
