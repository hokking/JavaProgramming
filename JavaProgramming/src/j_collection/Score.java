package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {

		String[] student = { "강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈", "김진석",
				"김충신", "박슬기", "박채린", "손영태", "손영흔", "안정연", "이선우", "이수보", "이주홍",
				"이중호", "임현정", "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정", "박지은" };
		String[] subject = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };

		ArrayList<String> students = new ArrayList<>();
		ArrayList<String> subjects = new ArrayList<>();
		for (int i = 0; i < student.length; i++) {
			students.add(student[i]);
		}
		for (int i = 0; i < subject.length; i++) {
			subjects.add(subject[i]);
		}

		// 점수부여
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> score = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			score = new ArrayList<>();
			for (int j = 0; j < subjects.size(); j++) {
				score.add((int) (Math.random() * 100));
			}
			scores.add(score);
		}

		// 학생 합계 평균
		ArrayList<Integer> stuSum = new ArrayList<Integer>();
		ArrayList<Double> stuAvg = new ArrayList<Double>();
		int sum;
		for (int i = 0; i < scores.size(); i++) {
			sum = 0;
			for (int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			stuSum.add(sum);
			stuAvg.add(Math.round((double) sum / scores.get(i).size() * 100) / 100.0);
		}

		// 과목 합계 평균
		ArrayList<Integer> subSum = new ArrayList<Integer>();
		ArrayList<Double> subAvg = new ArrayList<Double>();
		for (int i = 0; i < scores.get(0).size(); i++) {
			sum = 0;
			for (int j = 0; j < scores.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSum.add(sum);
			subAvg.add(Math.round((double) sum / scores.size() * 10) / 10.0);
		}

		// 석차
		ArrayList<Integer> rank = new ArrayList<>();

		for (int i = 0; i < scores.size(); i++) {
			rank.add(1);
			for (int j = 0; j < scores.size(); j++) {
				if (stuSum.get(i) < stuSum.get(j)) {
					rank.set(i, rank.get(i) + 1);
				}
			}
		}

		// 석차 정렬
		int min;
		for (int i = 0; i < scores.size(); i++) {
			min = i;
			for (int j = 0; j < scores.size(); j++) {
				if (rank.get(min) < rank.get(j)) {
					min = j;
				}
				students.set(min, students.set(i, students.get(min)));
				// String tempStu = students.get(i);
				// students.set(i, students.get(min));
				// students.set(min, tempStu);
				scores.set(min, scores.set(i, scores.get(min)));
				stuSum.set(min, stuSum.set(i, stuSum.get(min)));
				stuAvg.set(min, stuAvg.set(i, stuAvg.get(min)));
				rank.set(min, rank.set(i, rank.get(min)));
			}
		}

		// 출력
		System.out.print("이름");
		for (int i = 0; i < scores.get(0).size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t학생합계\t학생평균\t석차");
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			for (int j = 0; j < scores.get(i).size(); j++) {
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.print("\t" + stuSum.get(i) + "\t" + stuAvg.get(i) + "\t"
					+ rank.get(i) + "\n");
		}
		System.out.print("과목합계");
		for (int i = 0; i < scores.get(0).size(); i++) {
			System.out.print("\t" + subSum.get(i));
		}
		System.out.print("\n과목평균");
		for (int i = 0; i < scores.get(0).size(); i++) {
			System.out.print("\t" + subAvg.get(i));
		}
	}
}
