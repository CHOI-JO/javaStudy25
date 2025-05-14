package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do-while문 예시
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner input = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(" >>> ");
			inputString = input.nextLine();
			System.out.println("전송 값 : " + inputString);
		} while (!inputString.equals("q"));
		
		System.out.println("==================================");
		System.out.println("프로그램 종료");
		
	} // 메인 메서드 종료

} // 클래스 종료
