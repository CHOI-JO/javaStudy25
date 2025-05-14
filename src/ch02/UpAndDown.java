package ch02;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		// 숫자를 랜덤으로 받아서 up and down 게임 만들기
		int input = 0;
		int answer = (int) (Math.random()*100) + 1;
		Scanner inputInt = new Scanner(System.in);

		
		while(input != answer) {
			System.out.println("===========================");
			System.out.println("1~100 사이에 정수를 입력하세요");
			input = inputInt.nextInt();
			
			if(input>answer) {
				System.out.println("\n" + "DOWN" + "\n");
			} else if(input<answer) {
				System.out.println("\n" + "UP" + "\n");
			}// if문 종료
		}// while문 종료
		
		System.out.println("정답입니다." + answer);
	}

}
