package ch02;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("대/소문자, 숫자를 비교할 문자를 입력하세요");
		String message = input.next();
		char ch = message.charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("입력하신 문자는 대문자 입니다.");
		} else if(ch >= 'a' && ch <= 'b') {
			System.out.println("입력하신 문자는 소문자 입니다.");
		} else if(ch >= '1' && ch <= '9') {
			System.out.println("입력하신 문자는 숫자 입니다.");
		} else {
			System.out.println("입력하신 문자는 대/소문자, 숫자가 아닙니다.");
		}

	}

}

