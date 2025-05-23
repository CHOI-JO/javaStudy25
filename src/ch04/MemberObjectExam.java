package ch04;

import java.util.Scanner;

public class MemberObjectExam {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 처리해보자.
		
		Scanner input = new Scanner(System.in);
		
		Member[] members = null;
		
		System.out.println("가입할 회원 수를 입력하세요");
		System.out.print(">>>>> ");
		int count = input.nextInt();
		members = new Member[count]; // 키보드로 입력한 숫자만틈 배열 생성
		
		System.out.println("============================");
		System.out.println("회원 가입 프로그램을 시작합니다.");
		System.out.println("============================");
		boolean run = true;
		while(run) {
			
			System.out.println("\n1. 회원 가입");
			System.out.println("2. 회원 전체 보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("***************** 1~5까지만 입력하세요(다른 키가 눌리면 꺼집니다.)");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			switch(select) {
			case 1 :
				Member member1 = new Member(); // 객체 생성
				
				for(int i = 0; i<members.length ; i++) {
				member1 = member1.memberAdd(input); // 생성된 객체 메서드 호출 및 실행
				members[i] = member1;
				}
				break;
			case 2 :
				Member member2 = new Member(); // 객체 생성
				member2.memberAllList(members); //전체 보기 메서드 실행
				break;
			case 3 :
				Member member3 = new Member(); // 객체 생성
				member3.memberLogin(members); // 로그인 메서드 실행
				break;
			case 4 :
				Member member4 = new Member(); // 객체 생성
				member4.memberUpdate(members); // 회원 수정 업데이트 실행
				break;
			case 5 :
				Member member5 = new Member(); // 객체 생성
				member5.memberDelelte(members); // 회원 탈퇴 메서드 실행
				break;
			default :
				System.out.println("회원 가입 프로그램 종료");
				run = false;
			
			} // switch 문 종료
			
			
			
			
		} // while문 종료
	} // 메인 메서드 종료

}// 클래스 종료
