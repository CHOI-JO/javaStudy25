package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.dto.KartDTO;
import ch04.marioKart.dto.CharacterDTO;
import ch04.marioKart.dto.GliderDTO;
import ch04.marioKart.dto.ItemDTO;
import ch04.marioKart.dto.MemberDTO;
import ch04.marioKart.dto.TireDTO;
import ch04.marioKart.service.KartService;
import ch04.marioKart.service.MemberService;

public class MarioKartExam {
	// 필드 -> main()메서드가 있는 필드는 static용으로 만듬
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10]; //10명 회원
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; // 캐릭터 15명 생성
	public static KartDTO[] kartDTOs = new KartDTO[8]; // 카트 자동차 8개 배열
	public static GliderDTO[] gliderDROs = new GliderDTO[10]; // 글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[10]; // 타이어 배열
	public static ItemDTO[] itemDTOs = new ItemDTO[10]; // 아이템 배열

	public static MemberDTO LoginState ; // 세션과 같은 기능, 로그인 성공시 객체를 가지고 있는 용도
	
	// 생성자 -> new MarioKartExam()로 객체를 생성하지 않는다
	// static{	} 블럭을 사용한다. 초기화용
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.3, 3.5, 4.6, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.1, 4.0, 3.4, 4.3, 3.6);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.3, 4.2, 3.6, 4.4, 3.4); 
		// 4개의 객체 생성 완료

		// 객체를 배열에 넣어서 관리하자
		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;

	} // 스테틱 블록 종료 (main 메서드 실행시 초기화 값)
	
	
	// 정적 메서드
	public static void main(String[] args) {
		// "static"를 붙이면 객체용이 아니다. 고정된(정적) 컨트롤러이다.
		// MVC 패턴을 이용해서 마리오카트 프로그램 제작
		// DTO: 객체용 (Date Transfer Object)
		// service: 부메뉴용 CRUD
		// main(): 컨트롤러용 (주메뉴, 분기담당)
		
		System.out.println("============마리오 카트 게임을 시작합니다.============");
		boolean run = true; // 처음 구동
		Scanner input = new Scanner(System.in);
		while(run) {
			System.out.println("1. 회원 관리 | 2. 카트 관리 | 3. 게임 실행 | 4.게임 종료 ");
			System.out.print(">>>> ");
			int select = input.nextInt(); // 숫자가 아닌 경우, 오류 발생함
			
			switch(select) {
			case 1: 
				System.out.println("\n회원 관리 클래스로 진입힙니다.\n");
				MemberService memberService = new MemberService();
				memberService.menu(input, memberDTOs, LoginState);
				System.out.println("현재 로그인한 회원 이름은 : " + LoginState.nickName);
				break;
			case 2: 
				System.out.println("\n카트 관리 클래스로 진입힙니다.\n");
				KartService kartService = new KartService();
				kartService.manu(input, characterDTOs, LoginState);
				break;
			case 3: 
				System.out.println("\n게입 실행 클래스로 진입힙니다.\n");
				break;
			case 4: 
				System.out.println("\n게임을 종료합니다.\n");
				break;
			default : 
				System.out.println("\n1~4번 숫자만 입력하세요.\n");
				//break;
			}// switch문 종료
		}// while문 종료
	} //main()종료
 
} // class 종료
