package ch02;

public class MultiplicationExam {

	public static void main(String[] args) {
		// 구구단 프로그램
		
		for(int a = 2; a < 10; a++) {
			System.out.println("===========" + a + " 단 ==========");
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " * " + b + " = " + a*b);
			}
		}

	}

}
