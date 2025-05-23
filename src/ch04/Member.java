package ch04;

import java.util.Scanner;

public class Member {
		
		// 필드 : 객체가 가지고 있어야 할 값(변수)
		// 회원번호, id, 성명, 암호, 이메일, 주소, 전화번호
		public int mno ;
		public String id;
		public String pw;
		
		
		// 생성자 : exam 클래스의 main()메서드에서 new로 호출할 때 동작
		public Member() {
			// 기본 생성자 : 클래스명과 같은 메서드
			// Member member = new Member();
		}
		
		
		// 메서드 : Member 클래스에서 행해지는 동작 CRUD
		public Member memberAdd(Scanner input) { // 메인에서 전달된 스캐너 객체
			Member member = new Member(); //리턴용 객체

			System.out.println("\n============================");
			System.out.println("회원 가입용 메서드 입니다.");
			System.out.println("============================\n");
			System.out.println("회원 번호를 입력하세요.(숫자)");
			System.out.print(">>>> ");
			member.mno = input.nextInt();

			System.out.println("회원 id를 입력하세요.");
			System.out.print(">>> ");
			member.id = input.next();
			
			System.out.println("회원 pw를 입력하세요.");
			System.out.print(">>> ");
			member.pw = input.next();
			
			return member;
			
		} // memberAdd() 메서드 종료
		
		public void memberAllList(Member[] members) {
			System.out.println("\n============================");
			System.out.println("모든 회원 보기 리스트 메서드 입니다.");
			System.out.println("============================\n");
			for(int i = 0; i < members.length; i++) {
				System.out.print("회원 번호 : " + members[i].mno);
				System.out.print(", 회원 id : " + members[i].id);
				System.out.println(", 회원 pw : " + members[i].pw);
				System.out.println("============================");
			}

		} // memberAllList() 메서드 종료
		
		public void memberLogin(Member[] members) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("============================");
			System.out.println("로그인 메서드 입니다.");
			System.out.println("============================\n");
			System.out.println("회원 id를 입력하세요.");
			System.out.print(">>>> ");
			String memberId = input.next();

			System.out.println("회원 pw를 입력하세요.");
			System.out.print(">>> ");
			String memberPw = input.next();
			
			for(int i = 0; i < members.length; i++) {
			if(memberId.equals(members[i].id)  || memberPw.equals(members[i].pw)) {
				System.out.println("\n============================");
				System.out.println(members[i].id + "님 로그인에 성공하셨습니다.");
			} else {
				System.out.println("\n============================");
				System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
				}//id와 pw비교문 if 종료
			} //for문 종료
		}// 메서드 종료
		
		public void memberUpdate(Member[] members) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("============================");
			System.out.println("회원 수정 메서드 입니다.");
			System.out.println("============================\n");
			System.out.println("수정할 항목을 입력하세요.");
			System.out.println("1. 회원번호");
			System.out.println("2. 비밀번호");
			System.out.println("***************** 1~2까지만 입력하세요(다른 키가 눌리면 꺼집니다.)");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			System.out.println("\n수정할 회원의 id를 입력하세요.");
			System.out.print(">>>> ");
			String memberId = input.next();

			switch(select) {
			case 1 : 
				for(int i = 0; i < members.length; i++) {
					if(memberId.equals(members[i].id)) {
						System.out.println("\n============================");
						System.out.println("수정할 회원번호를 입력하세요.(숫자)");
						System.out.print(">>> ");
						int newMno = input.nextInt();
						
						members[i].mno = newMno;
						System.out.println("성공적으로 회원번호가 수정되었습니다.");
						System.out.println("수정된 회원 번호: " + members[i].mno);
					} else {
						System.out.println("\n============================");
						System.out.println("입력하신 회원 id가 존재하지 않습니다.");
						} // 회원번호 수정 if문 종료
				} // 회원 번호 수정 for문 종료
				break;
				
			case 2 :
				for(int i = 0; i < members.length; i++) {
					if(memberId.equals(members[i].id)) {
						System.out.println("\n============================");
						System.out.println("수정할 비밀번호를 입력하세요.");
						System.out.print(">>> ");
						String newPw = input.next();
						
						members[i].pw = newPw;
						System.out.println("성공적으로 비밀번호가 수정되었습니다.");
						System.out.println("수정된 비밀번호: " + members[i].pw);
					} else {
						System.out.println("\n============================");
						System.out.println("입력하신 회원 id가 존재하지 않습니다.");
						} // 회원번호 수정 if문 종료
				} // 회원 번호 수정 for문 종료
				break;
			default :
				System.out.println("회원 가입 프로그램 종료");
				break;
			}
		}
		
		public void memberDelelte(Member[] members) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("============================");
			System.out.println("회원 삭제 메서드 입니다.");
			System.out.println("============================\n");
			System.out.println("삭제할 회원번호 입력하세요.");
			System.out.print(">>> ");
			int deleteMno = input.nextInt();
			
			for(int i = 0; i < members.length; i++) {
				if(deleteMno == members[i].mno) {
					System.out.println(deleteMno + "의 정보가 삭제되었습니다.");
					members[i] = null;
				} else {
					System.out.println("\n============================");
					System.out.println("입력하신 회원번호가 존재하지 않습니다.");
					} // 회원번호 수정 if문 종료
			} // 회원 번호 수정 for문 종료
			

			
		}
}
