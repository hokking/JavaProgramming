package e_oop.score;

public class Score {

	public static void main(String[] args) {

		String[] studentNames = { "강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈",
				"김진석", "김충신", "박슬기", "박채린", "손영태", "손영흔", "안정연", "이선우", "이수보",
				"이주홍", "이중호", "임현정", "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정",
				"박지은" };

		Student[] students = new Student[studentNames.length];

		for (int i = 0; i < 25; i++) {
			Student student = new Student();

			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);
			student.name = studentNames[i];
			student.rank = 1;

			students[i] = student;
		}

		// 성적처리 프로그램을 완성해주세요.

		// 합계, 평균
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng
					+ students[i].math;
			students[i].avg = Math.round((double) students[i].sum / 3 * 100) / 100.0;
		}

		// 석차
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}

		// 석차순 정렬
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[min].sum < students[j].sum) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;

		}

		// 과목합계, 평균
		int[] subSum = new int[3];
		for (int i = 0; i < studentNames.length; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}

		double[] subAvg = new double[3];
		for (int i = 0; i < subSum.length; i++) {
			subAvg[i] = Math.round((double) subSum[i] / studentNames.length
					* 100) / 100.0;
		}

		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" + students[i].kor + "\t"
					+ students[i].eng + "\t" + students[i].math + "\t"
					+ students[i].sum + "\t" + students[i].avg + "\t"
					+ students[i].rank);
		}

		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
	}

}
