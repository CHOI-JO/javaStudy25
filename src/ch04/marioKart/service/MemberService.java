package ch04.marioKart.service;

import java.util.Scanner;

import ch04.marioKart.dto.MemberDTO;

public class MemberService { 
	// 회원 관리용 클래스로 CRUD까지  제공
	// 부메뉴용
	
	// 필드
	
	// 생성자
	
	// 메서드
	
	// 부메뉴용 메서드 -> 필요한 파라미터???? (입력 객체, 회원 배열, 로그인 상태)
	public MemberDTO menu (Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		System.out.println("============회원 관리 메뉴에 진입하셨습니다.============");
		boolean subRun = true;
		
		while(subRun) {
			System.out.println("1. 가입 | 2. 로그인 | 3. 정보 조회 | 4. 수정 | 5 삭제 | 6. 종료");
			System.out.print(">>>>> ");
			String select = input.next();
			
			switch(select) {
			case "1": 
				System.out.println("\n회원 가입을 진행합니다.\n");
				create(input, memberDTOs);
				break;
			case "2": 
				System.out.println("\n로그인을 진행합니다.\n");
				loginState = login(input, memberDTOs, loginState);
				break;
			case "3": 
				System.out.println("\n회원 정보를 조회합니다.\n");
				search(input, memberDTOs);
				break;
			case "4": 
				System.out.println("\n회원 정보를 수정합니다.\n");
				edit(input, memberDTOs, loginState);
				break;
			case "5": 
				System.out.println("\n회원을 삭제합니다.\n");
				delete(input, memberDTOs);
				break;
			case "6" : 
				System.out.println("\n회원 관리를 종료합니다.");
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				subRun = false;
				break;
			case "99" :
				System.out.println("\n히든 메뉴로 진입하였습니다.");
				System.out.println("캐릭터 해킹을 진행합니다.\n");
				break;
			default : 
				System.out.println("\n1~5번 숫자만 입력하세요.\n");
			} // switch문 종료
		} // while 문 종료
		
		return null;
	} // 메뉴 메서드 종료

	public void search(Scanner input, MemberDTO[] memberDTOs) {
		// 현재 회원 정보를 확인하는 메서드
		MemberDTO searchMember = new MemberDTO();

		System.out.println("확인할 회원 id를 입력하세요");
		System.out.print(">>> ");
		searchMember.id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>> ");
		searchMember.pw = input.next();
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(searchMember.id) && memberDTOs[i].pw.equals(searchMember.pw)) {
				System.out.println("1. ID: " + memberDTOs[i].id);
				System.out.println("2. 비밀번호: " + memberDTOs[i].pw);
				System.out.println("3. 닉네임: " + memberDTOs[i].nickName);
				System.out.println("4. 이메일주소: " + memberDTOs[i].email);
				break;
			} // if 문 종료
		} // for 문 종료
	}

	public MemberDTO delete(Scanner input, MemberDTO[] memberDTOs) {
		// 회원을 삭제하는 메서드
		MemberDTO deleteMember = new MemberDTO();

		System.out.println("\n삭제할 회원의 id를 입력하세요.");
		System.out.print(">>> ");
		deleteMember.id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>> ");
		deleteMember.pw = input.next();
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(deleteMember.id) && memberDTOs[i].pw.equals(deleteMember.pw)) {
				System.out.println(memberDTOs[i].id + "가 삭제되었습니다.");
				memberDTOs[i] = null;
				memberDTOs[i] = memberDTOs[i+1];
				break;
			} // if 문 종료
		} // for문 종료
		return null;
	}

	public MemberDTO edit(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 정보를 수정하는 메서드
		MemberDTO editMember = new MemberDTO();

		System.out.println("회원 정보를 수정합니다.");
		System.out.println("수정할 id를 입력하세요");
		System.out.print(">>> ");
		editMember.id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>> ");
		editMember.pw = input.next();
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(editMember.id) && memberDTOs[i].pw.equals(editMember.pw)) {
				System.out.println("\n===========================");
				System.out.println("1. 비밀번호 변경 | 2. 닉네임 변경 | 3. 이메일 주소 변경");
				System.out.print(">>> ");
				String select = input.next();
				
				switch(select) {
				case "1" :
					System.out.println("\n변경할 비밀번호를 입력하세요");
					System.out.print(">>> ");
					memberDTOs[i].pw = input.next();
					System.out.println("비밀번호가 변경되었습니다.");
					break;
					
				case "2" :
					System.out.println("\n변경할 닉네임을 입력하세요");
					System.out.print(">>> ");
					memberDTOs[i].nickName = input.next();
					System.out.println("닉네임 변경되었습니다.");
					break;
					
				case "3" :
					System.out.println("\n변경할 이메일 주소를 입력하세요");
					System.out.print(">>> ");
					memberDTOs[i].email = input.next();
					System.out.println("이메일 주소가 변경되었습니다.");
					break;
				default : 
					System.out.println("\n1~3번 숫자만 입력하세요.\n");
				}
				break;
			} // if 문 종료
		} // for문 종료
		return loginState;
	}

	public void create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원 가입용 메서드
		System.out.println("\n=============================");
		System.out.println("회원 가입용 메서드에 오신 걸 환영합니다.\n");
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("사용할 id를 입력하세요");
		System.out.print(">>> ");
		memberDTO.id = input.next();
		
		System.out.println("사용할 pw를 입력하세요");
		System.out.print(">>> ");
		memberDTO.pw = input.next();
		
		System.out.println("사용할 닉네임을 입력하세요");
		System.out.print(">>> ");
		memberDTO.nickName = input.next();
		
		System.out.println("사용할 이메일을 입력하세요");
		System.out.print(">>> ");
		memberDTO.email = input.next();
		
		// 배열에 0 ~ null 값이면 삽입 (exam)
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] == null) { // null이면 값이 없음
				memberDTOs[i] = memberDTO;
				break;
			} // if 문 종료
		} // for문 종료
		
		System.out.println(memberDTO.nickName +  "님 회원가입을 축하드립니다.");
	}

	public MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인용 메서드
		
		System.out.println("id를 입력하세요");
		System.out.print(">>> ");
		String id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>> ");
		String pw = input.next();
		
		// 키보드로 입력 완료 ->빈객체 생성 -> 삽입
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id) && memberDTOs[i].pw.equals(loginMember.pw)) {
				memberDTOs[i] = loginMember;
				System.out.println("로그인 되었습니다.");
				break;
			} // if 문 종료
		} // for문 종료
		return loginState;
	}
} // 클래스 종료
