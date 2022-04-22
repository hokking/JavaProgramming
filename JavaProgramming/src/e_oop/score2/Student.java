package e_oop.score2;

public class Student { // 학생이 하는 일

	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	int rank;

	void createRandomScore() {
		kor = (int) (Math.random() * 101);
		eng = (int) (Math.random() * 101);
		math = (int) (Math.random() * 101);
		
	}

	int studentSum() {
		sum = kor + eng + math;
		return sum;
	}

	double studentAvg() {
		avg = Math.round((double) sum / 3 * 100) / 100.0;
		return avg;
	}

	int studentRank(Student[] students) {
		rank = 1;
		for (int i = 0; i < students.length; i++) {
			if (studentSum() < students[i].studentSum()) {
				rank++;
			}
		}
		return rank;
	}

	String studentInfo() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t"
				+ avg + "\t" + rank;
	}

}
