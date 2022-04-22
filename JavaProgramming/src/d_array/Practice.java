package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// int[] arr = { 10, 20, 30, 40, 50 };
		// int sum = 0;
		//
		// for (int i = 0; i < arr.length; i++) {
		// sum += arr[i];
		// }
		// System.out.println("sum= " + sum);
		//
		// int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 },
		// { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		// int total = 0;
		// float average = 0;
		//
		// for (int i = 0; i < arr2.length; i++) {
		// for (int j = 0; j < arr2[i].length; j++) {
		// total += arr2[i][j];
		//
		// }
		// average = (float) total / (arr2.length * arr2[i].length);
		// }
		// System.out.println("total= " + total);
		// System.out.println("average= " + average);

		// int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int[] ball3 = new int[3];
		// // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
		// for (int i = 0; i < ballArr.length; i++) {
		// int j = (int) (Math.random() * ballArr.length);
		// int tmp = 0;
		//
		// tmp = ballArr[i];
		// ballArr[i] = ballArr[j];
		// ballArr[j] = tmp;
		// }
		//
		// System.out.println(Arrays.toString(ballArr));
		// // 배열 ballArr의 앞에서 3개의 수를 ball3 배열 로 복사한다
		//
		// for (int i = 0; i < 3; i++) {
		// ball3[i] = ballArr[i];
		// }
		//
		// for (int i = 0; i < ball3.length; i++) {
		// System.out.print(ball3[i]);
		// }

		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다

		// Scanner sc = new Scanner(System.in);
		// System.out.println("money=");
		// int money = Integer.parseInt(sc.nextLine());
		//
		// int[] coinUnit = { 500, 100, 50, 10 };
		// int[] coin = { 5, 5, 5, 5 };
		//
		// for (int i = 0; i < coinUnit.length; i++) {
		// int coinNum = 0;
		// coinNum = money / coinUnit[i];
		// if (coin[i] - coinNum < 0) {
		// coinNum = 5;
		// money -= (coinUnit[i] * coinNum);
		// } else {
		// money %= coinUnit[i];
		// }
		// coin[i] -= coinNum;
		// System.out.println(coinUnit[i] + "원: " + coinNum);
		// }
		//
		// if (money > 0) {
		// System.out.println("거스름돈이 부족합니다.");
		// } else {
		// System.out.println("=남은 동전의 개수=");
		// for (int i = 0; i < coinUnit.length; i++) {
		// System.out.println(coinUnit[i] + "원: " + coin[i]);
		// }
		// }

		// int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		// int[] counter = new int[4];
		// for (int i = 0; i < counter.length; i++) {
		// for (int j = 0; j < answer.length; j++) {
		// if (answer[j] == i + 1) {
		// counter[i]++;
		// }
		// }
		// }
		// System.out.println(Arrays.toString(counter));
		// for (int i = 0; i < counter.length; i++) {
		// System.out.print(counter[i]);
		// for (int j = 0; j < counter[i]; j++)
		// System.out.print("*");
		// System.out.println();
		// }
		//
		// char[][] star = { { '*', '*', ' ', ' ', ' ' },
		// { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
		// { '*', '*', '*', '*', '*' } };
		// char[][] result = new char[star[0].length][star.length];
		// for (int i = 0; i < star.length; i++) {
		// for (int j = 0; j < star[i].length; j++) {
		// System.out.print(star[i][j]);
		// }
		// System.out.println();
		// }
		// System.out.println();
		// for (int i = 0; i < star.length; i++) {
		// for (int j = 0; j < star[i].length; j++) {
		//
		// int x=j;
		// int y=star.length-1-i;
		//
		// result[x][y]=star[i][j];
		// }
		// }
		// for (int i = 0; i < result.length; i++) {
		// for (int j = 0; j < result[i].length; j++) {
		// System.out.print(result[i][j]);
		// }
		// System.out.println();
		// }

		// char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
		// '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
		// ':', ',', '.', '/' };
		// // 0 1 2 3 4 5 6 7 8 9
		// char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'
		// };
		// String src = "abc123";
		// String result = "";
		// // src 문자열의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		// for (int i = 0; i < src.length(); i++) {
		// char ch = src.charAt(i);
		// if ('a' <= ch && ch <= 'z') {
		// result += abcCode[ch - 'a'];
		// } else if ('0' <= ch && ch <= '9') {
		// result += numCode[ch - '0'];
		// }
		// }
		// System.out.println("src:" + src);
		// System.out.println("result:" + result);

		// int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 },
		// { 40, 40, 40 }, { 50, 50, 50 } };
		// int[][] result = new int[score.length + 1][score[0].length + 1];
		// for (int i = 0; i < score.length; i++) {
		// for (int j = 0; j < score[i].length; j++) {
		// result[i][j] = score[i][j];
		// result[i][score[i].length] += score[i][j];
		// result[score.length][j] += score[i][j];
		// result[score.length][score[i].length] += score[i][j];
		// }
		//
		// }
		// for (int i = 0; i < result.length; i++) {
		// for (int j = 0; j < result[i].length; j++) {
		// System.out.printf("%4d", result[i][j]);
		// }
		// System.out.println();
		// }

		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환  
			for(int j=0; j<question.length; j++){
				int shuffle=(int)(Math.random()*3);
				char temp;
				temp=question[j];
				question[j]=question[shuffle];
				question[shuffle]=temp;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(
					question));
			String answer = scanner.nextLine();
			// trim()으로 answer의 좌우 공백을 제거한 후 equals로 word[i]와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf(" 맞았습니다.%n%n");
			else
				System.out.printf(" 틀렸습니다.%n%n");
		}

	}

}
