package ch02;

import java.util.Scanner;

public class forExam {

	public static void main(String[] args) {
		// 둘 이상의 초기화식
		for(int i=0, j=100 ; i<=10 && j>=90 ; i++, j++) {
			System.out.println("i값의 증가 : " + i + ",  j값의 감소 : " + j );
		} 
		
		// 1~100까지의 합
		int sum = 0;
		for (int a = 1 ; a <=100 ; a++) {
			sum = sum + a ;
		}
		System.out.println("1~100까지의 합 : " + sum); 
		
		// 최대값을 키보드로 입력받고 합계를 계산
		System.out.println("\n" + "===================================");
		System.out.println("합을 계산하는 프로그램 입니다.");
		System.out.print("1~100의 숫자 중, 한 가지 숫자를 입력하세요 >>>> ");
		Scanner inputInt = new Scanner(System.in);
		int b = inputInt.nextInt();
		int sum2 = 0;
		
		for (int a = 0 ; a<=b ; a++) {
			sum2 = sum2 + a; 
		}
		System.out.println("\n" + "===================================");
		System.out.println("입력하신 최대값은 " + b + " 입니다. 합을 계산합니다.");
		System.out.println("1~" + b + "까지의 합 : " + sum2); 

	}
	
}
