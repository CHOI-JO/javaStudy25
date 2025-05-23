package ch03;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// 자판기 프로그램
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true; // 자판기 프로그램 반복문
		
		String manu [] = {"물", "사이다", "콜라", "환타", "탄산수", "오렌지 쥬스", "포도 쥬스", "쿨피스", "포카리스웨터", "파웨에이드", "비타500"};
		int price [] = {1000, 2000, 2000, 2000, 1700, 1400, 1400, 1200, 1800, 1900, 1300}; // 음료별 금액
		int count[] = {20, 15, 15, 15, 10, 9, 9, 8, 11, 12, 17}; // 현재 재고 갯수
		int salesCount[] = new int [10000]; // 재고와 판매되는 갯수를 비교하기 위한 배열

		while (run) {
			System.out.println("\n=======자판기 프로그램=========");
			System.out.println("1. 관리자 모드");
			System.out.println("2. 사용자 모드");
			System.out.println("9. 프로그램 종료");
			System.out.println("============================\n");
			System.out.print(">>>>>> ");
			int select = inputInt.nextInt();
			switch (select) {
			case 1:
				System.out.println("\n관리자 모드로 이동합니다.");
				admin(manu, price, count, salesCount);
				break;

			case 2:
				System.out.println("\n사용자 모드로 이동합니다.");
				user(manu, price, count, salesCount);
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("\n메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 선택해주세요. \n");
				break;
			} // 관리자 및 사용자 모드 선택 switch 종료
		}
		
	} // 메인 메서드 종료

	static void admin(String[] manu, int[] price, int[] count, int[] salesCount) {
		// 관리자 모드
		String pw = "1234"; // 관리자 비밀번호
		int pwCount = 0; //비밀번호 시도 횟수 확인 변수
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true; // 관리자 모드로 진입하는 루프
		boolean session = false; // 로그인 상태 저장용

		System.out.println("\n======관리자 모드======");
		
		while (run) {
			session = adminLogin(pw, session);
			// 관리자 모드로 로그인 하는 메소드 호출
			if (session == true) {
				run = false;
			} else if (session == false) {
				pwCount++;
				if(pwCount >= 3) {
					System.out.println("\n비밀번호가 3번 이상 틀렸습니다. ");
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					} 
				} // 비밀번호 실패 횟수 확인 if문 종료
			}// 관리자 모드 로그인 메소드 종료
		
		System.out.println("\n===================================");
		System.out.println("1. 메뉴 변경");
		System.out.println("2. 가격 변경");
		System.out.println("3. 음료 리필");
		System.out.println("4. 재고 확인");
		System.out.println("5. 통계(이윤 계산)");
		System.out.println("9. 프로그램 종료");
		System.out.println("===================================");
		System.out.print("(1~9)>>>>");
		int select = inputInt.nextInt();
		
		switch(select) {
			case 1: 
				changeManu(manu, price, count);
				break;
			case 2: 
				changePrice(manu, price, count);
				break;
			case 3: 
				drinkRefill(manu, count);
				break;
			case 4: 
				for(int i = 0; i < manu.length; i++) {
					System.out.println(manu[i] + ":  " + price[i] + " (" + count[i] + "병)");
				}				
				break;
			case 5: 
				salesStatistics(manu, price, count, salesCount);
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				run = false;		
				
			default :
				System.out.println("잘못된 번호입니다.");
				System.out.println("번호를 다시 선택해주세요. \n");
				break;
		}
	}
	
	static void user(String[] manu, int[] price, int[] count, int[] salesCount) {
		// 사용자 모드
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;

		System.out.println("\n===================================");
		System.out.println("1. 음료 종류 및 금액");
		System.out.println("2. 음료 선택");
		System.out.println("3. 관리자 호출");
		System.out.println("9. 프로그램 종료");
		System.out.println("===================================");
		System.out.print("(1~9)>>>>");
		
		int select = inputInt.nextInt();
		
		switch(select) {
		case 1: 
			System.out.println("\n" + "===================================");
			System.out.println("음료 종류 및 재고, 금액을 확인하세요.");
			System.out.println("===================================");
		
			for(int i = 0; i < manu.length; i++) {
				System.out.println(manu[i] + "(" + count[i] + "병)" + ":  " + price[i] + "원");
			}
			break;
			
		case 2: 
			buyDrink(manu, price, count, salesCount);
			break;
			
		case 3: 
			System.out.println("관리자와 음성 연결을 합니다.");
			break;
			
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			run = false;		
			
		default :
			System.out.println("잘못된 번호입니다.");
			System.out.println("번호를 다시 선택해주세요. \n");
			break;
		}
	}
	
	static void buyDrink(String[] manu, int[] price, int[] count, int[] salesCount) {
		// 고객이 음료수를 구입하는 메소드
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner inputLine = new Scanner(System.in);
		boolean run = true;

		int totalPrice = 0; // 전체 금액 선언
		String salesDrink[] = new String [100];

		while (run) {
			System.out.println("\n" + "===================================");
			
			for(int i = 0; i < manu.length; i++) {
				System.out.println(manu[i] + ":  " + price[i] + " (" + count[i] + "병)");
			}
			System.out.println("===================================");
			System.out.print("구입할 음료수를 입력해주세요.");
			String drink = inputLine.nextLine();
			
			for (int i = 0; i < manu.length; i++) {
				if (drink.equals(manu[i])) {
					System.out.print("\n" + manu[i] + " >> 몇 병을 구입 하시겠습니까? (숫자입력)");
					int sale = inputInt.nextInt();
					System.out.print(manu[i] + ": " + sale + "병이 맞습니까? 네/ 아니오");
					String answer = inputString.next();
				
					if (answer.equals("네") && count[i]-sale >= 0) {
						totalPrice = (price[i] * sale) + totalPrice;
						salesDrink[i] = drink;
						salesCount[i] = sale;
						count[i]-= salesCount[i];
						run = true;
					} else if (answer.equals("네") && count[i]-sale < 0){
						System.out.println("현재 자판기에 있는 갯수가 부족합니다. 다시 입력해주세요.");
						run = true;
					} else if (answer.equals("아니오")){
						run = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");// 추가로 음료수 갯수를 변경하는 if문 종료
						run = true;
					} // 추가 변경하는 if문 종료
					System.out.println("===================================\n");
					System.out.print("추가 음료수를 구입 하시겠습니까? 네/아니오");
					String more = inputString.next();
					
					if (more.equals("네")) {
						run = true;
					} else if (more.equals("아니오")){
						System.out.println("\n===================================");
						
						for(int j=0; j < salesDrink.length; j++) {
							if (salesDrink[j] != null) {
						        System.out.println("구입 품목: " + salesDrink[j] + " (" + salesCount[j] + "병)");
						    }						}
						
						System.out.println("******** 총 결제 금액: " + totalPrice + "원 입니다.");
						System.out.println("\n결제하실 카드를 넣어주세요.");
						System.out.println("결제가 진행중입니다.");
						System.out.println("\n\n\n결제가 완료되었습니다.");
						System.out.println("음료를 받아가세요.");
						System.out.println("이용해주셔서 감사합니다.");
						run = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");// 추가로 음료수 갯수를 변경하는 if문 종료
						break;
					} 
				} // 음료수 선택하는 if문 종료
			} // 음료수 선택 for문 종료
		} // 선택 반복문 while 종료
	}

	static void salesStatistics(String[] manu, int[] price, int[] count, int[] salesCount) {
		// 판매 통계 계산하는 메소드
		
		System.out.println("\n" + "===================================");
		System.out.println("오늘 판매 통계를 계산합니다.");
		System.out.println("전체 판매한 전체 음료수 갯수입니다.");
		System.out.println("===================================");
		
		int totalCount = 0; //전체 판매 갯수를 계산하는 변수
		int totalPrice = 0; // 구입한 전체 음료수의 금액을 저장하는 변수
		
		for(int i = 0; i < manu.length; i++) {
			System.out.println(manu[i] + ": " + salesCount[i] + "병");
			totalCount += salesCount[i];
		}
		
		System.out.println("\n" + "===================================");
		
		for(int i = 0; i < manu.length; i++) {
			totalPrice += salesCount[i]*price[i];
			System.out.println(manu[i] + ": " + salesCount[i]*price[i] + "원");
		}
		
		System.out.println("\n" + "===================================");
		System.out.println("총 판매 갯수: " + totalCount + "병");
		System.out.println("총 판매 금액: " + totalPrice + "원");
	}

	static void drinkRefill(String[] manu, int[] count) {
		// 음료수를 리필하는 메소드
		
		Scanner inputLine = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("\n" + "===================================");
		System.out.println("음료 리필을 진행합니다.");
		System.out.println("전체 음료수 목록입니다.");
		System.out.println("===================================");
		
		for(int i = 0; i < manu.length; i++) {
			System.out.println(manu[i] + ":  " + count[i] + "병");
		}
		
		while (run) {
			System.out.println("===================================\n");
			System.out.print("리필을 진행할 음료수를 입력해주세요.");
			String drink = inputLine.nextLine();
			for (int i = 0; i < manu.length; i++) {
				if (drink.equals(manu[i])) {
					System.out.print("\n" + manu[i] + " >> 몇 병을 추가 하시겠습니까?");
					int addCount = inputInt.nextInt();
					count[i] = addCount + count[i];
					//newCount[i] = addCount + newCount[i];

					System.out.println("\n" + manu[i] + "의 갯수가 " + count[i] + "병으로 변경되었습니다.");
					System.out.println("\n===================================");
					
					for (int j = 0; j < manu.length; j++) {
						System.out.println(manu[j] + ":  " + count[j] + "병");
					}
					
					System.out.println("===================================\n");
					System.out.print("다른 음료수도 리필 하시겠습니까? 네/아니오");
					String more = inputString.next();
					
					if (more.equals("네")) {
						run = true;
					} else if (more.equals("아니오")){
						run = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");// 추가로 음료수 갯수를 변경하는 if문 종료
						run = true;
					} // 추가 변경하는 if문 종료
				} // 음료수 선택 및 갯수 변경하는 if문 종료
			} // 음료수 갯수 변경 for문 종료
		} // 리필 반복문 while 종료
	}

	static void changePrice(String[] manu, int[] price, int[] count) {
		// 가격을 변경하는 메서드
		
		Scanner inputLine = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("\n" + "===================================");
		System.out.println("가격 변경을 진행합니다.");
		System.out.println("전체 음료수 목록입니다.");
		System.out.println("===================================");
		
		for(int i = 0; i < manu.length; i++) {
			System.out.println(manu[i] + ":  " + price[i]);
		}
		
		while (run) {
			System.out.println("===================================\n");
			System.out.print("가격을 변경할 음료수를 입력해주세요.");
			String drink = inputLine.nextLine();
			for (int i = 0; i < manu.length; i++) {
				if (drink.equals(manu[i])) {
					System.out.print("\n" + manu[i] + " >> 얼마로 변경하시겠습니까?");
					int newPrice = inputInt.nextInt();
					price[i] = newPrice;

					System.out.println("\n" + manu[i] + "의 가격이 " + price[i] + "로 변경되었습니다.");
					System.out.println("===================================");
					
					for (int j = 0; j < manu.length; j++) {
						System.out.println(manu[j] + ":  " + price[j]);
					}
					
					System.out.println("===================================\n");
					System.out.print("다른 음료수의 가격을 변경하시겠습니까? 네/아니오");
					String more = inputString.next();
					
					if (more.equals("네")) {
						run = true;
					} else if (more.equals("아니오")){
						run = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");// 추가로 음료수 가격을 변경하는 if문 종료
						run = true;
					} // 추가 변경하는 if문 종료
				} // 음료수 선택 및 가격을 변경하는 if문 종료
			} // 음료수 가격 변경 for문 종료
		} // 가격 변경 반복문 while 종료
	}

	static void changeManu(String[] manu, int[] price, int[] count) {
		// 메뉴를 변경하는 메소드
		Scanner inputLine = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		boolean run = true;

		System.out.println("\n" + "===================================");
		System.out.println("메뉴 변경을 진행합니다.");
		System.out.println("전체 음료수 목록입니다.");
		System.out.println("===================================");
		
		for(int i = 0; i < manu.length; i++) {
			System.out.println(manu[i]);
		}
		
		while (run) {			
			System.out.println("===================================\n");
			System.out.print("변경할 음료수를 입력해주세요.");
			String drink = inputLine.nextLine();
			for (int i = 0; i < manu.length; i++) {
				if (drink.equals(manu[i])) {
					System.out.print("\n" + manu[i] + " >> 어떤 음료수로 변경하시겠습니까?");
					String newDrink = inputLine.nextLine();
					manu[i] = newDrink;

					System.out.println("\n" + manu[i] + "로 변경되었습니다.");
					System.out.println("===================================");
					
					for (int j = 0; j < manu.length; j++) {
						System.out.println(manu[j]);
					}
					
					System.out.println("===================================\n");
					System.out.print("다른 음료수를 변경하시겠습니까? 네/아니오");
					String more = inputString.next();
					
					if (more.equals("네")) { 
						run = true;
					} else if (more.equals("아니오")){
						run = false;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						run = true;
					} // 추가 변경하는 if문 종료
				} // 음료수 선택 및 변경하는 if문 종료
			} // 메뉴 변경 for문 종료
		} // 메뉴 변경 반복문 while 종료
	}

	static boolean adminLogin(String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		
		System.out.print("관리자 비밀번호를 입력하세요");
			System.out.print(" >>>> ");
			String login = inputLogin.next();
			
			if (login.equals(pw)) {
				System.out.println("\n관리자 모드로 진입합니다.");
				session = true;
			} else {
				System.out.println("\n관리자의 비밀번호가 일치하지 않습니다.");
				System.out.println("다시 로그인하세요.");
				session = false;
			} // 비밀번호 일치 판단문 종료
		return session; // 로그인 성공과 실패결과를 리턴함	
	} // 관리자 모드 로그인 메소드 종료

} // 클래스 종료
