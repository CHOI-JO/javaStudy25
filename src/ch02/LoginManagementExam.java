package ch02;

import java.util.Scanner;

public class LoginManagementExam {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		boolean session = false; // 로그인 상태 저장용
		String id = "choi" ;
		String pw = "1234";
		int count = 0;
		
		System.out.println("=======엠비씨 성적처리용============");
		System.out.println("관리 메뉴로 이동하기 위해서는 먼저 로그인을 하세요.");
		while (run) {
			session = loginOk(id, pw, session, count);
			if (session == true) {
				run = false;
			}// if문 종료
		}// 로그인 while문 종료
		
		while(run2) {
			System.out.println("\n============관리 메뉴============");
			System.out.println("1. 교사관리");
			System.out.println("2. 학생관리");
			System.out.println("3. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.println("================================" + "\n");
			System.out.print(" >>>>>> ");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.println("교사관리 메뉴로 이동합니다.");
				Teacher();
				break;
				
			case 2 : 
				System.out.println("학생관리 메뉴로 이동합니다.");
				Student();
				break;
				
			case 3 : 
				System.out.println("성적관리 메뉴로 이동합니다.");
				Score();
				break;
				
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				run2 = false;		
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 선택해주세요. \n");
				break;
			} // switch문 종료
		
		} // while문 종료
		
	} //메인 메서드 종료

		static void Score() {
			Scanner inputInt = new Scanner(System.in);
			Scanner inputDouble = new Scanner(System.in);
			Scanner inputString = new Scanner(System.in);
			Scanner inputLine = new Scanner(System.in);
		
			System.out.println("\n" + "===================================");
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			int score = inputInt.nextInt();
			System.out.println("선택한 번호 : " + score);

			String student1 = "김철수";
			String student2 = "김영희";
			String student3 = "박재현";
			String student4 = "김수진";
			String student5 = "이은지";
			
			double math1 = 93;
			double korean1 = 96;
			double english1 = 90;
			double history1 = 97;
			double science1 = 87;
			double Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

			double math2 = 85;
			double korean2 = 100;
			double english2 = 95.5;
			double history2 = 80;
			double science2 = 89;
			double Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
			
			double math3 = 87;
			double korean3 = 100;
			double english3 = 95.5;
			double history3 = 80;
			double science3 = 86;
			double Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

			double math4 = 60;
			double korean4 = 79;
			double english4 = 91.5;
			double history4 = 80.5;
			double science4 = 77;
			double Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
			
			double math5 = 30;
			double korean5 = 68.5;
			double english5 = 59;
			double history5 = 72;
			double science5 = 85;
			double Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
			
			
			switch(score) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				String Score;
				boolean run2 = true;
				while (run2) {
					System.out.println("\n" + "성적을 등록할 학생의 이름을 입력하세요.");
					String studentName = inputString.next();
					System.out.println("\n" + "수학 점수를 입력하세요.");
					double studentMath = inputDouble.nextDouble();
					System.out.println("\n" + "국어 점수를 입력하세요.");
					double studentKorean = inputDouble.nextDouble();
					System.out.println("\n" + "영어 점수를 입력하세요.");
					double studentEnglish = inputDouble.nextDouble();
					System.out.println("\n" + "역사 점수를 입력하세요.");
					double studentHistory = inputDouble.nextDouble();
					System.out.println("\n" + "과학 점수를 입력하세요.");
					double studentScience = inputDouble.nextDouble();
					double Average = (studentMath + studentKorean + studentEnglish + studentHistory + studentScience)
							/ 5;
					System.out.println("\n" + "성적 등록이 완료되었습니다.");
					System.out.println("\n" + "===================================");
					System.out.println("이름: " + studentName);
					System.out.println("전체 평균: " + Average);
					if (Average >= 95) {
						System.out.println("전체 등급: A");
					} else if (Average >= 90 || Average < 95) {
						System.out.println("전체 등급: B");
					} else if (Average >= 80 || Average < 90) {
						System.out.println("전체 등급: C");
					} else if (Average >= 70 || Average < 80) {
						System.out.println("전체 등급: D");
					} else if (Average >= 0 || Average < 70) {
						System.out.println("전체 등급: F");
					} // 평균에 따른 등급 계산
					System.out.println("===================================");
					System.out.println("수학: " + studentMath);
					System.out.println("국어: " + studentKorean);
					System.out.println("영어: " + studentEnglish);
					System.out.println("역사: " + studentHistory);
					System.out.println("과학: " + studentScience);
					System.out.println("===================================");
					System.out.println("성적 등록이 완료되었습니다. \n");
					
					System.out.println("다른 성적을 추가로 등록하시겠습니까? (네/아니오)");
					Score = inputString.next();
					
					if(Score.equals("네")) {
						System.out.println(" \n 추가로 성적 등록을 진행합니다.");
					} else if(Score.equals("아니오")) {
						run2 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run2 = false;
					}
				} 
				

				break; //성적 등록 종료
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				int studentNumber;
				boolean run3 = true;
				
				while (run3) {
					System.out.println("\n 확인할 학생의 번호를 입력하세요.");
					System.out.println("1. " + student1);
					System.out.println("2. " + student2);
					System.out.println("3. " + student3);
					System.out.println("4. " + student4);
					System.out.println("5. " + student5);
					studentNumber = inputInt.nextInt();
					switch (studentNumber) { // 학생 정보를 보기 위한 번호 선택
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student1 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student1);
						System.out.println("전체 평균: " + Average1);
						System.out.println("전체 등급: A");
						System.out.println("전체 학년 석차: 7등");
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student2 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student2);
						System.out.println("전체 평균: " + Average2);
						System.out.println("전체 등급: B");
						System.out.println("전체 학년 석차: 20등");
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student3 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student3);
						System.out.println("전체 평균: " + Average3);
						System.out.println("전체 등급: B");
						System.out.println("전체 학년 석차: 21등");
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student4 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student4);
						System.out.println("전체 평균: " + Average4);
						System.out.println("전체 등급: C");
						System.out.println("전체 학년 석차: 103등");
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student5 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student5);
						System.out.println("전체 평균: " + Average5);
						System.out.println("전체 등급: D");
						System.out.println("전체 학년 석차: 217등");
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;
					}
					
					System.out.println("다른 학생을 확인하시겠습니까? (네/아니오)");
					Score = inputString.next();
					
					if(Score.equals("네")) {
					} else if(Score.equals("아니오")) {
						run3 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run3 = false;
					}
				}
				break;// 성적 보기 Switch문 종료
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				boolean run4 = true;
				
				while (run4) {
						System.out.println("\n수정할 학생의 번호를 입력하세요.");
						System.out.println("1. " + student1);
						System.out.println("2. " + student2);
						System.out.println("3. " + student3);
						System.out.println("4. " + student4);
						System.out.println("5. " + student5);
						int studentScore = inputInt.nextInt();
						switch (studentScore) { // 학생 정보를 보기 위한 번호 선택
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("선택한 학생은 " + student1 + " 입니다.");
							System.out.println("===================================" + "\n");

							System.out.println("점수를 수정할 과목 번호를 선택하세요");
							System.out.println("1. 수학");
							System.out.println("2. 국어");
							System.out.println("3. 영어");
							System.out.println("4. 역사");
							System.out.println("5. 과학");
							int studentSubjects = inputInt.nextInt();

							switch (studentSubjects) {
							case 1:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 수학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								math1 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student1 + " 학생의 점수는 다음과 같습니다.");
								Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student1);
								System.out.println("전체 평균: " + Average1);
								System.out.println("수학: " + math1);
								System.out.println("국어: " + korean1);
								System.out.println("영어: " + english1);
								System.out.println("역사: " + history1);
								System.out.println("과학: " + science1);
								System.out.println("===================================" + "\n");
								break;

							case 2:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 국어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								korean1 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student1 + " 학생의 점수는 다음과 같습니다.");
								Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student1);
								System.out.println("전체 평균: " + Average1);
								System.out.println("수학: " + math1);
								System.out.println("국어: " + korean1);
								System.out.println("영어: " + english1);
								System.out.println("역사: " + history1);
								System.out.println("과학: " + science1);
								System.out.println("===================================" + "\n");
								break;

							case 3:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 영어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								english1 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student1 + " 학생의 점수는 다음과 같습니다.");
								Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student1);
								System.out.println("전체 평균: " + Average1);
								System.out.println("수학: " + math1);
								System.out.println("국어: " + korean1);
								System.out.println("영어: " + english1);
								System.out.println("역사: " + history1);
								System.out.println("과학: " + science1);
								System.out.println("===================================" + "\n");
								break;

							case 4:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 역사 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								history1 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student1 + " 학생의 점수는 다음과 같습니다.");
								Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student1);
								System.out.println("전체 평균: " + Average1);
								System.out.println("수학: " + math1);
								System.out.println("국어: " + korean1);
								System.out.println("영어: " + english1);
								System.out.println("역사: " + history1);
								System.out.println("과학: " + science1);
								System.out.println("===================================" + "\n");
								break;

							case 5:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 과학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								science1 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student1 + " 학생의 점수는 다음과 같습니다.");
								Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student1);
								System.out.println("전체 평균: " + Average1);
								System.out.println("수학: " + math1);
								System.out.println("국어: " + korean1);
								System.out.println("영어: " + english1);
								System.out.println("역사: " + history1);
								System.out.println("과학: " + science1);
								System.out.println("===================================" + "\n");
								break;
							}
							break; // 첫번째 학생 점수 수정 종료문

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("선택한 학생은 " + student2 + " 입니다.");
							System.out.println("===================================" + "\n");

							System.out.println("점수를 수정할 과목 번호를 선택하세요");
							System.out.println("1. 수학");
							System.out.println("2. 국어");
							System.out.println("3. 영어");
							System.out.println("4. 역사");
							System.out.println("5. 과학");
							studentSubjects = inputInt.nextInt();

							switch (studentSubjects) {
							case 1:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 수학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								math2 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student2 + " 학생의 점수는 다음과 같습니다.");
								Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student2);
								System.out.println("전체 평균: " + Average2);
								System.out.println("수학: " + math2);
								System.out.println("국어: " + korean2);
								System.out.println("영어: " + english2);
								System.out.println("역사: " + history2);
								System.out.println("과학: " + science2);
								System.out.println("===================================" + "\n");
								break;

							case 2:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 국어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								korean2 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student2 + " 학생의 점수는 다음과 같습니다.");
								Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student2);
								System.out.println("전체 평균: " + Average2);
								System.out.println("수학: " + math2);
								System.out.println("국어: " + korean2);
								System.out.println("영어: " + english2);
								System.out.println("역사: " + history2);
								System.out.println("과학: " + science2);
								System.out.println("===================================" + "\n");
								break;

							case 3:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 영어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								english2 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student2 + " 학생의 점수는 다음과 같습니다.");
								Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student2);
								System.out.println("전체 평균: " + Average2);
								System.out.println("수학: " + math2);
								System.out.println("국어: " + korean2);
								System.out.println("영어: " + english2);
								System.out.println("역사: " + history2);
								System.out.println("과학: " + science2);
								System.out.println("===================================" + "\n");
								break;

							case 4:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 역사 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								history2 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student2 + " 학생의 점수는 다음과 같습니다.");
								Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student2);
								System.out.println("전체 평균: " + Average2);
								System.out.println("수학: " + math2);
								System.out.println("국어: " + korean2);
								System.out.println("영어: " + english2);
								System.out.println("역사: " + history2);
								System.out.println("과학: " + science2);
								System.out.println("===================================" + "\n");
								break;

							case 5:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 과학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								science2 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student2 + " 학생의 점수는 다음과 같습니다.");
								Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student2);
								System.out.println("전체 평균: " + Average2);
								System.out.println("수학: " + math2);
								System.out.println("국어: " + korean2);
								System.out.println("영어: " + english2);
								System.out.println("역사: " + history2);
								System.out.println("과학: " + science2);
								System.out.println("===================================" + "\n");
								break;
							}
							break; // 두 번째 학생 점수 수정 종료

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("선택한 학생은 " + student3 + " 입니다.");
							System.out.println("===================================" + "\n");

							System.out.println("점수를 수정할 과목 번호를 선택하세요");
							System.out.println("1. 수학");
							System.out.println("2. 국어");
							System.out.println("3. 영어");
							System.out.println("4. 역사");
							System.out.println("5. 과학");
							studentSubjects = inputInt.nextInt();

							switch (studentSubjects) {
							case 1:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 수학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								math3 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student3 + " 학생의 점수는 다음과 같습니다.");
								Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student3);
								System.out.println("전체 평균: " + Average3);
								System.out.println("수학: " + math3);
								System.out.println("국어: " + korean3);
								System.out.println("영어: " + english3);
								System.out.println("역사: " + history3);
								System.out.println("과학: " + science3);
								System.out.println("===================================" + "\n");
								break;

							case 2:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 국어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								korean3 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student3 + " 학생의 점수는 다음과 같습니다.");
								Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student3);
								System.out.println("전체 평균: " + Average3);
								System.out.println("수학: " + math3);
								System.out.println("국어: " + korean3);
								System.out.println("영어: " + english3);
								System.out.println("역사: " + history3);
								System.out.println("과학: " + science3);
								System.out.println("===================================" + "\n");
								break;

							case 3:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 영어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								english3 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student3 + " 학생의 점수는 다음과 같습니다.");
								Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student3);
								System.out.println("전체 평균: " + Average3);
								System.out.println("수학: " + math3);
								System.out.println("국어: " + korean3);
								System.out.println("영어: " + english3);
								System.out.println("역사: " + history3);
								System.out.println("과학: " + science3);
								System.out.println("===================================" + "\n");
								break;

							case 4:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 역사 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								history3 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student3 + " 학생의 점수는 다음과 같습니다.");
								Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student3);
								System.out.println("전체 평균: " + Average3);
								System.out.println("수학: " + math3);
								System.out.println("국어: " + korean3);
								System.out.println("영어: " + english3);
								System.out.println("역사: " + history3);
								System.out.println("과학: " + science3);
								System.out.println("===================================" + "\n");
								break;

							case 5:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 과학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								science3 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student3 + " 학생의 점수는 다음과 같습니다.");
								Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student3);
								System.out.println("전체 평균: " + Average3);
								System.out.println("수학: " + math3);
								System.out.println("국어: " + korean3);
								System.out.println("영어: " + english3);
								System.out.println("역사: " + history3);
								System.out.println("과학: " + science3);
								System.out.println("===================================" + "\n");
								break;
							}
							break; // 세 번째 학생 점수 수정 종료

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("선택한 학생은 " + student4 + " 입니다.");
							System.out.println("===================================" + "\n");

							System.out.println("점수를 수정할 과목 번호를 선택하세요");
							System.out.println("1. 수학");
							System.out.println("2. 국어");
							System.out.println("3. 영어");
							System.out.println("4. 역사");
							System.out.println("5. 과학");
							studentSubjects = inputInt.nextInt();

							switch (studentSubjects) {
							case 1:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 수학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								math4 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student4 + " 학생의 점수는 다음과 같습니다.");
								Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student4);
								System.out.println("전체 평균: " + Average4);
								System.out.println("수학: " + math4);
								System.out.println("국어: " + korean4);
								System.out.println("영어: " + english4);
								System.out.println("역사: " + history4);
								System.out.println("과학: " + science4);
								System.out.println("===================================" + "\n");
								break;

							case 2:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 국어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								korean4 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student4 + " 학생의 점수는 다음과 같습니다.");
								Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student4);
								System.out.println("전체 평균: " + Average4);
								System.out.println("수학: " + math4);
								System.out.println("국어: " + korean4);
								System.out.println("영어: " + english4);
								System.out.println("역사: " + history4);
								System.out.println("과학: " + science4);
								System.out.println("===================================" + "\n");
								break;

							case 3:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 영어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								english4 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student4 + " 학생의 점수는 다음과 같습니다.");
								Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student4);
								System.out.println("전체 평균: " + Average4);
								System.out.println("수학: " + math4);
								System.out.println("국어: " + korean4);
								System.out.println("영어: " + english4);
								System.out.println("역사: " + history4);
								System.out.println("과학: " + science4);
								System.out.println("===================================" + "\n");
								break;

							case 4:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 역사 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								history4 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student4 + " 학생의 점수는 다음과 같습니다.");
								Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student4);
								System.out.println("전체 평균: " + Average4);
								System.out.println("수학: " + math4);
								System.out.println("국어: " + korean4);
								System.out.println("영어: " + english4);
								System.out.println("역사: " + history4);
								System.out.println("과학: " + science4);
								System.out.println("===================================" + "\n");
								break;

							case 5:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 과학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								science4 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student4 + " 학생의 점수는 다음과 같습니다.");
								Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student4);
								System.out.println("전체 평균: " + Average4);
								System.out.println("수학: " + math4);
								System.out.println("국어: " + korean4);
								System.out.println("영어: " + english4);
								System.out.println("역사: " + history4);
								System.out.println("과학: " + science4);
								System.out.println("===================================" + "\n");
								break;
							}
							break; // 네 번째 학생 점수 수정 종료

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("선택한 학생은 " + student5 + " 입니다.");
							System.out.println("===================================" + "\n");

							System.out.println("점수를 수정할 과목 번호를 선택하세요");
							System.out.println("1. 수학");
							System.out.println("2. 국어");
							System.out.println("3. 영어");
							System.out.println("4. 역사");
							System.out.println("5. 과학");
							studentSubjects = inputInt.nextInt();

							switch (studentSubjects) {
							case 1:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 수학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								math5 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student5 + " 학생의 점수는 다음과 같습니다.");
								Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student5);
								System.out.println("전체 평균: " + Average5);
								System.out.println("수학: " + math5);
								System.out.println("국어: " + korean5);
								System.out.println("영어: " + english5);
								System.out.println("역사: " + history5);
								System.out.println("과학: " + science5);
								System.out.println("===================================" + "\n");
								break;

							case 2:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 국어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								korean5 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student5 + " 학생의 점수는 다음과 같습니다.");
								Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student5);
								System.out.println("전체 평균: " + Average5);
								System.out.println("수학: " + math5);
								System.out.println("국어: " + korean5);
								System.out.println("영어: " + english5);
								System.out.println("역사: " + history5);
								System.out.println("과학: " + science5);
								System.out.println("===================================" + "\n");
								break;

							case 3:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 영어 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								english5 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student5 + " 학생의 점수는 다음과 같습니다.");
								Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student5);
								System.out.println("전체 평균: " + Average5);
								System.out.println("수학: " + math5);
								System.out.println("국어: " + korean5);
								System.out.println("영어: " + english5);
								System.out.println("역사: " + history5);
								System.out.println("과학: " + science5);
								System.out.println("===================================" + "\n");
								break;

							case 4:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 역사 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								history5 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student5 + " 학생의 점수는 다음과 같습니다.");
								Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student5);
								System.out.println("전체 평균: " + Average5);
								System.out.println("수학: " + math5);
								System.out.println("국어: " + korean5);
								System.out.println("영어: " + english5);
								System.out.println("역사: " + history5);
								System.out.println("과학: " + science5);
								System.out.println("===================================" + "\n");
								break;

							case 5:
								System.out.println("\n" + "===================================");
								System.out.println("선택한 과목은 과학 입니다.");
								System.out.println("수정할 점수를 입력하세요");
								science5 = inputDouble.nextDouble();

								System.out.println("\n" + "===================================");
								System.out.println("점수가 수정되었습니다.");
								System.out.println(student5 + " 학생의 점수는 다음과 같습니다.");
								Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;

								System.out.println("\n" + "===================================");
								System.out.println("이름: " + student5);
								System.out.println("전체 평균: " + Average5);
								System.out.println("수학: " + math5);
								System.out.println("국어: " + korean5);
								System.out.println("영어: " + english5);
								System.out.println("역사: " + history5);
								System.out.println("과학: " + science5);
								System.out.println("===================================" + "\n");
								break;
							}
							break; // 다섯 번째 학생 점수 수정 종료
						}

						System.out.println("다른 점수를 추가로 수정하시겠습니까 ? (네/아니오)");
						Score = inputString.next();

						if (Score.equals("네")) {
						} else if (Score.equals("아니오")) {
							run4 = false;
						} else {
							System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
							run4 = false;
						}
				}
				break;// 성적 수정 Switch문 종료
				
			case 4 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 삭제 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				boolean run5 = true;
				
				while (run5) {
					System.out.println("\n성적을 삭제할 학생의 번호를 입력하세요.");
					System.out.println("1. " + student1);
					System.out.println("2. " + student2);
					System.out.println("3. " + student3);
					System.out.println("4. " + student4);
					System.out.println("5. " + student5);
					studentNumber = inputInt.nextInt();
					switch (studentNumber) {
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student1 + " 학생 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("점수를 삭제할 과목 번호를 선택하세요");
						System.out.println("1. 수학");
						System.out.println("2. 국어");
						System.out.println("3. 영어");
						System.out.println("4. 역사");
						System.out.println("5. 과학");
						int studentSubjects = inputInt.nextInt();

						switch (studentSubjects) {
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("수학 점수가 삭제되었습니다.");
							break;

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("국어 점수가 삭제되었습니다.");
							break;

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("영어 점수가 삭제되었습니다.");
							break;

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("역사 점수가 삭제되었습니다.");
							break;

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("과학 점수가 삭제되었습니다.");
							break;
						} // 첫 번째 학생의 해당 과목 점수 삭제 완료
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student2 + " 학생 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("점수를 삭제할 과목 번호를 선택하세요");
						System.out.println("1. 수학");
						System.out.println("2. 국어");
						System.out.println("3. 영어");
						System.out.println("4. 역사");
						System.out.println("5. 과학");
						studentSubjects = inputInt.nextInt();

						switch (studentSubjects) {
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("수학 점수가 삭제되었습니다.");
							break;

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("국어 점수가 삭제되었습니다.");
							break;

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("영어 점수가 삭제되었습니다.");
							break;

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("역사 점수가 삭제되었습니다.");
							break;

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("과학 점수가 삭제되었습니다.");
							break;
						} // 두 번째 학생의 해당 과목 점수 삭제 완료
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student3 + " 학생 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("점수를 삭제할 과목 번호를 선택하세요");
						System.out.println("1. 수학");
						System.out.println("2. 국어");
						System.out.println("3. 영어");
						System.out.println("4. 역사");
						System.out.println("5. 과학");
						studentSubjects = inputInt.nextInt();

						switch (studentSubjects) {
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("수학 점수가 삭제되었습니다.");
							break;

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("국어 점수가 삭제되었습니다.");
							break;

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("영어 점수가 삭제되었습니다.");
							break;

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("역사 점수가 삭제되었습니다.");
							break;

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("과학 점수가 삭제되었습니다.");
							break;
						} // 세 번째 학생의 해당 과목 점수 삭제 완료
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student4 + " 학생 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("점수를 삭제할 과목 번호를 선택하세요");
						System.out.println("1. 수학");
						System.out.println("2. 국어");
						System.out.println("3. 영어");
						System.out.println("4. 역사");
						System.out.println("5. 과학");
						studentSubjects = inputInt.nextInt();

						switch (studentSubjects) {
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("수학 점수가 삭제되었습니다.");
							break;

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("국어 점수가 삭제되었습니다.");
							break;

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("영어 점수가 삭제되었습니다.");
							break;

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("역사 점수가 삭제되었습니다.");
							break;

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("과학 점수가 삭제되었습니다.");
							break;
						} // 네 번째 학생의 해당 과목 점수 삭제 완료
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student5 + " 학생 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("점수를 삭제할 과목 번호를 선택하세요");
						System.out.println("1. 수학");
						System.out.println("2. 국어");
						System.out.println("3. 영어");
						System.out.println("4. 역사");
						System.out.println("5. 과학");
						studentSubjects = inputInt.nextInt();

						switch (studentSubjects) {
						case 1:
							System.out.println("\n" + "===================================");
							System.out.println("수학 점수가 삭제되었습니다.");
							break;

						case 2:
							System.out.println("\n" + "===================================");
							System.out.println("국어 점수가 삭제되었습니다.");
							break;

						case 3:
							System.out.println("\n" + "===================================");
							System.out.println("영어 점수가 삭제되었습니다.");
							break;

						case 4:
							System.out.println("\n" + "===================================");
							System.out.println("역사 점수가 삭제되었습니다.");
							break;

						case 5:
							System.out.println("\n" + "===================================");
							System.out.println("과학 점수가 삭제되었습니다.");
							break;
						} // 다섯 번째 학생의 해당 과목 점수 삭제 완료
						break;
					} // while문 종료
					System.out.println("\n 다른 점수를 추가로 삭제하시겠습니까 ? (네/아니오)");
					Score = inputString.next();

					if (Score.equals("네")) {
					} else if (Score.equals("아니오")) {
						run5 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run5 = false;
					}
				}
				break; // 성적 삭제 종료
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요. \n");
				break;
				
			} // 성적 관리 Switch문 종료
	}

		static void Student() {
			Scanner inputInt = new Scanner(System.in);
			Scanner inputString = new Scanner(System.in);
			Scanner inputLine = new Scanner(System.in);
			
			boolean run = true;
			boolean run1 = true;
			boolean run2 = true;
			boolean run3 = true;
			boolean run4 = true;

			String Student;
			String student1 = "김철수";
			String student2 = "김영희";
			String student3 = "박재현";
			String student4 = "김수진";
			String student5 = "이은지";
			
			System.out.println("\n" + "===================================");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 학생 수정");
			System.out.println("4. 학생 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			int student = inputInt.nextInt();
			System.out.println("선택한 번호 : " + student);
			
			switch(student) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				while (run) {
					System.out.println("\n" + "등록할 학생의 이름을 입력하세요.");
					String studentName = inputString.next();
					System.out.println("\n" + "학생의 학년을 입력하세요.");
					String studentPosition = inputString.next();
					System.out.println("\n" + "성별을 입력하세요.");
					String studentGender = inputString.next();
					System.out.println("\n" + "나이를 입력하세요.");
					int studentAge = inputInt.nextInt();
					System.out.println("\n" + "휴대번호를 입력하세요.");
					String studentPhoneNumber = inputString.next();
					System.out.println("\n" + "이메일 주소를 입력하세요.");
					String studentMail = inputString.next();
					System.out.println("\n" + "집 주소를 입력하세요.");
					String studentAddress = inputLine.nextLine();
					System.out.println("\n" + "새로운 학생 등록이 완료되었습니다.");
					System.out.println("===================================");
					System.out.println("이름: " + studentName);
					System.out.println("학년: " + studentPosition);
					System.out.println("성별: " + studentGender);
					System.out.println("나이: " + studentAge);
					System.out.println("휴대번호: " + studentPhoneNumber);
					System.out.println("이메일 주소: " + studentMail);
					System.out.println("집 주소 : " + studentAddress);
					System.out.println("===================================");
					System.out.println("학생 등록이 종료되었습니다. \n");
				
					System.out.println("\n 다른 학생을 추가로 등록하시겠습니까 ? (네/아니오)");
					Student = inputString.next();

					if (Student.equals("네")) {
					} else if (Student.equals("아니오")) {
						run = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run = false;
					}
				}
				
				break; //학생등록 종료
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				while (run2) {
					System.out.println("\n확인할 학생의 번호를 입력하세요.");
					System.out.println("1. " + student1);
					System.out.println("2. " + student2);
					System.out.println("3. " + student3);
					System.out.println("4. " + student4);
					System.out.println("5. " + student5);
					int studentNumber = inputInt.nextInt();
					switch (studentNumber) { // 학생 정보를 보기 위한 번호 선택
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student1 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student1);
						System.out.println("나이: 18");
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student2 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student2);
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student3 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student3);
						System.out.println("나이: 17");
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student4 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student4);
						System.out.println("나이: 16");
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student5 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + student5);
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;
					}
					System.out.println("\n 다른 학생을 확인하시겠습니까 ? (네/아니오)");
					Student = inputString.next();

					if (Student.equals("네")) {
					} else if (Student.equals("아니오")) {
						run2 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run2 = false;
					}
				}
				break;// 학생 보기 Switch문 종료
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				while (run3) {
					System.out.println("\n수정할 학생의 번호를 선택해주세요");
					System.out.println("1. " + student1);
					System.out.println("2. " + student2);
					System.out.println("3. " + student3);
					System.out.println("4. " + student4);
					System.out.println("5. " + student5);
					int studentChangeInfomation = inputInt.nextInt();
					switch (studentChangeInfomation) { //학생 수정을 위한 번호 선택
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student1 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 학년");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int studentChangeNumber1 = inputInt.nextInt();

						switch (studentChangeNumber1) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String studentChangeName = inputString.next();
							student1 = studentChangeName;
							System.out.println("학생의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + studentChangeName);
							System.out.println("나이: 18");
							System.out.println("학년: 고3");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int studentChangeAge = inputInt.nextInt();

							System.out.println("학생의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student1);
							System.out.println("나이: " + studentChangeAge);
							System.out.println("학년: 고3");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 학년을 입력해주세요.");
							String studentChangePosition = inputString.next();

							System.out.println("학생의 학년이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student1);
							System.out.println("나이: 18");
							System.out.println("학년: " + studentChangePosition);
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String studentChangePhoneNumber = inputString.next();

							System.out.println("학생의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student1);
							System.out.println("나이: 18");
							System.out.println("학년: 고3");
							System.out.println("휴대전화번호: " + studentChangePhoneNumber);
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String studentChangeEmail = inputString.next();

							System.out.println("학생의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student1);
							System.out.println("나이: 18");
							System.out.println("학년: 고3");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: " + studentChangeEmail);
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String studentChangeAddress = inputLine.nextLine();

							System.out.println("학생의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student1);
							System.out.println("나이: 18");
							System.out.println("학년: 고3");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: " + studentChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //학생의 항목을 수정하는 switch 종료

						break; // 1번 학생 수정 종료

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student2 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 학년");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int studentChangeNumber2 = inputInt.nextInt();

						switch (studentChangeNumber2) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String studentChangeName = inputString.next();

							System.out.println("학생의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + studentChangeName);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int studentChangeAge = inputInt.nextInt();

							System.out.println("학생의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student2);
							System.out.println("나이: " + studentChangeAge);
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 학년을 입력해주세요.");
							String studentChangePosition = inputString.next();

							System.out.println("학생의 학년이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student2);
							System.out.println("나이: 15");
							System.out.println("학년: " + studentChangePosition);
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String studentChangePhoneNumber = inputString.next();

							System.out.println("학생의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student2);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: " + studentChangePhoneNumber);
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String studentChangeEmail = inputString.next();

							System.out.println("학생의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student2);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: " + studentChangeEmail);
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String studentChangeAddress = inputLine.nextLine();

							System.out.println("학생의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student2);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: " + studentChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //학생의 항목을 수정하는 switch 종료

						break; // 2번 학생 수정 switch 종료

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student3 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 학년");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int studentChangeNumber3 = inputInt.nextInt();

						switch (studentChangeNumber3) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String studentChangeName = inputString.next();

							System.out.println("학생의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + studentChangeName);
							System.out.println("나이: 17");
							System.out.println("학년: 고2");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int studentChangeAge = inputInt.nextInt();

							System.out.println("학생의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student3);
							System.out.println("나이: " + studentChangeAge);
							System.out.println("학년: 고2");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 학년을 입력해주세요.");
							String studentChangePosition = inputString.next();

							System.out.println("학생의 학년이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student3);
							System.out.println("나이: 17");
							System.out.println("학년: " + studentChangePosition);
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String studentChangePhoneNumber = inputString.next();

							System.out.println("학생의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student3);
							System.out.println("나이: 17");
							System.out.println("학년: 고2");
							System.out.println("휴대전화번호: " + studentChangePhoneNumber);
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String studentChangeEmail = inputString.next();

							System.out.println("학생의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student3);
							System.out.println("나이: 17");
							System.out.println("학년: 고2");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: " + studentChangeEmail);
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String studentChangeAddress = inputLine.nextLine();

							System.out.println("학생의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student3);
							System.out.println("나이: 17");
							System.out.println("학년: 고2");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: " + studentChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //학생의 항목을 수정하는 switch 종료	

						break;// 3번 학생 수정 switch 종료

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student4 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 학년");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int studentChangeNumber4 = inputInt.nextInt();

						switch (studentChangeNumber4) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String studentChangeName = inputString.next();

							System.out.println("학생의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + studentChangeName);
							System.out.println("나이: 16");
							System.out.println("학년: 고1");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int studentChangeAge = inputInt.nextInt();

							System.out.println("학생의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student4);
							System.out.println("나이: " + studentChangeAge);
							System.out.println("학년: 고1");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 학년을 입력해주세요.");
							String studentChangePosition = inputString.next();

							System.out.println("학생의 학년이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student4);
							System.out.println("나이: 16");
							System.out.println("학년: " + studentChangePosition);
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String studentChangePhoneNumber = inputString.next();

							System.out.println("학생의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student4);
							System.out.println("나이: 16");
							System.out.println("학년: 고1");
							System.out.println("휴대전화번호: " + studentChangePhoneNumber);
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String studentChangeEmail = inputString.next();

							System.out.println("학생의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student4);
							System.out.println("나이: 16");
							System.out.println("학년: 고1");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: " + studentChangeEmail);
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String studentChangeAddress = inputLine.nextLine();

							System.out.println("학생의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student4);
							System.out.println("나이: 16");
							System.out.println("학년: 고1");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: " + studentChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //학생의 항목을 수정하는 switch 종료

						break; // 4번 학생 수정 완료

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 학생은 " + student5 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 학년");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int studentChangeNumber5 = inputInt.nextInt();

						switch (studentChangeNumber5) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String studentChangeName = inputString.next();

							System.out.println("학생의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + studentChangeName);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int studentChangeAge = inputInt.nextInt();

							System.out.println("학생의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student5);
							System.out.println("나이: " + studentChangeAge);
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 학년을 입력해주세요.");
							String studentChangePosition = inputString.next();

							System.out.println("학생의 학년이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student5);
							System.out.println("나이: 15");
							System.out.println("학년: " + studentChangePosition);
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String studentChangePhoneNumber = inputString.next();

							System.out.println("학생의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student5);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: " + studentChangePhoneNumber);
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String studentChangeEmail = inputString.next();

							System.out.println("학생의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student5);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: " + studentChangeEmail);
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String studentChangeAddress = inputLine.nextLine();

							System.out.println("학생의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + student5);
							System.out.println("나이: 15");
							System.out.println("학년: 중3");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: " + studentChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //학생 항목을 수정하는 switch 종료

						break; // 5번 학생 수정 완료
					}// 학생 수정 Switch문 종료
					
					System.out.println("\n 추가로 수정하시겠습니까 ? (네/아니오)");
					Student = inputString.next();

					if (Student.equals("네")) {
					} else if (Student.equals("아니오")) {
						run3 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run3 = false;
					}
				}
				break;
			case 4 :
				System.out.println("학생 삭제 메뉴로 진입하셨습니다.");
				
				while (run4) {
					System.out.println("1. " + student1);
					System.out.println("2. " + student2);
					System.out.println("3. " + student3);
					System.out.println("4. " + student4);
					System.out.println("5. " + student5);
					int studentDelete = inputInt.nextInt();
					switch (studentDelete) {
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println(student1 + " 학생의 데이터가 삭제되었습니다.\n");
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println(student2 + " 학생의 데이터가 삭제되었습니다.\n");
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println(student3 + " 학생의 데이터가 삭제되었습니다.\n");
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println(student4 + " 학생의 데이터가 삭제되었습니다.\n");
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println(student5 + " 학생의 데이터가 삭제되었습니다.\n");
						break;
					}
					System.out.println("\n 추가로 데이터를 삭제하시겠습니까 ? (네/아니오)");
					Student = inputString.next();

					if (Student.equals("네")) {
					} else if (Student.equals("아니오")) {
						run4 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run4 = false;
					}
				}// while문 종료
				break;
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요. \n");
				break;
			} // 학생 Switch문 종료		
	}

		static void Teacher() {
		// 교사 관리
			Scanner inputInt = new Scanner(System.in);
			Scanner inputString = new Scanner(System.in);
			Scanner inputLine = new Scanner(System.in);

			boolean run = true;
			boolean run1 = true;
			boolean run2 = true;
			boolean run3 = true;
			
			String Teacher;
			String Teacher1 = "김동만";
			String Teacher2 = "박동현";
			String Teacher3 = "최지수";
			String Teacher4 = "정대진";
			String Teacher5 = "이미희";
			
			System.out.println("\n" + "===================================");
			System.out.println("1. 교사 등록");
			System.out.println("2. 교사 보기");
			System.out.println("3. 교사 수정");
			System.out.println("4. 교사 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			
			int num1 = inputInt.nextInt();
			System.out.println("\n" + "===================================");
			System.out.println("선택한 번호 : " + num1);
			
			switch(num1) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("교사 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				while (run) {
					System.out.println("\n" + "등록할 교사의 이름을 입력하세요.");
					String newTeacher = inputString.next();
					System.out.println("\n" + "교사의 직급을 입력하세요.");
					String position = inputString.next();
					System.out.println("\n" + "성별을 입력하세요.");
					String gender = inputString.next();
					System.out.println("\n" + "나이를 입력하세요.");
					int age = inputInt.nextInt();
					System.out.println("\n" + "휴대번호를 입력하세요.");
					String phoneNumber = inputString.next();
					System.out.println("\n" + "이메일 주소를 입력하세요.");
					String eMail = inputString.next();
					System.out.println("\n" + "집 주소를 입력하세요.");
					String address = inputLine.nextLine();
					System.out.println("\n" + "새로운 교사 등록이 완료되었습니다.");
					System.out.println("===================================");
					System.out.println("이름: " + newTeacher);
					System.out.println("직급: " + position);
					System.out.println("성별: " + gender);
					System.out.println("나이: " + age);
					System.out.println("휴대번호: " + phoneNumber);
					System.out.println("이메일 주소: " + eMail);
					System.out.println("집 주소 : " + address);
					System.out.println("===================================");
					System.out.println("교사 등록이 종료되었습니다." + "\n");

					System.out.println("\n 새로운 교사를 추가하시겠습니까 ? (네/아니오)");
					Teacher = inputString.next();

					if (Teacher.equals("네")) {
					} else if (Teacher.equals("아니오")) {
						run = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run = false;
					}
				}
				break;
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("교사 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				while (run1) {
					System.out.println("\n확인할 교사 번호를 입력하세요.");
					System.out.println("1. " + Teacher1);
					System.out.println("2. " + Teacher2);
					System.out.println("3. " + Teacher3);
					System.out.println("4. " + Teacher4);
					System.out.println("5. " + Teacher5);
					int TeacherNumber = inputInt.nextInt();
					switch (TeacherNumber) { // 교직원 정보를 보기 위한 번호 선택
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher1 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + Teacher1);
						System.out.println("나이: 35");
						System.out.println("직급: 담임");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher2 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + Teacher2);
						System.out.println("나이: 39");
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher3 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + Teacher3);
						System.out.println("나이: 28");
						System.out.println("직급: 교생");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher4 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + Teacher4);
						System.out.println("나이: 22");
						System.out.println("직급: 교생");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher5 + " 입니다.");
						System.out.println("===================================");
						System.out.println("이름: " + Teacher5);
						System.out.println("나이: 56");
						System.out.println("직급: 교감");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;
					}// 교직원 보기 Switch문 종료
					System.out.println("\n 다른 교사를 확인하시겠습니까 ? (네/아니오)");
					Teacher = inputString.next();

					if (Teacher.equals("네")) {
					} else if (Teacher.equals("아니오")) {
						run1 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run1 = false;
					}
				}
				break;
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("교사 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				while (run2) {
					System.out.println("\n수정할 교사의 번호를 선택해주세요");
					System.out.println("1. " + Teacher1);
					System.out.println("2. " + Teacher2);
					System.out.println("3. " + Teacher3);
					System.out.println("4. " + Teacher4);
					System.out.println("5. " + Teacher5);
					int teacherChangeInfomation = inputInt.nextInt();
					switch (teacherChangeInfomation) { //교직원 수정을 위한 번호 선택
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher1 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 직급");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int teacherChangeNumber1 = inputInt.nextInt();

						switch (teacherChangeNumber1) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String teacherChangeName = inputString.next();

							System.out.println("교사의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + teacherChangeName);
							System.out.println("나이: 35");
							System.out.println("직급: 담임");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int teacherChangeAge = inputInt.nextInt();

							System.out.println("교사의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름:  " + Teacher1);
							System.out.println("나이: " + teacherChangeAge);
							System.out.println("직급: 담임");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 직급을 입력해주세요.");
							String teacherChangePosition = inputString.next();

							System.out.println("교사의 직급이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름:  " + Teacher1);
							System.out.println("나이: 35");
							System.out.println("직급: " + teacherChangePosition);
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String teacherChangePhoneNumber = inputString.next();

							System.out.println("교사의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher1);
							System.out.println("나이: 35");
							System.out.println("직급: 담임");
							System.out.println("휴대전화번호: " + teacherChangePhoneNumber);
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String teacherChangeEmail = inputString.next();

							System.out.println("교사의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher1);
							System.out.println("나이: 35");
							System.out.println("직급: 담임");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: " + teacherChangeEmail);
							System.out.println("주소: 경기도 안산시 부곡동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String teacherChangeAddress = inputLine.nextLine();

							System.out.println("교사의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher1);
							System.out.println("나이: 35");
							System.out.println("직급: 담임");
							System.out.println("휴대전화번호: 010-1234-5678");
							System.out.println("이메일: abc@gmail.com");
							System.out.println("주소: " + teacherChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //교사의 항목을 수정하는 switch 종료

						break; // 1번 교사 수정 종료

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher2 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 직급");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int teacherChangeNumber2 = inputInt.nextInt();

						switch (teacherChangeNumber2) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String teacherChangeName = inputString.next();

							System.out.println("교사의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + teacherChangeName);
							System.out.println("나이: 39");
							System.out.println("직급: 부장");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int teacherChangeAge = inputInt.nextInt();

							System.out.println("교사의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher2);
							System.out.println("나이: " + teacherChangeAge);
							System.out.println("직급: 부장");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 직급을 입력해주세요.");
							String teacherChangePosition = inputString.next();

							System.out.println("교사의 직급이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher2);
							System.out.println("나이: 39");
							System.out.println("직급: " + teacherChangePosition);
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String teacherChangePhoneNumber = inputString.next();

							System.out.println("교사의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher2);
							System.out.println("나이: 39");
							System.out.println("직급: 부장");
							System.out.println("휴대전화번호: " + teacherChangePhoneNumber);
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String teacherChangeEmail = inputString.next();

							System.out.println("교사의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher2);
							System.out.println("나이: 39");
							System.out.println("직급: 부장");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: " + teacherChangeEmail);
							System.out.println("주소: 경기도 수원시 팔달구");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String teacherChangeAddress = inputLine.nextLine();

							System.out.println("교사의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher2);
							System.out.println("나이: 39");
							System.out.println("직급: 부장");
							System.out.println("휴대전화번호: 010-1234-9999");
							System.out.println("이메일: bbb@gmail.com");
							System.out.println("주소: " + teacherChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //교직원의 항목을 수정하는 switch 종료

						break; // 2번 교직원 수정 switch 종료

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher3 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 직급");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int teacherChangeNumber3 = inputInt.nextInt();

						switch (teacherChangeNumber3) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String teacherChangeName = inputString.next();

							System.out.println("교사의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + teacherChangeName);
							System.out.println("나이: 28");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int teacherChangeAge = inputInt.nextInt();

							System.out.println("교사의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher3);
							System.out.println("나이: " + teacherChangeAge);
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 직급을 입력해주세요.");
							String teacherChangePosition = inputString.next();

							System.out.println("교사의 직급이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher3);
							System.out.println("나이: 28");
							System.out.println("직급: " + teacherChangePosition);
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String teacherChangePhoneNumber = inputString.next();

							System.out.println("교사의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher3);
							System.out.println("나이: 28");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: " + teacherChangePhoneNumber);
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String teacherChangeEmail = inputString.next();

							System.out.println("교사의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher3);
							System.out.println("나이: 28");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: " + teacherChangeEmail);
							System.out.println("주소: 경기도 수원시 장안문");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String teacherChangeAddress = inputLine.nextLine();

							System.out.println("교사의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher3);
							System.out.println("나이: 28");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-0000");
							System.out.println("이메일: ccc@gmail.com");
							System.out.println("주소: " + teacherChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //교직원의 항목을 수정하는 switch 종료	

						break;// 3번 교직원 수정 switch 종료

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher4 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 직급");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int teacherChangeNumber4 = inputInt.nextInt();

						switch (teacherChangeNumber4) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String teacherChangeName = inputString.next();

							System.out.println("교직원의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + teacherChangeName);
							System.out.println("나이: 22");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int teacherChangeAge = inputInt.nextInt();

							System.out.println("교사의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher4);
							System.out.println("나이: " + teacherChangeAge);
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 직급을 입력해주세요.");
							String teacherChangePosition = inputString.next();

							System.out.println("교사의 직급이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher4);
							System.out.println("나이: 22");
							System.out.println("직급: " + teacherChangePosition);
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String teacherChangePhoneNumber = inputString.next();

							System.out.println("교사의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher4);
							System.out.println("나이: 22");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: " + teacherChangePhoneNumber);
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String teacherChangeEmail = inputString.next();

							System.out.println("교사의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher4);
							System.out.println("나이: 22");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: " + teacherChangeEmail);
							System.out.println("주소: 경기도 안산시 이동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String teacherChangeAddress = inputLine.nextLine();

							System.out.println("교사의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher4);
							System.out.println("나이: 22");
							System.out.println("직급: 교생");
							System.out.println("휴대전화번호: 010-1234-8888");
							System.out.println("이메일: ddd@gmail.com");
							System.out.println("주소: " + teacherChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //교직원의 항목을 수정하는 switch 종료

						break; // 4번 교직원 수정 완료

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println("선택한 교사는 " + Teacher5 + " 입니다.");
						System.out.println("===================================" + "\n");

						System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
						System.out.println("1. 이름");
						System.out.println("2. 나이");
						System.out.println("3. 직급");
						System.out.println("4. 휴대전화번호");
						System.out.println("5. 이메일");
						System.out.println("6. 주소");
						int teacherChangeNumber5 = inputInt.nextInt();

						switch (teacherChangeNumber5) { // 수정할 항목 번호 선택
						case 1:
							System.out.println("수정할 이름을 입력해주세요.");
							String teacherChangeName = inputString.next();

							System.out.println("교사의 이름이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + teacherChangeName);
							System.out.println("나이: 56");
							System.out.println("직급: 교감");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 2:
							System.out.println("수정할 나이을 입력해주세요.");
							int teacherChangeAge = inputInt.nextInt();

							System.out.println("교사의 나이가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher5);
							System.out.println("나이: " + teacherChangeAge);
							System.out.println("직급: 교감");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 3:
							System.out.println("수정할 직급을 입력해주세요.");
							String teacherChangePosition = inputString.next();

							System.out.println("교사의 직급이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher5);
							System.out.println("나이: 56");
							System.out.println("직급: " + teacherChangePosition);
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 4:
							System.out.println("수정할 휴대전화번호을 입력해주세요.");
							String teacherChangePhoneNumber = inputString.next();

							System.out.println("교사의 휴대전화번호이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher5);
							System.out.println("나이: 56");
							System.out.println("직급: 교감");
							System.out.println("휴대전화번호: " + teacherChangePhoneNumber);
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 5:
							System.out.println("수정할 이메일을 입력해주세요.");
							String teacherChangeEmail = inputString.next();

							System.out.println("교사의 이메일이 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher5);
							System.out.println("나이: 56");
							System.out.println("직급: 교감");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: " + teacherChangeEmail);
							System.out.println("주소: 경기도 안산시 중앙동");
							System.out.println("===================================" + "\n");
							break;

						case 6:
							System.out.println("수정할 주소를 입력해주세요.");
							String teacherChangeAddress = inputLine.nextLine();

							System.out.println("교사의 주소가 수정되었습니다." + "\n");
							System.out.println("===================================");
							System.out.println("이름: " + Teacher5);
							System.out.println("나이: 56");
							System.out.println("직급: 교감");
							System.out.println("휴대전화번호: 010-1234-1111");
							System.out.println("이메일: 1111@gmail.com");
							System.out.println("주소: " + teacherChangeAddress);
							System.out.println("===================================" + "\n");
							break;
						} //교직원의 항목을 수정하는 switch 종료

						break; // 5번 교직원 수정 완료
					}// 교직원 수정 Switch문 종료
				
					System.out.println("\n 추가로 데이터를 수정하시겠습니까 ? (네/아니오)");
					Teacher = inputString.next();

					if (Teacher.equals("네")) {
					} else if (Teacher.equals("아니오")) {
						run2 = false;
					}else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run2 = false;
					}
				} // while문 종료
				break;
			case 4 :
				System.out.println("\n" + "===================================");
				System.out.println("교사 삭제 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				while (run3) {
					System.out.println("\n삭제할 교사 번호를 입력하세요.");
					System.out.println("1. " + Teacher1);
					System.out.println("2. " + Teacher2);
					System.out.println("3. " + Teacher3);
					System.out.println("4. " + Teacher4);
					System.out.println("5. " + Teacher5);
					int teacherDelete = inputInt.nextInt();
					switch (teacherDelete) {
					case 1:
						System.out.println("\n" + "===================================");
						System.out.println(Teacher1 + "님의 데이터가 삭제되었습니다.");
						break;

					case 2:
						System.out.println("\n" + "===================================");
						System.out.println(Teacher2 + "님의 데이터가 삭제되었습니다.");
						break;

					case 3:
						System.out.println("\n" + "===================================");
						System.out.println(Teacher3 + "님의 데이터가 삭제되었습니다.");
						break;

					case 4:
						System.out.println("\n" + "===================================");
						System.out.println(Teacher4 + "님의 데이터가 삭제되었습니다.");
						break;

					case 5:
						System.out.println("\n" + "===================================");
						System.out.println(Teacher5 + "님의 데이터가 삭제되었습니다." + "\n");
						break;
					} // 선택한 교사 데이터 삭제
				
					System.out.println("\n 추가로 데이터를 삭제하시겠습니까 ? (네/아니오)");
					Teacher = inputString.next();

					if (Teacher.equals("네")) {
					} else if (Teacher.equals("아니오")) {
						run3 = false;
					} else {
						System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
						run3 = false;
					}
				} //while문 종료
				break; // 교사 삭제 switch 종료
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요." + "\n");
				break;
			} // 교사 Switch문 종료
			
	}

		static boolean loginOk(String id, String pw, boolean session, int count) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 아이디를 입력하세요");
		System.out.print(" >>>> ");
		String inputId = inputLogin.next();
		
		System.out.println("\n" + "비밀번호를 입력하세요");
		System.out.print(" >>>> ");
		String inputPw = inputLogin.next();
		
		if(inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("로그인 성공!!!!");
			System.out.println("\n" + id + " 환영합니다.");
			System.out.println("이제 관리 메뉴를 사용하실 수 있습니다." + "\n");
			session = true;
		} else  {
			System.out.println("\n아이디나 pw가 일치하지 않습니다.");
			System.out.println("다시 로그인하세요. \n");
			session = false;
			count++;
		} // id pw 일치 판단문 종료
		
		return session; // 르그인 성공과 실패결과를 리턴함
		
	}

}
