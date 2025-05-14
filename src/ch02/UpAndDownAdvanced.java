package ch02;

import java.util.Scanner;

public class UpAndDownAdvanced {

	public static void main(String[] args) {
		// 업엔다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다.(1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 up / down을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 당첨 사실을 알린다.
		// 3번 안에 성공시 상품 증정용 코드 추가 

		int count = 0;
		int inputNumber = 0;
		int answer=(int)(Math.random()*50) + 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("up and down 게임을 시작합니다.");
		System.out.println("3번안에 성공시, 상품 증정을 드립니다.");
		System.out.println("당신에게 특별한 행운이 있기를 바랍니다.");
		System.out.println("===============================" + "\n");
		
		do {
			System.out.println("\n" + "1~50 사이의 숫자를 입력하세요.");
			inputNumber = input.nextInt();
			
			if(inputNumber < answer) {
				System.out.println("UP");
				count++;
			} else if (inputNumber > answer) {
				System.out.println("DOWN");
				count++;
			}
		} while (answer != inputNumber);
		 
		System.out.println("정답입니다.");
		System.out.println("정답은 " + answer + " 입니다.");
		System.out.println("당신이 정답을 시도한 횟수는 " + count + " 입니다.");
		if(count <= 3) {
			System.out.println("\n" + "===============================");
			System.out.println("축하합니다! 3번안에 성공하셨습니다.");
			System.out.println("상품을 증정합니다. 관리자에게 문의해주세요.");
		} else {
			System.out.println("\n" + "===============================");
			System.out.println("3번안에 성공하지 못하였습니다.");
			System.out.println("다음 기회에 다시 시도해주세요.");
		}

	}

}
