package ch04.marioKart.service;

import java.util.Scanner;

import ch04.marioKart.dto.CharacterDTO;
import ch04.marioKart.dto.MemberDTO;

public class KartService {

	public void manu(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState) {
		// 카트를 관리하는 서비스
		for (int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
			System.out.print("이름 : " + characterDTOs[i].name + " 무게 : " + characterDTOs[i].weight + "\n");
			} // if문 종료
		}// for문 종료
		
			System.out.println("캐릭터를 선택하세요");
			System.out.print(">>>");
			String selectChar = input.next();

			for( int i = 0 ; i< characterDTOs.length ; i++) {
			if (characterDTOs[i] != null && characterDTOs[i].name.equals(selectChar)) {
			loginState.characterDTO = characterDTOs[i]; 
			// 키보드로 선택한 캐릭터 정보를 로그인한 객체에 연결!!!!
			}// if문 종료
			}// for문 종료
			System.out.println(loginState.nickName + "님은 " + loginState.characterDTO.name + "을 선택하셨습니다. ");

	}

}
