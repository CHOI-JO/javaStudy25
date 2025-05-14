package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기!!!!
		// C -> 시동을 건다.(START)
		// R -> 계기판 정보 출력
		// U -> 주행
		// D -> 시동을 끈다. (END)

	Scanner input = new Scanner(System.in);
	boolean run = true ; // 시동을 켬
	double speed = 0 ; // 차량 속도
	
	final int MAXSPEED = 300; // 최고 속도
	final int MINSPEED = 0; // 최저 속도
	
	System.out.println("소나타가 입고되었습니다.");
	System.out.println("시동을 켭니다.");
	System.out.println("현재 속도 : " + speed + "km/h");
	
	while(run) {
		System.out.println("\n" + "===========================");
		System.out.println("0. 시동 종료");
		System.out.println("1. 엑셀");
		System.out.println("2. 브레이크");
		System.out.println("3. 멀티미디어");
		System.out.println("4. 주유하기");
		System.out.println("============================="+ "\n");
		System.out.print("(0~4) 숫자를 입력하세요. >>>> ");
		
		int select = input.nextInt();
		
		switch(select) {
		case 0 :
			System.out.println("\n" + "===========================");
			System.out.println("시동을 종료합니다.");
			run = false; // while 문 종료
			break;
			
		case 1 :
			System.out.println("\n" + "===========================");
			System.out.println("가속을 진행합니다.");
			speed += 30;
			if(speed >= MAXSPEED) { // 최고 속도를 넘을 수 없음.
				speed = MAXSPEED;
			} 
			System.out.println("현재 속도 : " + speed + "km/h");
			break;
		
		case 2 :
			System.out.println("\n" + "===========================");
			System.out.println("감속을 진행합니다.");
			speed -= 30;
			if(speed <= MINSPEED) {
				speed = MINSPEED;
			}
			System.out.println("현재 속도 : " + speed + "km/h");
			break;
			
		case 3 :
			System.out.println("\n" + "===========================");
			System.out.println("멀티미디어를 실행합니다.");
			break;
			
		case 4 :
			System.out.println("\n" + "===========================");
			System.out.println("주유를 시작합니다.");
			break;
		} // switch문 종료
	} // while 문 종료
	
	} // main 메서드 종료

} // class 종료
