package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	// 싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴

	// 다른 클래스에서 객체생성을 하지 못하게 막는다
	private JDBCUtil() {

	}

	// 객체를 보관할 변수를 만든다
	private static JDBCUtil instance;

	// 객체를 생성해서 보관할 메서드를 만든다 - 다른 클래스에서 사용하고 싶을때 호출 할 메서드
	public static JDBCUtil getInstance() {
		if (instance == null) { // 처음 호출했을 때 만들어진 객체를 저장해서 계속 사용
			instance = new JDBCUtil();
		}
		return instance;
	}

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "PJE0118";
	private String password = "java";

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// Map<String, Object> selectOne(String sql) // selectOne : 조회되는 결과가 한 줄
	// Map<String, Object> selectOne(String sql, List<Object> param) // query 안에 물음표가 있는 거 - 물음표에 들어갈 값을 list에 넣어서 넘긴다
	// List<Map<String, Object>> selectList(String sql) // selectList : 조회되는 결과가 여러 줄
	// List<Map<String, Object>> selectList(String sql, List<Object> param)
	// int update(String sql)
	// int update(String sql, List<Object> param)
	
	public Map<String, Object> selectOne(String sql){
		HashMap<String, Object> map = null; // 데이터가 조회되지 않았을때 무엇을 리턴할 것인가
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			if(rs.next()){ // 한 줄 출력이기 때문에 if문 사용
				map = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return map;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object> param){
		HashMap<String, Object> map = null; 
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++){ 
				ps.setObject(i+1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				map = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return map;
	}
	
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				HashMap<String, Object> map = new HashMap<>(); 
				for(int i = 1; i <= columnCount; i++){
					map.put(metaData.getColumnName(i), rs.getObject(i));
				} 
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return list;
	}
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password); // 데이터베이스 연결
			
			ps = con.prepareStatement(sql);
			for(int i=0; i<param.size(); i++){ // param은 0부터 시작
				ps.setObject(i+1, param.get(i)); // ?는 1부터 시작
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				HashMap<String, Object> map = new HashMap<>(); // 한 줄의 데이터를 담기위해서 hashmap 생성
				for(int i = 1; i <= columnCount; i++){
					map.put(metaData.getColumnName(i), rs.getObject(i)); // 모든 컬럼의 데이터를 map에 넣어줌 
				} // 키 - getColumnName() 값 - getObject()
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return list;
	}
	
	public int update(String sql){
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return result;
	}
	
	public int update(String sql, List<Object> param){
		int result = 0; 
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++){ 
				ps.setObject(i+1, param.get(i));
			}
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		
		return result;
	}
}
