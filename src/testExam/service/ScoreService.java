package testExam.service;

import java.util.Scanner;

import testExam.dto.StudentDTO;

public class ScoreService {
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputDou = new Scanner(System.in);
	
	public void ScoreCheck(StudentDTO[] students) {
		boolean SubRun = true;
		
		while (SubRun) {
			System.out.println("\n------------------------");
			System.out.println("1. 전체 성적 보기");
			System.out.println("2. 개인 성적 보기");
			System.out.println("3. 프로그램 종료");
			System.out.println("------------------------");
			System.out.print(">>>>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("\n전체 학생의 성적을 확인합니다.");
				for(int i = 0; i < students.length; i++) {
					StudentDTO allList = students[i];
					if(allList != null) {
							allList.show();
					}// 빈 배열 확인하는 if문 종료
				} // 전체 학생 성적을 출력하는 for문 종료
				break;
			case "2" :
				System.out.println("성적을 확인할 학생 이름을 입력하세요.");
				String name = inputStr.next();
				for(int i = 0; i < students.length; i++) {
					StudentDTO studentScore = students[i];
					if(studentScore.getName().equals(name)) {
						studentScore.show();
						break;
					} else {
						System.out.println("입력한 정보의 학생이 없습니다. 다시 확인해주세요.");
						break;
					}// 학생 확인하는 if문 종료
				} // 개인 성적 확인하는 for문 종료
				break;
			case "3" :
				System.out.println("프로그램을 종료합니다.");
				SubRun = false;
				break;
			default :
				System.out.println("1~2번 까지만 입력하세요.");
				break;
			} // 스위치문 종료
		} // 와일문 종료
	} // 부메뉴 메서드 종료

	public void ScoreChange(StudentDTO[] students) {
		// 성적을 수정하는 메서드
		System.out.println("수정할 학생의 이름를 입력하세요.");
		String name = inputStr.next();
		boolean run = true;

		while (run) {
			for(int i=0; i<students.length; i++) {
				StudentDTO studentChange = students[i];
				if(studentChange.getName().equals(name)) {
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생은 " + studentChange.getName() + " 입니다.");
					System.out.println("===================================");
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					System.out.println("6. 종료");
					int studentSubjects = inputInt.nextInt();
					
					switch (studentSubjects) {
					case 1 :
						System.out.println("수정할 수학 점수를 입력하세요");
						studentChange.setMath(inputDou.nextDouble());
						System.out.println("점수가 수정되었습니다.");
						break;
					case 2 :
						System.out.println("수정할 국어 점수를 입력하세요");
						studentChange.setKorean(inputDou.nextDouble());
						System.out.println("점수가 수정되었습니다.");
						break;
					case 3 :
						System.out.println("수정할 영어 점수를 입력하세요");
						studentChange.setEnglish(inputDou.nextDouble());
						System.out.println("점수가 수정되었습니다.");
						break;
					case 4 :
						System.out.println("수정할 역사 점수를 입력하세요");
						studentChange.setHistory(inputDou.nextDouble());
						System.out.println("점수가 수정되었습니다.");
						break;
					case 5 :
						System.out.println("수정할 과학 점수를 입력하세요");
						studentChange.setScience(inputDou.nextDouble());
						System.out.println("점수가 수정되었습니다.");
						break;
					case 6 :	
						System.out.println("프로그램을 종료합니다.");
						run=false;
						break;
					default :
						System.out.println("1~5번 까지만 입력하세요.");
						break;
					}// 수정할 과목을 선택하는 switch문 종료
				}// 학생의 정보를 확인하는 if문 종료
			}//배열에서 학생 정보 찾는 for문 종료
		}//성적 수정이 종료될때까지 진행하는 while문 종료
	}

	public void ScoreDelete(StudentDTO[] students) {
		// 성적을 삭제하는 메서드
		System.out.println("성적을 삭제할 학생의 이름를 입력하세요.");
		String name = inputStr.next();
		
		for(int i=0; i<students.length; i++) {
			StudentDTO studentDelete = students[i];
			if(studentDelete.getName().equals(name)) {
				System.out.println("\n" + "===================================");
				System.out.println("선택한 학생은 " + studentDelete.getName() + " 입니다.");
				studentDelete = null;
				break;
				} // 첫 번째 학생의 해당 과목 점수 삭제 완료
			break;
		}
	}
}
