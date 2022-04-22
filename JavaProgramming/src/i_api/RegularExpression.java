package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		// 정규표현식 : 문자열의 패턴을 검사하는 표현식
		// ^	뒷문자로 시작
		// $	앞문자로 종료
		// .	임의의 문자(줄바꿈 제외)
		// * 	앞문자가 0개 이상
		// + 	앞문자가 1개 이상
		// ? 	앞문자가 없거나 1개
		// [] 	문자의 집합이나 범위([a-z]:a부터 z까지, [^a-z]:a부터 z가 아닌 것)
		// {} 	앞문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하)
		// () 	그룹화(1개의 문자처럼 인식)
		// | 	OR연산
		// \s 	공백, 탭, 줄바꿈
		// \S 	공백, 탭, 줄바꿈이나 아닌 문자
		// \w 	알파벳이나 숫자
		// \W 	알파벳이나 숫자가 아닌 문자
		// \d 	숫자
		// \D 	숫자가 아닌 문자
		// (?i)	뒷 문자의 대소문자 구분 안함
		// \ 	정규표현식에서 사용되는 특수문자 표현
		
		String str = "abc123";
		// String regex = "[a-z]{3}[0-9]{1,3}"; // 정규표현식 사이에 공백이 들어가면 안된다.
		// String regex = "[a-z0-9]+"; // a-z 0-9 까지 하나가 나온다.
		String regex = "\\w*"; // 알파벳이나 숫자가 0개 이상 나온다.
		// 정규표현식은 범위가 좁은 것이 좋다. 원하는 패턴만 통과할 수 있도록 만드는 것이 중요.

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		// 아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		String id = "[a-z0-9-_]{5,20}";
		String phoneNumber = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		String email = "[a-z0-9-_]{5,20}@+\\w+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		
	
		
		
	}
}
