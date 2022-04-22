package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		// Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		// Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		// Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		// Set keySet() : 저장된 모든 키를 Set으로 반환한다.

		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());

		System.out.println(map);

		map.put("name", "이순신"); // 같은 키로 다시 저장하면 수정 가능, 하나의 키에 하나의 값만 저장할 수 있음

		System.out.println(map);

		map.remove("age");

		System.out.println(map);

		Object value = map.get("name");
		System.out.println(value);

		System.out.println(((String) value).substring(0, 1));

		String str = (String) map.get("name");

		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}

		// JOBS 테이블
		ArrayList<HashMap<String, Object>> jobs = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> job = new HashMap<>();
		job.put("JOB_ID", "AD_PRES");
		job.put("JOB_TITLE", "President");
		job.put("MIN_SALARY", 20080);
		job.put("MAX_SALARY", 40000);
		jobs.add(job);

		job = new HashMap<>();
		job.put("JOB_ID", "AD_VP");
		job.put("JOB_TITLE", "Administration Vice President");
		job.put("MIN_SALARY", 15000);
		job.put("MAX_SALARY", 30000);
		jobs.add(job);

		System.out.println(jobs);

		// LPROD 테이블
		ArrayList<HashMap<String, Object>> lprods = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> lprod = new HashMap<>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		lprods.add(lprod);

		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		lprods.add(lprod);

		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P201");
		lprod.put("LPROD_NM", "여성캐주얼");
		lprods.add(lprod);

		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 4);
		lprod.put("LPROD_GU", "P202");
		lprod.put("LPROD_NM", "남성캐주얼");
		lprods.add(lprod);

		Set<String> lprodkey = lprod.keySet();
		for (String key : lprodkey) {
			System.out.print(key+"\t");
		}
		for (int i = 0; i < lprods.size(); i++) {
			System.out.println();
			for (String key : lprodkey) {
				System.out.print(lprods.get(i).get(key)+"\t\t");
			}

		}

	}

}
