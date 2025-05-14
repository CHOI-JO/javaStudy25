package ch02;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 랜덤 로또
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("로또 당첨 여부 확인");
		System.out.println("______________________________");
		
		int win1 = (int)(Math.random()*45) + 1;
		int win2 = (int)(Math.random()*45) + 1;
		int win3 = (int)(Math.random()*45) + 1;
		int win4 = (int)(Math.random()*45) + 1;
		int win5 = (int)(Math.random()*45) + 1;
		int win6 = (int)(Math.random()*45) + 1;

		System.out.println("첫 번째 번호를 입력하세요");
		int inNum1 = input.nextInt();
		
		System.out.println("두 번째 번호를 입력하세요");
		int inNum2 = input.nextInt();
		System.out.println("세 번째 번호를 입력하세요");
		int inNum3 = input.nextInt();
		System.out.println("네 번째 번호를 입력하세요");
		int inNum4 = input.nextInt();
		System.out.println("다섯 번째 번호를 입력하세요");
		int inNum5 = input.nextInt();
		System.out.println("여섯 번째 번호를 입력하세요");
		int inNum6 = input.nextInt();
		System.out.println("______________________________");

		System.out.println("당신이 입력한 6자리의 로또 번호는 " + inNum1 + " " + inNum2 + " " + inNum3 + " "+ inNum4 + " " + inNum5 + " "+ inNum6 + " ");
		
		System.out.print("당신이 입력한 로또 번호가 맞습니까? (yes or no)  >>>>>  ");
		String check = input.next();
		if(check.equalsIgnoreCase("yes")) {
			int counter  = 0;
			if(inNum1 == win1 || inNum2 == win1 || inNum3 == win1 || inNum4 == win1 || inNum5 == win1 || inNum6 == win1) {
				counter++;
			}
			if(inNum1 == win2 || inNum2 == win2 || inNum3 == win2 || inNum4 == win2 || inNum5 == win2 || inNum6 == win2) {
				counter++;
			}
			if(inNum1 == win3 || inNum2 == win3 || inNum3 == win3 || inNum4 == win3 || inNum5 == win3 || inNum6 == win3) {
				counter++;
			}
			if(inNum1 == win4 || inNum2 == win4 || inNum3 == win4 || inNum4 == win4 || inNum5 == win4 || inNum6 == win4) {
				counter++;
			}
			if(inNum1 == win5 || inNum2 == win5 || inNum3 == win5 || inNum4 == win5 || inNum5 == win5 || inNum6 == win5) {
				counter++;
			}
			if(inNum1 == win6 || inNum2 == win6 || inNum3 == win6 || inNum4 == win6 || inNum5 == win6 || inNum6 == win6) {
				counter++;
			}
			
			System.out.println("\n" + "______________________________");
			System.out.println("이번주 로또 당첨 번호는 " + win1 + " " + win2 + " " + win3 + " " + win4 + " " + win5 + " " + win6 + " 입니다.");
			
			System.out.println("\n" + "______________________________");
			if (counter == 0) {
				System.out.println("번호가 모두 맞지 않습니다.");
			} else if (counter == 1) {
				System.out.println("축하합니다. 번호가 1개 맞았습니다.  당신은 6등에 당첨되었습니다.");
			} else if (counter == 2) {
				System.out.println("축하합니다. 번호가 2개 맞았습니다.  당신은 5등에 당첨되었습니다.");
			} else if (counter == 3) {
				System.out.println("축하합니다. 번호가 3개 맞았습니다.  당신은 4등에 당첨되었습니다.");
			} else if (counter == 4) {
				System.out.println("축하합니다. 번호가 4개 맞았습니다.  당신은 3등에 당첨되었습니다.");
			} else if (counter == 5) {
				System.out.println("축하합니다. 번호가 5개 맞았습니다.  당신은 2등에 당첨되었습니다.");
			} else if (counter == 6) {
				System.out.println("축하합니다. 번호가 6개 맞았습니다.  당신은 1등에 당첨되었습니다.");
			}
		}
	}

}

