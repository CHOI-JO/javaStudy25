package ch01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("회원가입" + "\n");
		System.out.print("가입할 ID를 입력하세요 : ");
		String id = input.nextLine();
		System.out.print("설정할 비밀번호를 입력하세요 : ");
		String pw = input.nextLine();
		System.out.print("\n" + "성별을 선택해주세요. 여자 = 1, 남자 = 2 : " );
		String gender= input.nextLine();
		if(gender.equals("1")) {
		System.out.println("당신의 성별은 여자 입니다." + "\n");
		} else {
			System.out.println("당신의 성별은 남자 입니다." + "\n");
		}
		System.out.print("생년월일을 입력하세요 : " );
		String date= input.nextLine();
		System.out.println("당신의 생년월일은 " + date + "입니다." + "\n");

		System.out.println("-----------------------------------------------------");
		System.out.println("로그인을 시작합니다." + "\n");
	
	    // 로그인 시도가 끝날 때까지 반복
		do {
			System.out.print("ID : ");
			String inputId = input.nextLine();
			
			System.out.print("PW : ");
			String inputPw = input.nextLine();

	    // ID와 PW가 일치하면 로그인 성공
		if(inputId.equals(id) & inputPw.equals(pw)) {
			System.out.println("로그인 되었습니다.");
			break; // 로그인 성공하면 반복문 종료
		} else {
			System.out.println("ID와 PW가 일치하지 않습니다." + "\n");
			System.out.println("ID와 PW를 다시 입력해주세요");
		}
		
		} while (true); // 조건 없이 계속 반복 (로그인 성공할 때까지)

	}

}
