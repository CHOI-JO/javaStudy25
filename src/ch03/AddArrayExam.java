package ch03;

public class AddArrayExam {

	public static void main(String[] args) {
		int [] score1 = new int[] {80,90,100};
		int [] score2 = new int[] {90,100,100};
		int [] score3 = new int[] {60,70,70};
				
		int total1 = add(score1);
		int total2 = add(score2);
		int total3 = add(score3);
		
		System.out.println("1번의 총합: " + total1);
		System.out.println("2번의 총합: " + total2);
		System.out.println("3번의 총합: " + total3);

		double average1 = avg(score1, total1);
		double average2 = avg(score2, total2);
		double average3 = avg(score3, total3);

		System.out.printf("1번의 평균: %.2f\n", average1);
		System.out.printf("2번의 평균: %.2f\n", average2);
		System.out.printf("3번의 평균: %.2f\n", average3);
	}

	private static double avg(int[] score, int total) {
		double avg = (double)total / score.length;
		return avg;
	}

	private static int add(int[] score) {
		int sum = 0;
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

}
