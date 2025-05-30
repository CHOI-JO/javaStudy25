package ch05.extended.phone;

import java.util.Scanner;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		// 부모로부터 받은 필드 활용
		System.out.print("모델을 입력하세요: ");
		dmbCellPhone.setModel(inputStr.nextLine());	
		
		System.out.print("색상을 입력하세요: ");
		dmbCellPhone.setColor(inputStr.next());	
		// 자식 필드 활용

		System.out.print("채널 번호를 입력하세요: ");
		dmbCellPhone.setChannel(inputInt.nextInt());	
		
		System.out.println("\n\n---------------------------------");
		System.out.println("모델: " + dmbCellPhone.model + ", 색상: " + dmbCellPhone.color);
		System.out.println("---------------------------------\n");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("네, 안녕하세요");
		dmbCellPhone.sendVoice("어떻게 전화하셨어요?");
		dmbCellPhone.receiveVoice("편의점 맞나요?");
		dmbCellPhone.sendVoice("아닙니다. 잘못 거셨습니다.");
		dmbCellPhone.receiveVoice("죄송합니다.");
		dmbCellPhone.hangup();
		System.out.println("---------------------------------\n");

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(9);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
		
	}
}
