package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {

		// ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		// 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.

		// 등록 - 번호, 제목, 내용, 작성자, 작성일

		// 목록에서는 조회, 등록, 종료
		// 상세화면에서는 수정, 삭제, 목록

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> map = new HashMap<>();
		int num = 0;

		while (true) {

			System.out.println("================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("--------------------------------");
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.println(list.get(i).get("번호") + "\t"
						+ list.get(i).get("제목") + "\t" + list.get(i).get("작성자")
						+ "\t" + list.get(i).get("작성일"));
			}
			System.out.println("================================");
			System.out.print("조회(1) 등록(2) 종료(0) > ");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				System.out.print("조회할 번호를 입력하세요 > ");
				int input2 = ScanUtil.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if ((int) list.get(i).get("번호") == input2) {
						System.out.println("제목 : " + list.get(i).get("제목"));
						System.out.println("내용 : " + list.get(i).get("내용"));
						System.out.println("작성자 : " + list.get(i).get("작성자"));
						System.out.println("작성일 : " + list.get(i).get("작성일"));
					}
				}
				System.out.print("수정(1) 삭제(2) 목록(0) > ");
				int input3 = ScanUtil.nextInt();
				switch (input3) {
				case 1:
					for (int i = 0; i < list.size(); i++) {
						if ((int) list.get(i).get("번호") == input2) {
							System.out.print("제목 : ");
							String title = ScanUtil.nextLine();
							list.get(i).put("제목", title);
							System.out.print("내용 : ");
							String content = ScanUtil.nextLine();
							list.get(i).put("내용", content);
							System.out.println("수정되었습니다.");
						}
					}
					break;
				case 2:
					System.out.print("삭제하시겠습니까?(Y|N) ");
					String input4 = ScanUtil.nextLine();
					if (input4.equals("Y")) {
						for (int i = 0; i < list.size(); i++) {
							if ((int) list.get(i).get("번호") == input2) {
								list.remove(i);
							}
						}
						System.out.println("삭제되었습니다.");
					}
					break;
				case 0:
					break;
				}
				break;
			case 2:
				map = new HashMap<>();
				num++;
				map.put("번호", num);
				System.out.print("제목 : ");
				String title = ScanUtil.nextLine();
				map.put("제목", title);
				System.out.print("내용 : ");
				String content = ScanUtil.nextLine();
				map.put("내용", content);
				System.out.print("작성자 : ");
				String user = ScanUtil.nextLine();
				map.put("작성자", user);
				map.put("작성일", format.format(date));
				list.add(map);
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}

	}

}
