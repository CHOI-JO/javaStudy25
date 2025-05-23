package ch04;

import java.util.Scanner;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌 변수
	public String company; // 제작회사(현대, 기아, KGM, 쉐보레, 아우디)
	public String model ; // 아반떼, 그렌저, 쏘나타
	public String color; // 빨강, 은색, 검정색, 흰색 등
	public String oilType; //경유, 휘발유
	public int maxSpeed; //최고속도

	// 상태값(변동가능)
	public int speed ;
	public int rpm ;
	public int oil = 100;
	public String songs[] = {"1. 최신 100곡", "2. 클래식 100곡", "3. 영화음악 100곡"};

	
	
	// 기본 생성자: 생략 가능 (객체가 생성할 때 사용되는 메서드 : 클래스 명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 0;
		maxSpeed = 200;
	} // 객체가 생성되면서 변수에 값이 저장됨.
	
	
	// 사용자 지정 생성자 -> 개발자가 응용하는 기법
	public Car(String company, String model, String color) {
		this.company = company ; //갈색은 지연변수, this는 글로벌 변수
		this.model = model ;
		this.color = color ;
	} // Car myCar = new Car("벤츠", '이클레스", "빨강");
	
	
	public boolean speed(int speedChange) {
		// 주행 속도 변경하기
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
			switch (speedChange) {
			case 1:
				this.rpm = this.rpm + 1;
				this.oil = this.oil - 1;
				this.speed = this.speed + 5;

				oilState();

				if (this.speed >= this.maxSpeed) {
					this.speed = this.maxSpeed;
					System.out.println("\n==================================");
					System.out.println("최고 속도에 도달했습니다.");
					System.out.println("최고 속도 이상으로 주행할 수 없습니다.");
					System.out.println("\n==================================");
					System.out.println("현재 속도: " + this.speed);
					System.out.println("현재 rpm: " + this.rpm);
					System.out.println("현재 주유량: " + this.oil);
					this.rpm = 1;
					run = false;
				} else {
					System.out.println("\n==================================");
					System.out.println("주행 속도를 가속합니다.");
					System.out.println("현재 속도: " + this.speed);
					System.out.println("현재 rpm: " + this.rpm);
					System.out.println("현재 주유량: " + this.oil);
					this.rpm = 1;
				} // 최고 속도와 현재 속도를 확인하는 if문 종료
				break;

			case 2:
				this.rpm = 1;

				this.speed = this.speed - 5;
				this.oil = this.oil- 1;

				oilState();

				if (this.speed > 0) {
					System.out.println("\n==================================");
					System.out.println("주행 속도를 감속합니다.");
					System.out.println("현재 속도: " + this.speed);
					System.out.println("현재 rpm: " + this.rpm);
					System.out.println("현재 주유량: " + this.oil);
				} else if (this.speed <= 0) {
					System.out.println("\n==================================");
					System.out.println("주행을 종료합니다.");
					this.rpm = 0;
					run = false;
				} // 최고 속도와 현재 속도를 확인하는 if문 종료
				break;
			} // 주행 속도를 변경하는 switch문 종료
			return run;
	} // 주행 상태 메서드 종료
	
	public void oilState() {
		// 현재 주유량 확인하기
		if(this.oil <= 10 && this.oil >= 0) { 
			System.out.println("\n==================================");
			System.out.println("주유량이 10km 이하입니다.");
			System.out.println("주유를 해주세요.");
		} else if(this.oil <= 0) {
			System.out.println("\n==================================");
			System.out.println("차량에 주유가 없습니다.");
			System.out.println("주행을 종료합니다.");
			//System.exit(0);
		} 
	} // 현재 주유량을 확인하는 메서드 종료
	
	public void multimedia() {
		// 멀티미디어 확인하기
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("\n==================================");
		System.out.println("실행할 멀티미디어를 선택해주세요.");
		System.out.println("1. 라디오");
		System.out.println("2. 네비게이션: ");
		System.out.println("3. 블루투스: ");
		System.out.println("4. usb: ");
		System.out.print(">>>>> ");
		int select = input.nextInt();
		
		switch(select) {
		case 1 : 
			System.out.println("\n라디오를 실행합니다.");
			radio();
			break;
		case 2 :
			System.out.println("\n네비게이션을 실행합니다.");
			navigation();
			break;
		case 3 :
			System.out.println("\n블루투스를 실행합니다.");
			bluetooth();
			break;
		case 4 :
			System.out.println("\nusb을 실행합니다.");
			usb();
			break;
		default :
			System.out.println("잘못 입력하였습니다. 멀티미디어를 종료합니다.");
			run = false;
		}
	}


	public void usb() {
		// usb를 읽어오는 메서드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nUSB에 저장된 재생 목록입니다.");
		System.out.println("=============================\n\n");
		
		for(int i = 0; i<songs.length; i++) {
			System.out.println(songs[i]);
		}
		
		System.out.println("재생할 목록을 입력해주세요.(숫자)");
		int select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(songs[0] + "을 재생합니다");
			break;
		case 2:
			System.out.println(songs[1] + "을 재생합니다");
			break;
		case 3:
			System.out.println(songs[2] + "을 재생합니다");
			break;
		default :
			System.out.println("잘못 입력하였습니다. 멀티미디어를 종료합니다.");
			break;	
		} // switch문 종료
	}


	public void bluetooth() {
		// 블루투스 메서드 실행
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n블루투스를 검색합니다.");
		System.out.println("=============================\n\n");
		System.out.println("총 2개의 블루투스가 검색되었습니다.");
		System.out.println("1. 아이폰 15s");
		System.out.println("2. 갤럭시 s20");
		System.out.println("\n 어떤 블루투스와 연결하시겠습니까?");
		System.out.println(">>>>> ");
		int select = input.nextInt();
		
		switch(select) {
		case 1: 
			System.out.println("\n아이폰 15s와 연결되었습니다.");
			break;
		case 2: 
			System.out.println("\n갤럭시 s20과 연결되었습니다.");
			break;
		
		default :
			System.out.println("잘못 입력하였습니다. 멀티미디어를 종료합니다.");
			break;	
		} // switch문 종료
	}


	public void navigation() {
		// TODO Auto-generated method stub
		
	}


	public void radio() {
		// 라디오 실행하는 메서드
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n라디오 주파수를 선택해주세요");
		System.out.println("1. FM 89.1 MHz: KBS 쿨 FM");
		System.out.println("2. FM 91.9 MHz: MBC FM4U");
		System.out.println("3. FM 93.1 MHz: KBS 클래식 FM");
		System.out.println("4. FM 95.9 MHz: MBC 표준 FM");
		System.out.println("5. FM 98.1 MHz: CBS 표준 FM");
		System.out.println("6. FM 103.5 MHz: SBS 러브 FM");
		System.out.println("7. FM 107.7 MHz: SBS 파워 FM");
		System.out.println(">>>>> ");
		int select = input.nextInt();
		
		switch(select) {
		case 1: 
			System.out.println("\n[FM 89.1 MHz: KBS 쿨 FM]를 재생합니다.");
			break;
		case 2: 
			System.out.println("\n[FM 91.9 MHz: MBC FM4U]를 재생합니다.");
			break;
		case 3: 
			System.out.println("\n[FM 93.1 MHz: KBS 클래식 FM]를 재생합니다.");
			break;
		case 4: 
			System.out.println("\n[FM 95.9 MHz: MBC 표준 FM]를 재생합니다.");
			break;
		case 5: 
			System.out.println("\n[FM 98.1 MHz: CBS 표준 FM]를 재생합니다.");
			break;
		case 6: 
			System.out.println("\n[FM 103.5 MHz: SBS 러브 FM]를 재생합니다.");
			break;
		case 7: 
			System.out.println("\n[FM 107.7 MHz: SBS 파워 FM]를 재생합니다.");
			break;	
		default :
			System.out.println("잘못 입력하였습니다. 멀티미디어를 종료합니다.");
			break;	
		} // switch문 종료
	} // radio 메서드 종료
}
