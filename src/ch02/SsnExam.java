package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.print("당신의 주민번호를 입력하세요(000000-0000000) >>>  ");
			Scanner input = new Scanner(System.in);
			char gender = input.nextLine().charAt(7); // 8번째 글자 추출
			
			switch (gender) {
			case '1':
			case '3':
			case '5':
			case '7':
				System.out.println("당신은 남자입니다.");
				break;

			case '2':
			case '4':
			case '6':
			case '8':
				System.out.println("당신은 여자입니다.");
				break;

			default:
				System.out.println("당신은 여자 또는 남자가 아닙니다.");
				System.out.println("다시 입력하세요");

			}
		}

	}

}
