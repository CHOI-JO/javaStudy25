package ch02;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("회원가입" + "\n");
		System.out.println("_______________________________________");
		System.out.println("가입할 아이디를 입력하세요");
		System.out.println("(아이디는 5자 이상이어야 합니다.)");
		String id = input.next();
		
		if (id.length() < 5 ) { // id의 문자의 갯수 확인, 5자 이하이면 id 다시 입력
			System.out.println("\n" + "_______________________________________");
			System.out.println("아이디가 5자리 이하입니다.");
			System.out.println("아이디를 다시 입력하세요");
		} else { // id의 문자가 5자 이상이면 비밀번호 설정 가능
			System.out.println("_______________________________________");
			System.out.println("등록할 비밀번호를 입력하세요");
			System.out.println("(비밀번호는 8자 이상이어야 합니다.)");
			String pw = input.next();

			if (pw.length() < 8 ) { //비밀번호의 문자 갯수 확인, 8자 이하이면 비밀번호 다시 입력
				System.out.println("\n" + "_______________________________________");
				System.out.println("비밀번호가 8자리 이하입니다.");
				System.out.println("비밀번호를 다시 입력하세요");
			} else {  // 비밀번호의 문자가 8자 이상이면 가입완료
				System.out.println("\n" + "_______________________________________");
				System.out.println("회원가입이 완료되었습니다.");
				System.out.println("_______________________________________");
				System.out.println("\n" + "아이디: " + id + "\n" + "비밀번호: " + pw);
				System.out.println("_______________________________________");
				System.out.println("로그인 하시겠습니까?"); // 가입한 아이디와 비밀번호로 로그인 여부 확인
				System.out.print("yes or no   >>>>>>>  ");
				String loginConfirm = input.next();
				
					if(loginConfirm.equalsIgnoreCase("yes")) { // 입력 값이 yes면 로그인 가능
						System.out.println("\n" + "_______________________________________");
						System.out.println("성공적으로 로그인 되었습니다.");
					} else if(loginConfirm.equalsIgnoreCase("no")) {
						System.out.println("\n" + "_______________________________________");
						System.out.println("로그인이 취소 되었습니다.");
					} else {
						System.out.println("\n" + "_______________________________________");
						System.out.println("로그인 여부 입력값이 잘못되었습니다.");
						System.out.println("yes or no로 다시 입력해주세요.");
					}
				}
		}
	}
}

