package ch05.account;

import java.util.Scanner;

import ch05.account.dto.AccountDTO;
import ch05.account.service.HanaBankService;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);

	public static AccountDTO[] hanaBank = new AccountDTO[100];
	public static AccountDTO[] woriBank = new AccountDTO[100];
	public static AccountDTO[] nhBank = new AccountDTO[100];
	public static AccountDTO sesseion = null;
		
	// 생성자
	static {
		
	}
	
	// 메소드
	public static void main(String[] args) {
		boolean run = true; //주메뉴 반복용
		while(run) {
			System.out.println("================");
			System.out.println("은행 프로그램입니다.	");
			System.out.println("================");
			System.out.println("1. 하나 은행");
			System.out.println("2. 우리 은행");
			System.out.println("3. 농협 은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("하나 은행으로 진입합니다.");
				HanaBankService HanaBackService = new HanaBankService();
				HanaBackService.menu(inputInt, inputStr, hanaBank);
				break;
			case "2" :
				System.out.println("우리 은행으로 진입합니다.");
				break;
			case "3" :
				System.out.println("농협 은행으로 진입합니다.");
				break;
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default : 
				System.out.println("1~4까지 입력하세요");				
			}// 메뉴 선택문 종료(switch)
		} // 주메뉴 종료(while)
	} // 메인 메서드 종료
} // 클래스 종료
