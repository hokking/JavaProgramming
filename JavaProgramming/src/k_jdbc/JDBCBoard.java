package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCBoard {
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public static void main(String[] args) {

		new JDBCBoard().start();
	}

	void start() {
		while (true) {
			String sql = "SELECT BOARD_NO, TITLE, USER_ID, TO_CHAR(REG_DATE,'MM/DD') AS REG_DATE FROM TB_JDBC_BOARD ORDER BY BOARD_NO DESC";
			List<Map<String, Object>> boardList = jdbc.selectList(sql);

			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------");
			for (Map<String, Object> board : boardList) {
				System.out.println(board.get("BOARD_NO") + "\t"
						+ board.get("TITLE") + "\t" + board.get("USER_ID")
						+ "\t" + board.get("REG_DATE"));
			}
			System.out.println("=================================");

			System.out.print("1.조회  2.등록  0.종료> ");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	void read(){
		System.out.print("조회할 번호를 입력하세요> ");
		int see = ScanUtil.nextInt();
		String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, TO_CHAR(REG_DATE,'MM/DD') AS REG_DATE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add(see);
		Map<String, Object> board = jdbc.selectOne(sql, param);
		System.out.println("제목 : " + board.get("TITLE"));
		System.out.println("내용 : " + board.get("CONTENT"));
		System.out.println("작성자 : " + board.get("USER_ID"));
		System.out.println("작성일 : " + board.get("REG_DATE"));

		System.out.print("1.수정  2.삭제  0.목록>");
		int input2 = ScanUtil.nextInt();
		switch (input2) {
		case 1:
			update(see);
			break;
		case 2:
			delete(see);
			break;
		case 0:
			break;
		}
	}
	
	void update(int see){
		System.out.println("제목 : ");
		String title2 = ScanUtil.nextLine();
		System.out.println("내용 : ");
		String content2 = ScanUtil.nextLine();

		String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ? WHERE BOARD_NO = ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add(title2);
		param.add(content2);
		param.add(see);
		if (0 < jdbc.update(sql, param)) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("수정되지 않았습니다.");
		}
		// if (((BigDecimal) board.get("BOARD_NO")).intValue() == 1)
		// {
		// }
	}
	
	void delete(int see){
		System.out.print("삭제하시겠습니까?(Y|N)> ");
		if (ScanUtil.nextLine().equals("Y")) {
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ArrayList<Object> param = new ArrayList<>();
			param.add(see);
			if (0 < jdbc.update(sql, param)) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("삭제되지 않았습니다.");
			}
		}
	}
	
	void insert(){
		System.out.print("제목 : ");
		String title = ScanUtil.nextLine();
		System.out.print("내용 : ");
		String content = ScanUtil.nextLine();
		System.out.print("id : ");
		String id = ScanUtil.nextLine();

		String sql = "INSERT INTO TB_JDBC_BOARD VALUES((SELECT NVL(MAX(BOARD_NO),0)+1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE) ";
		ArrayList<Object> param = new ArrayList<>();
		param.add(title);
		param.add(content);
		param.add(id);
		if (0 < jdbc.update(sql, param)) {
			System.out.println("글이 등록되었습니다.");
		} else {
			System.out.println("등록을 실패하였습니다");
		}
	}
}
