package g_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0) {
			this.hour = 0;
		} else if (hour > 23) {
			this.hour = hour%24;
		} else
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0) {
			this.minute = 0;
		} else if (minute > 59) {
			this.minute = minute % 60;
			setHour(hour + (minute / 60));
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			this.second = 0;
		} else if (second > 59) {
			this.second = second % 60;
			setMinute(this.minute + (second / 60));
		} else {
			this.second = second;
		}
	}

	void clock() {
		while (true) {
			System.out.println(toString()); // 출력
			stop(); // 멈춤
			setSecond(second + 1); // 1초 증가

		}
	}

	private void stop() { // stop 메서드는 clock 안에서만 사용하기 때문에
		try {
			Thread.sleep(1000); // 프로그램을 잠시 멈추게 하는 메서드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
