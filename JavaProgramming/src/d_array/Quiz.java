package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

		// int money = (int) (Math.random() * 500) * 10;
		// int[] coin = { 500, 100, 50, 10 };
		//
		// System.out.println("거스름돈 : " + money);

		// 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요

		//
		// for(int i=0; i<coin.length; i++){
		//
		// int count=money/coin[i];
		// money=money%coin[i];
		// System.out.println(coin[i] + "원 : "+count+"개");
		// }

		// int[] arr = new int[20];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = (int) (Math.random() * 5) + 1;
		// }
		// System.out.println(Arrays.toString(arr));

		// 1~5의 숫자가 발생횐 횟수만큼 *을 사용해 그래프를 그려주세요.
		// int[] count = new int[5];

		// for(int i=0; i<arr.length; i++){
		// count[arr[i]-1]++;
		// }

		// for (int i = 0; i < count.length; i++) {
		// count[i] = 0;
		// System.out.print(i + 1 + ": ");
		// for (int j = 0; j < arr.length; j++) {
		// if (i + 1 == arr[j])
		// count[i]++;
		// }
		// for (int j = 0; j < count[i]; j++) {
		// System.out.print("*");
		// }
		// System.out.println(" " + count[i]);
		// }

		// 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

		int[] check = new int[5];
		int count = 0;
		

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true;

			for (int j = 0; j < check.length; j++) {
				if (arr[i] == check[j]) {
					flag = false;
					
				}
			}
			if (flag) {
				check[count++] = arr[i];
			}
		}
		int[] res = new int[count];
		for (int i = 0; i < count; i++) {
			res[i] = check[i];
		}

		System.out.println(Arrays.toString(res));

	}
}
