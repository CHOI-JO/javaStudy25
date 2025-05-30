package ch05.account.service;

import java.util.Scanner;

import ch05.account.Account;
import ch05.account.dto.AccountDTO;

public class HanaBankService {
	// 객체
	
	
	//생성자
	
	
	//메서드
	
	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
	boolean subRun = true;
	while(subRun) {
		System.out.println("\n==========================================================");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 이체 | 6. 종료");
		System.out.println("==========================================================");
		System.out.print("선택 >> ");
		String select = inputStr.next();

		switch(select) {
		case "1" :
			createAccount(inputInt, inputStr, hanaBank);
			break;
		case "2" :
			accountList(inputInt, inputStr, hanaBank);
			break;
		case "3" :
			deposit(inputInt, inputStr, hanaBank);
			break;
		case "4" :
			withdraw(inputInt, inputStr, hanaBank);
			break;
		case "5" :
			transfer(inputInt, inputStr, hanaBank);
			break;
		case "6" :
			System.out.println("하나은행 프로그램을 종료합니다.");
			subRun = false;
			break;
		default :
			System.out.println("1~6까지 숫자를 입력하세요");
			break;
		}
		}
	}

	private void transfer(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
		// 이체 메서드
		System.out.println("\n--------------");
		System.out.println("   계좌 이체   ");
		System.out.println("--------------");
		
		System.out.print("출금 계좌 번호: ");
		String ano = inputStr.next();
		System.out.print("입금 은행: ");
		String transferBank = inputStr.next();
		System.out.print("입금 계좌 번호: ");
		String transferAno = inputStr.next();
		System.out.print("이체 금액: ");
		int transferMoney = inputInt.nextInt();
		AccountDTO outputAccount = findAccount(ano, hanaBank);
		AccountDTO transferAccount = findAccount(transferAno, hanaBank);
		transferAccount.setBankname(transferBank);
		
		if(outputAccount == null) {
			System.out.println("출금 계좌 번호가 없습니다.");
			return;
		} 
		if(transferAccount == null) {
			System.out.println("입금 계좌 번호가 없습니다.");
			return;
		}// 계좌번호 확인하는 if문 종료
		
		if(outputAccount.getBalance() < transferMoney) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			transferState(inputInt, transferMoney, outputAccount, transferAccount, hanaBank);
		}//잔액 확인 후, 출금하는 if문 종료
	} // 이체 메서드 종료

	private void transferState(Scanner inputInt, int transferMoney, AccountDTO outputAccount, AccountDTO transferAccount, AccountDTO[] hanaBank) {
		// 이체 진행상황을 확인하는 메서드

		System.out.println("\n이체 정보를 확인합니다.");
		System.out.println("----------------------------------");
		System.out.println("입금 은행명: " + outputAccount.getBankname());
		System.out.println("입금 계좌 번호: " + outputAccount.getAno());
		System.out.println("이체 금액: " + transferMoney);
		System.out.println("----------------------------------");
		System.out.print("이체 정보가 맞습니까? 1. 네 | 2. 아니오");
		int confirm = inputInt.nextInt();
		
		switch(confirm) {
		case 1 :
			outputAccount.setBalance(outputAccount.getBalance() - transferMoney);
			System.out.println(outputAccount.getOwner() + "님의 계좌에서 정상적으로 이체되었습니다.");
			System.out.println("----------------------------------------------");
			System.out.println("출금 계좌 번호: " + outputAccount.getAno());
			System.out.println("입금 계좌 번호: " + outputAccount.getBankname() + "(" + transferAccount.getAno() +")");
			System.out.println("이체 금액: " + transferMoney);
			System.out.println("출금 계좌 현재 잔액: " + outputAccount.getBalance());
			System.out.println("----------------------------------------------\n");	
			break;
		case 2 :
			System.out.println("이체를 취소합니다. 처음부터 다시 입력해주세요.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			break;
		}// 이체 정보 확인하는 switch문 종료
	}

	private void withdraw(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
		// 출금 메서드
		System.out.println("\n---------");
		System.out.println("   출금   ");
		System.out.println("---------");
		
		System.out.print("출금 계좌 번호: ");
		String ano = inputStr.next();
		System.out.print("출금 금액: ");
		int withdraw = inputInt.nextInt();
		AccountDTO outputAccount = findAccount(ano, hanaBank);

		if(outputAccount == null) {
			System.out.println("찾는 계좌 번호가 없습니다.");
			return;
		} // 계좌번호 확인하는 if문 종료
		
		if(outputAccount.getBalance() < withdraw) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			outputAccount.setBalance(outputAccount.getBalance() - withdraw);
			System.out.println(outputAccount.getOwner() + "님의 계좌에서 정상적으로 출금되었습니다.");
			System.out.println("-----------------------------------------");
			System.out.println("계좌 번호: " + outputAccount.getAno());
			System.out.println("현재 잔액: " + outputAccount.getBalance());
			System.out.println("-----------------------------------------\n");		
		}//잔액 확인 후, 출금하는 if문 종료
	}// 출금 메소드 종료

	private void deposit(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
		// 계좌 입금 메서드
		System.out.println("\n---------");
		System.out.println("   예금   ");
		System.out.println("---------");
		
		System.out.print("예금 계좌 번호: ");
		String ano = inputStr.next();
		System.out.print("예금 금액: ");
		int deposit = inputInt.nextInt();
		AccountDTO inputAccount = findAccount(ano, hanaBank);

		if(inputAccount == null) {
			System.out.println("찾는 계좌 번호가 없습니다.");
			return;
		}
		
		inputAccount.setBalance(inputAccount.getBalance() + deposit);

		System.out.println(inputAccount.getOwner() + "님의 계좌에 정상적으로 입금되었습니다.");
		System.out.println("-----------------------------------------");
		System.out.println("계좌 번호: " + inputAccount.getAno());
		System.out.println("현재 잔액: " + inputAccount.getBalance());
		System.out.println("-----------------------------------------\n");
	} // 입금용 메서드 종료

	private AccountDTO findAccount(String ano, AccountDTO[] hanaBank) {
		// 예금, 출금, 이체 계좌번호를 확인해주는 메서드
		AccountDTO account = null;
		
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] != null) { // 하나은행 배열이 널이 아님
				String dbAno = hanaBank[i].getAno(); // 배열에 있는 계좌번호를 가져와 dbAno에 넣음
				if(dbAno.equals(ano)) { // 키보드로 입력된 계좌 번호와 dbAno와 같은 값을 찾음
					account = hanaBank[i]; // 빈 객체에 찾은 객체를 넣는다.
					break;
				} // 같은 번호 판단 if문 종료
			} // 빈 객체 확인 if문 종료
		}// 예금할 계좌 조회 for문 종료
		return account;
	}

	private void accountList(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
	// 계좌 목록 메서드(직원용)
		System.out.println("\n----------------");
		System.out.println("하나 은행 계좌 목록");
		System.out.println("----------------");

		for(int i =0; i < hanaBank.length; i++) {
			AccountDTO accountlist = hanaBank[i];
			if(accountlist != null) {
				System.out.print(accountlist.getAno());
				System.out.print(" |\t");
				System.out.print(accountlist.getOwner());
				System.out.print(" |\t");
				System.out.println(accountlist.getBalance());
			}// 지어있는 배열 확인후 출력하는 if문 종료
		}// 계좌 리스트 확인하는 for문 종료
	} // 하나은행 전체 계좌를 확인하는 메서드 종료
	

	private void createAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {
		// 계좌 생성
		System.out.println("\n-----------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("-----------------");
		AccountDTO myAccount = new AccountDTO();
		
		System.out.print("계좌번호: ");
		myAccount.setAno(inputStr.next()); // 계좌번호 입력해서 ano로 전달
		System.out.print("계좌주: ");
		myAccount.setOwner(inputStr.next()); // 계좌주를 입력하여 owner로 전달
		System.out.print("초기 입금액: ");
		myAccount.setBalance(inputInt.nextInt()); //초기금액 입력하여 balance로 전달
		myAccount.setBankname("하나은행"); // 빈 객체에 데이터 입력 완료
	
		for(int i = 0; i<hanaBank.length; i++) {
			if(hanaBank[i] == null) { // 배열의 null위치를 찾음
				hanaBank[i] = myAccount;
				break;
			} // 입력한 객체 연결 if문
		} // 하나은행 배열을 0번에서부터 반복하는 코드
		System.out.println("계좌 생성이 정상적으로 되었습니다. ");
	} // 계좌 생성하는 메서드 종료
}
