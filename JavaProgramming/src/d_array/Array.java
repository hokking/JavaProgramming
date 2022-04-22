package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// 배열
		// - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		// - 참조형 타입이다.
		// - 인덱스로 값을 구분한다.
		// - 길이를 변경할 수 없다.

		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 변수에 저장된다.
		// 배열 초기화시 기본값이 저장된다.

		// array(변수) = 100번지(주소)
		// 100번지(첫번째 저장된 값의 주소)
		// {0, 0, 0, 0, 0}

		array = new int[] { 1, 2, 3, 4, 5 };

		// array={1, 2, 3, 4, 5};
		// 선언과 초기화를 동시에 해야한다.

		int[] array2 = { 1, 2, 3, 4, 5 };

		// System.out.println(array); // 배열의 주소가 출력된다.
		System.out.println(array[0]); // 인덱스 : 배열안에 들어가는 값의 순서(0부터 시작)
		System.out.println(array[1]);
		System.out.println(); // 출력 : sysout + Ctrl + Space
		// 한줄복사 : Ctrl + Alt + 방향키(위/아래)

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
			System.out.println(array[i]);
		}

		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];

		// 배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));// Arrays.toStirng() : 배열에 있는
													// 모든 값을 문자열로 반환

		// 배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = (double) sum / arr.length;
		}

		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " max : " + max);
		// 배열의 값을 섞어주세요
		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		for (int i = 0; i < shuffle.length; i++) {
			int num = (int) (Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[num];
			shuffle[num] = temp;
		}
		System.out.println(Arrays.toString(shuffle));

		// 1~10 사이의 랜덤값을 500번 생성하고 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[] num = new int[10];
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 10) + 1;
			num[random-1]++;
		}
		System.out.println("각 숫자 생성 횟수 : " + Arrays.toString(num));
	}
}
