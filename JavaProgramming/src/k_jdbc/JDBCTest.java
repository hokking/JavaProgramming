package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {

		JDBCUtil jdbc = JDBCUtil.getInstance();

		// String sql = "select * from cart where cart_no = '2005061200001'";
		// Map<String, Object> map = jdbc.selectOne(sql);
		// System.out.println(map);

		String sql = "select * from cart" + " where cart_member = ?"
				+ " and cart_qty > ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add("a001");
		param.add(5);
		Map<String, Object> map = jdbc.selectOne(sql, param);
		System.out.println(map);

//		 String sql = "select * from cart where cart_no = '2005061200001'";
//		 List<Map<String, Object>> list = jdbc.selectList(sql);
//		 for (Map<String, Object> map : list) {
//		 System.out.println(map);
//		 }

//		 String sql = "select * from cart" + " where cart_member = ?"
//		 + " and cart_qty > ?";
//		 ArrayList<Object> param = new ArrayList<>();
//		 param.add("a001");
//		 param.add(5);
//		 List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		 for (Map<String, Object> map : list) {
//		 System.out.println(map);
//		 }

		// String sql="insert into cart values(?, ?, ?, ?) ";
		// ArrayList<Object> param = new ArrayList<>();
		// param.add("c001");
		// param.add("2005061100001");
		// param.add("P302000023");
		// param.add(99);
		// System.out.println(jdbc.update(sql, param));

		// String
		// sql="update cart set cart_qty = '50' where cart_no = '2005061100001'";
		// System.out.println(jdbc.update(sql));

		// String sql = "delete from cart where cart_no = '2005061100001'";
		// System.out.println(jdbc.update(sql));

	}
}
