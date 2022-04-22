package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {

		// List, Map, Set

		// boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		// void add(int index, Object obj) :지정된 위치에 객체를 추가한다.
		// Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		// 수정하는 메서드
		// Object get(int index) : 지정된 위치의 객체를 반환한다.
		// int size() : 저장된 객체의 수를 반환한다. = length()
		// Object remove(int index) : 지정된 위치의 객체를 제거한다.

		ArrayList sample = new ArrayList<>();

		sample.add("abc"); // 0번 인덱스 - String
		sample.add(100); // 1번 인덱스 - int
		sample.add(new Scanner(System.in)); // 2번 인덱스 - Scanner
		// 값을 꺼낼 때 어떤 타입인지 알 수 없다

		// 기본형 타입 객체 클래스
		// byte : Byte
		// short : Short
		// int : Integer
		// long : Long
		// float : Float
		// double : Double
		// char : Character
		// boolean : Boolean
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		// list.add("abc");
		list.add(new Integer(20));
		System.out.println(list.add(30));
		System.out.println(list);

		list.add(1, 40); // 기존에 저장되어 있던 범위 내에서 저장
		System.out.println(list);

		Integer before = list.set(2, 50);
		System.out.println(before);
		System.out.println(list);

		int get = list.get(2); // 실제로는 Integer 타입
		System.out.println(get);

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(i + " : " + list.get(i));
		//
		// list.remove(i); // 줄어들면서 반복하기 때문에 2번밖에 돌지 않음
		// // 뒤에서부터 삭제해야 제대로 삭제 가능
		// }

		// 값을 제거할 때는 뒤에서부터 제거해야 한다
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);

		// list에 1~100사이의 랜덤값을 10개 저장해주세요.

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100) + 1);
		}
		System.out.println(list);

		// list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double) sum / list.size();

		System.out.println(sum + " " + avg);

		// list에서 최솟값과 최댓을 구해주세요.
		int max = list.get(1);
		int min = list.get(1);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(min + " " + max);

		// list를 오름차순으로 정렬해주세요.
		int num = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			num = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(num) > list.get(j)) {
					num = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(num));
			list.set(num, temp);
		}
		System.out.println(list);

		// 2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();

		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		list2.add(list);
		System.out.println(list2);

		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		list.add(60);

		list2.add(list);
		System.out.println(list2);

		list.get(0);
		list2.get(0).get(0); // arr[0][0]

		for (int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> al = list2.get(i);
			for (int j = 0; j < al.size(); j++) {
				System.out.println(al.get(j));
			}
		}

		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sum1 = new ArrayList<Integer>();

		ArrayList<Double> avg1 = new ArrayList<Double>();
		double a1 = 0;
		for (int i = 0; i < 3; i++) {
			list = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				list.add((int) (Math.random() * 100));
			}
			list3.add(list);
		}
		System.out.println(list3);

		for (int i = 0; i < list3.size(); i++) {
			int s1 = 0;
			for (int j = 0; j < list3.get(i).size(); j++) {
				s1 += list3.get(i).get(j);
			}
			sum1.add(s1);
			avg1.add((double) s1 / list3.get(i).size());
		}
		System.out.println(sum1 + " " + avg1);
		
		
	}
}
