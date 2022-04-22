package j_collection;

import java.util.Arrays;

import d_array.Array;

public class Practice {

	public static void main(String[] args) {

		int[] score = new int[10];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100);
		}

		int[] rank = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		int min;
		int temp;
		for (int i = 0; i < score.length; i++) {
			min = i;
			for (int j = 0; j < score.length; j++) {
				if (score[min] > score[j]) {
					min = j;
				}
				
				temp = score[min];
				score[min] = score[i];
				score[i] = temp;
				
				temp=rank[min];
				rank[min]=rank[i];
				rank[i]=temp;
			}

		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}

	}

}
