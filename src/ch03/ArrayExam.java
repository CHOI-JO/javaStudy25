package ch03;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// 총합과 평균, 최대값 구하는 배열
		int sum = 0;
		double avg = 0.0;
		
		// int [] score = {100,30,04,20,103,120};
		Scanner inputInt = new Scanner(System.in);
		int [] score = new int [5];

		System.out.println("5개의 정수를 입력하세요.");

		for(int i=0; i<score.length; i++) {
			score[i]=inputInt.nextInt();
		}
		
		int max = score[0];// 최대값 구하는 함수
		int min = score[0];// 최소값 구하는 함수
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = (double)sum / score.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		for(int i=1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}// 최대값/최소값 구하는 for문 종료
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	} // 메인 메서드 종료

} // 클래스 종료
