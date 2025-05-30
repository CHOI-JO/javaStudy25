package ch02;

import java.util.Scanner;

public class CalcuratorExam {

	public static void main(String[] args) {
		   // 간단한 계산기 프로그램 만들기
		   // 입력받기 : 숫자 > 연산자 > 숫자
		   // 연산자별로 메서드에 숫자를 넣기. (입력받는 순서에 맞춰서 조금 귀찮지만 메서드에서 잘 해결하기)
		   // 결과값 main메서드에서 출력해주기(return을 받아서)
		   // 완료 반복재생 가능하게 while문 사용하기 (다시 하시겠습니까? or 이어서 계산하시겠습니까?)
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		boolean run = true;
		
		int a = 0, b = 0, c = 0; // 변수 5개 선언
		double d = 0 ;
		String operator = "연산기호"; // 정답 표시용
		
		while(run) {
			System.out.println("======정수 계산기=======");
			System.out.println("숫자를 입력하세요.(int 범위 내에서만) \n >>> ");
			a = inputInt.nextInt();
			
			System.out.println("\n계산할 부호(연산자)를 선택하세요. \n+(더하기) \n-(빼기) \n*(곱하기) \n/(나누기) \n>>>> ");
			operator = inputString.next();
			
			System.out.println("숫자를 입력하세요.(int 범위 내에서만) \n >>> ");
			b = inputInt.nextInt();
			
			switch(operator) {
			case "+" :
				c = plus(a, b);
				System.out.println(a + " + " + b + " = " + c + "\n");
				break;
			
			case "-" :
				c = minus(a, b);
				System.out.println(a + " - " + b + " = " + c + "\n");
				break;

			case "*" :
				c = Multiplication(a, b);
				System.out.println(a + " * " + b + " = " + c + "\n");
				break;
				
			case "/" :
				d = Divide(a, b);
				System.out.println(a + " / " + b + " = " + d + "\n");
				break;
				
			default :
				System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다");
				run=false;
				
			}
		} // while문 종료
		
	} // 메인 메서드 종료

	static double Divide(int a, int b) {
		double Divide = (double)a / (double)b ;
		return Divide;
	}

	static int Multiplication(int a, int b) {
		int Multiplication = a * b ;
		return Multiplication;
	}

	static int minus(int a, int b) {
		int minus = a - b ;
		return minus;
	}

	static int plus(int a, int b) {
		int sum = a + b ;
		return sum;
	}

} // 클래스 종료
