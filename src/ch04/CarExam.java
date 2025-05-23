package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주 실행 프로그램
		
		boolean run = true;
		Scanner input = new Scanner(System.in);
		System.out.println("===차량 정보 입력===");
		Car myCar = new Car(); // 기본 생성자로 객체 생성 // 생성시 속도와 rpm과 oil량은 기본값으로 생성
		
		System.out.print("제조회사: ");
		myCar.company = input.next();
		
		System.out.print("모델: ");
		myCar.model = input.next();
		
		System.out.print("색상: ");
		myCar.color = input.next();
		
		System.out.println("주유타입: ");
		myCar.oilType = input.next();
		
				
		while (run) {
			System.out.println("\n1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 주행 시작");
			System.out.println("4. 멀티미디어 실행");
			System.out.println("5. 주유하기");
			System.out.println("6. 차량 주행 종료");
			System.out.print(">>>>>  ");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("\n차량 회사: " + myCar.company);
				System.out.println("차량 모델: " + myCar.model);
				System.out.println("차량 색상: " + myCar.color);
				System.out.println("차량 주유 타입: " + myCar.oilType);
				break;
			case "2" :
				System.out.println(myCar.model + "에(이) 시동이 켜졌습니다.");
				System.out.println("\n==================================");
				System.out.println("현재 주유량: " + myCar.oil);				
				break;
			case "3" :
				System.out.println(myCar.model + "가(이)의 주행을 시작합니다.");
				speed();
				break;
			case "4" :
				System.out.println(myCar.model + "의 멀티미디어를 실행합니다.");
				myCar.multimedia();
				break;
			case "5" :
				System.out.println(myCar.model + "의 주유를 시작합니다");
				oilAdd();
				break;
			case "6" :
				System.out.println(myCar.model + "의 시동을 끕니다.");
				System.out.println("\n==================================");
				System.out.println("현재 주유량: " + myCar.oil);
				break;
			
			default :
				System.out.println("잘못 입력하였습니다. 주행을 종료합니다.");
				run = false;
			
			} // switch문 종료
		} // while문 종료
	
	} // 메인 메서드 종료

	static void oilAdd() {
		// 주유소 메서드
		Scanner input = new Scanner(System.in);
		Car myCar = new Car(); 

		System.out.println("얼마의 양을 주유하시겠습니까?");
		System.out.println("1. 10리터");
		System.out.println("2. 20리터");
		System.out.println("3. 30리터");
		System.out.println("4. 40리터");
		System.out.println("5. 50리터");
		System.out.print(">>>>> ");
		int oil = input.nextInt();
		
		switch(oil) {
		case 1 :
			myCar.oil += 10;
			System.out.println("\n==================================");
			System.out.println("10리터를 주유하였습니다.");
			System.out.println("현재 주유량: " + myCar.oil);
			break;
		case 2 :
			myCar.oil += 20;
			System.out.println("\n==================================");
			System.out.println("20리터를 주유하였습니다.");
			System.out.println("현재 주유량: " + myCar.oil);
			break;
		case 3 :
			myCar.oil += 30;
			System.out.println("\n==================================");
			System.out.println("30리터를 주유하였습니다.");
			System.out.println("현재 주유량: " + myCar.oil);
			break;
		case 4 :
			myCar.oil += 40;
			System.out.println("\n==================================");
			System.out.println("40리터를 주유하였습니다.");
			System.out.println("현재 주유량: " + myCar.oil);
			break;
		case 5 :
			myCar.oil += 50;
			System.out.println("\n==================================");
			System.out.println("50리터를 주유하였습니다.");
			System.out.println("현재 주유량: " + myCar.oil);
			break;
		default :
			System.out.println("잘못 입력하였습니다. 주행을 종료합니다.");
			break;
		}
	}

	static void speed() {
		boolean run = true;
		Car myCar = new Car(); 
		Scanner input = new Scanner(System.in);
		
		System.out.println("주행하고자 하는 속도를 선택해주세요");
		
		while (run) {
			System.out.println("\n==================================");
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.print(">>>>> ");
			int speedChange = input.nextInt();
			run = myCar.speed(speedChange);
			} // 주행 속도를 변경하는 switch문 종료		
		}

} // 클래스 종료
