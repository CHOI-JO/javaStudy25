package ch04.calculator;

public class CalculatorExam {

	public static void main(String[] args) {
		// 계산기를 구현하는 메서드
		double result1 = 5 * 5 * Calculator.pi;
		double result2 = Calculator.plus(6, 4);
		double result3 = Calculator.minus(9, 2);
		double result4 = Calculator.multiply(6, 9);
		double result5 = Calculator.divide(90, 2);
		double result6 = Calculator.square(7);
		double result7 = Calculator.fractional(4);
		double result8 = Calculator.percent(100, 5);
		double result9 = Calculator.squareRoot(15);
		
		System.out.println("파이 계산: " + result1);
		System.out.println("더하기 계산: " + result2);
		System.out.println("빼기 계산: " + result3);
		System.out.println("곱하기 계산: " + result4);
		System.out.println("나누기 계산: " + result5);
		System.out.println("제곱 계산: " + result6);
		System.out.println("분수 계산: " + result7);
		System.out.println("퍼센트 계산: " + result8);
		System.out.println("제곱근 계산: " +result9);

	}

}
