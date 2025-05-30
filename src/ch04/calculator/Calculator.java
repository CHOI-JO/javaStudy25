package ch04.calculator;

public class Calculator {
	static double pi;
	
	static double squareRoot(double x) {
		return Math.sqrt(x);
	}
	
	static double percent(double x, double y) {
		return x + (y/100*x);
	}
	
	static double square(double x) {
		return x*x;
	}
	
	static double fractional(double x) {
		return 1/x;
	}
	
	static double plus(double x, double y) {
		return x+y;
	}
	
	static double minus(double x, double y) {
		return x-y;
	}
	
	static double multiply(double x, double y) {
		return x*y;
	}
	
	static double divide(double x, double y) {
		return x/y;
	}
	
	static {
		pi = 3.14159;
	}
}
	
