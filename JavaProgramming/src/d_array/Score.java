package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {

		// 402호 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		// 0~100의 랜덤으로 생성해주시고, 아래와같이 출력해주세요.

		int[][] scores = new int[25][7];
		int[] stuSum = new int[scores.length];
		int[] subSum = new int[scores[0].length];
		double[] stuAvg = new double[scores.length];
		double[] subAvg = new double[scores[0].length];

		String[] students = { "강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈", "김진석",
				"김충신", "박슬기", "박채린", "손영태", "손영흔", "안정연", "이선우", "이수보", "이주홍",
				"이중호", "임현정", "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정", "박지은" };

		String[] subject = { "이름", "국어", "영어", "수학", "사회", "과학", "Oracle",
		
				"Java", "합계", "평균", "석차" };
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
		}

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				stuSum[i] += scores[i][j];
			}

			stuAvg[i] = Math.round((double) stuSum[i] / scores[i].length * 100) / 100.0;
		}
		for (int i = 0; i < scores[0].length; i++) {
			for (int j = 0; j < scores.length; j++) {
				subSum[i] += scores[j][i];
			}
			subAvg[i] = Math.round((double) subSum[i] / scores.length * 100) / 100.0;
		}

		int[] rank = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < scores.length; j++) {
				if (stuAvg[j] > stuAvg[i]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			System.out.print(students[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");

			}
			System.out.print(stuSum[i] + "\t");
			System.out.print(stuAvg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();

		}
		System.out.print("과목합계\t");
		for (int i = 0; i < scores[0].length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.print("\n과목평균\t");
		for (int i = 0; i < scores[0].length; i++) {
			System.out.print(subAvg[i] + "\t");
		}

	}

}
