package ch04.marioKart.dto;

public class MemberDTO {
	// 필드
	public String id; // 아이디(로그인용)
	public String pw; // 암호(로그인용)
	public String nickName; // 별명(게임용)
	public String email; // 암호 찾기용
	
	public CharacterDTO characterDTO;
	
	// 생성자
	public String loginState = "on";
	
	// 메서드 

}
