package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		// 다차원 배열
		// - 배열안에 배열이 저장되어 있는 형태이다.

		// 1차원
		int[] array1;

		// 2차원
		int[][] array2;

		// 3차원
		int[][][] array3;

		int[][] arr = new int[2][3]; // 2칸짜리 배열안에 각 칸마다 세칸짜리 배열이 생성된다

		// arr(변수) = 100번지(주소)

		// 100번지
		// {200번지, 300번지}

		// 200번지
		// {0, 0, 0}
		// 300번지
		// {0, 0, 0}

		int arr2[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; // 값의 개수로 배열의
																	// 길이가 정해진다.
		int[] arr3[] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] arr4 = new int[3][]; // 가변배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10]; // 필요할 때 원하는 크기로 배열을 사용하기 위해서 가변배열 사용

		System.out.println(arr[0][1]);

		// arr[0]=10; // 1차원에 값을 저장할 수 없다.
		arr[0] = new int[5]; // 1차원에 저장하려고 한다면 배열을 저장해야 한다.
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;

		System.out.println(arr.length); // 1차원 배열의 길이
		System.out.println(arr[0].length); // 0번 인덱스의 2차원 배열의 길이
		System.out.println(arr[1].length); // 1번 인덱스의 2차원 배열의 길이

		// arr = { {10, 20, 0, 0, 0}, {100, 0, 0}};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		int[][] scores = new int[3][5]; // int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = (double) sum[i] / scores[i].length;
		}
		System.out.println("학생의 합계 : " + Arrays.toString(sum));
		System.out.println("학생의 평균 : " + Arrays.toString(avg));

		
		
	}
}
