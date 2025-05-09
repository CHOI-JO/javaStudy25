package ch01;

// import java.util.Scanner;

public class VariableExam {

	public static void main(String[] args) {
		// Scanner input = new Scanner (System.in);
		
		int distance;
		int time;
		double velocity;
		
		//System.out.println("거리(m)를 입력해주세요 : ");
		//distance = input.nextInt();
		
		//System.out.println("시간(초)을 입력해주세요 : ");
		//time = input.nextInt();
		
		
		
		distance = 100;
		time = 3;
		velocity = distance / (double)time;
		System.out.print("당신의 속도는 " + velocity);
		System.out.println(" m/s 입니다."); // 소수점 자리수는 조절은 나중에

	}

}
