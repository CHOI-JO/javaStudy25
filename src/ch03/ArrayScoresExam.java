package ch03;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 배열에 저장 후 CRUD 테스트
		// C 성적을 입력
		// R 성적 보기 (전체보기, 1개보기)
		// U 성적 수정하기
		// D 성적을 삭제하기
		// 개선사항 -> 성적 입력시 NULL값을 보고 넣어보기
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.println("==========성적 확인 프로그램=========");
		System.out.println("학생 수를 입력해주세요.");
		System.out.print(">>>>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적을 입력하겠습니다.");
		
		int [] korea = new int[count];
		int [] math = new int[count];
		int [] english = new int[count];
		int [] history = new int[count];
		int [] science = new int[count];
		// 국어, 수학, 영어, 역사, 과학의 배열을 학생 수 만큼 만듬
		
		String [] studentsName = new String[count]; // 이름 배열
		//String [] studentsNummer = new String[count];
		
		boolean run = true;
		
		while (run) {
			System.out.println("\n======성적 처리 ========");
			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 성적 보기");
			System.out.println("3. 개인 성적 보기");
			System.out.println("4. 성적 수정하기");
			System.out.println("5. 성적 삭제하기");
			System.out.println("9. 성적 프로그램 종료");
			System.out.print(">>>>> ");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 : {
				System.out.println("\n성적 입력 화면입니다.");
				// 메서드 생성할 때는 입력 값과 출력 값을 먼저 생각해야 한다.
				scoreAdd(studentsName, korea, math, english, history, science);
				break;
			} // 성적 입력 case 1문 종료
			
			case 2 : {
				System.out.println("\n전체 성적 보기 화면입니다.");
				scoreAllView(studentsName, korea, math, english, history, science);
				break;
			} // 전체 성적 보기 case 2문 종료
			
			case 3 : {
				System.out.println("\n개인 성적 보기 화면입니다.");
				scorePersonView(studentsName, korea, math, english, history, science);
				break;
			} // 개인 성적 보기 case 3문 종료
			
			case 4 : {
				System.out.println("\n성적 수정 화면입니다.");
				scoreMod(studentsName, korea, math, english, history, science);
				break;
			} // 성적 수정하기 case 4문 종료
			
			case 5 : {
				System.out.println("\n성적 삭제 화면입니다.");
				scoreDel(studentsName, korea, math, english, history, science);
				break;
			} // 성적 삭제하기 case 5문 종료
			
			case 9 : {
				System.out.println("\n성적 처리 프로그램을 종료합니다.");
				run = false;
				break;	
			} // 프로그램 종료 case 9문 종료
			
			default :
				System.out.println("\n1~9까지만 입력하세요.");
				break;
				
			} // 성적처리 메뉴 switch문 종료
		} // 성적처리 while문 종료
		
	}// 메인 메서드 종료

	private static void scoreDel(String[] studentsName, int[] korea, int[] math, int[] english, int[] history,
			int[] science) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("\n삭제할 학생의 이름을 입력하세요.");
		System.out.print(">>>> ");
		String name = inputStr.nextLine();
		
	    boolean found = false;

		for(int i = 0 ; i < studentsName.length ; i++) {
			if(studentsName[i].equals(name)) {
				// 키보드로 입력한 값이 이름 배열에 같은 값이 있는지 파악
				System.out.println("\n" + studentsName[i] + "학생 점수");
				System.out.println("국어 : " + korea[i]);
				System.out.println("수학 : " + math[i]);
				System.out.println("영어 : " + english[i]);
				System.out.println("역사 : " + history[i]);
				System.out.println("과학 : " + science[i]);
				System.out.println("==================================\n");
				System.out.println("삭제할 점수를 입력하세요");
				System.out.println("1. 국어");
				System.out.println("2. 수학");
				System.out.println("3. 영어");
				System.out.println("4. 역사");
				System.out.println("5. 과학");
				System.out.print(">>>> ");
				int select = inputInt.nextInt();
				
				switch(select) {
				case 1 : {
					korea[i] = 0;
					System.out.println("\n국어 점수가 삭제되었습니다.");
					break;
				}
				
				case 2 : {
					math[i] = 0;
					System.out.println("\n수학 점수가 삭제되었습니다.");
					break;
					}
				
				case 3 : {
					english[i] = 0;
					System.out.println("\n영어 점수가 삭제되었습니다.");
					break;
					}

				case 4 : {
					history[i] = 0;
					System.out.println("\n역사 점수가 삭제되었습니다.");
					break;
					}

				case 5 : {
					science[i] = 0;
					System.out.println("\n과학 점수가 삭제되었습니다.");
					break;
					}
				
				default :
					System.out.println("과목 번호를 잘못 입력하셨습니다. 다시 입력하세요.");
					break;
				} // 과목별 성적 수정 종료(switch)
				
				System.out.println("\n삭제 후, 현재 점수는 다음과 같습니다.");
				System.out.println("==================================");
				System.out.println("국어 : " + korea[i]);
				System.out.println("수학 : " + math[i]);
				System.out.println("영어 : " + english[i]);
				System.out.println("역사 : " + history[i]);
				System.out.println("과학 : " + science[i]);
	            found = true;
				break;
			} 
			
		}// 반복 성적 수정 종료(for문)
		
	    if (!found) {
			System.out.println("찾는 학생이 없습니다. 처음으로 돌아갑니다.");
	        return; // 다시 처음으로
		}
		
	}

	static void scorePersonView(String[] studentsName, int[] korea, int[] math, int[] english, int[] history,
			int[] science) {
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.println("\n성적을 확인할 학생의 이름을 입력하세요.");
			System.out.print(">>>> ");
			String name = inputStr.nextLine();
			
		    boolean found = false;
			
			for (int i = 0; i < studentsName.length; i++) {
				if (studentsName[i].equals(name)) {
					System.out.println("\n" + studentsName[i] + " 학생의 점수");
					System.out.println("국어 점수 : " + korea[i]);
					System.out.println("수학 점수 : " + math[i]);
					System.out.println("영어 점수 : " + english[i]);
					System.out.println("역사 점수 : " + history[i]);
					System.out.println("과학 점수 : " + science[i]);
		            found = true;
					break;
				} 
			} //반복 성적 입력 종료(for문)
			
		    if (!found) {
				System.out.println("찾는 학생이 없습니다. 처음으로 돌아갑니다.");
		        break; // 다시 처음으로
			}
			
			System.out.println("\n다른 학생의 성적을 조회하시겠습니까?  네/아니오");
			String replay = inputStr.nextLine();
			if(replay.equals("네")) {
			} 
			else if (replay.equals("아니오")) {
				System.out.println("첫 화면으로 돌아갑니다.");
				run = false;
			} else {
				System.out.println("잘못입력되었습니다. 성적 처리 메뉴로 돌아갑니다.");
				break;
			}
		} // 성적 확인 while문 종료

		
	} // 개인 성적 보기 메서드 종료

	static void scoreAllView(String[] studentsName, int[] korea, int[] math, int[] english, int[] history,
			int[] science) {

		int sumPerson = 0;
		int sumAll = 0;
		double avgPerson = 0;
		double avgAll = 0;
		
		System.out.println("\n전체 학생의 성적을 확인합니다.");

		for(int i = 0 ; i < studentsName.length ; i++) {
			sumPerson = korea[i] + math[i] + english[i] + history[i] + science[i];
			avgPerson = (double)sumPerson / 5 ;
			sumAll += avgPerson;

			System.out.println("\n" + studentsName[i] + " 학생의 점수입니다.");
			System.out.println("평균 점수: " + avgPerson);
			System.out.println("국어 점수 : " + korea[i]);
			System.out.println("수학 점수 : " + math[i]);
			System.out.println("영어 점수 : " + english[i]);
			System.out.println("역사 점수 : " + history[i]);
			System.out.println("과학 점수 : " + science[i]); 
		} // 반복 성적 입력 종료(for문)
		
		avgAll = (double)sumAll / studentsName.length;
		
		System.out.println("\n=> 전체 평균: " + avgAll);
		System.out.println("\n전체 성적 보기를 종료합니다.");
	} // 전체 성적 보기 메서드 종료

	static void scoreMod(String[] studentsName, int[] korea, int[] math, int[] english, int[] history,
			int[] science) {
		// main에서 만든 배열 4개를 가져와 성적 수정을 한다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("\n수정할 학생의 이름을 입력하세요.");
		System.out.print(">>>> ");
		String name = inputStr.nextLine();
		
	    boolean found = false;

		for(int i = 0 ; i < studentsName.length ; i++) {
			if(studentsName[i].equals(name)) {
				// 키보드로 입력한 값이 이름 배열에 같은 값이 있는지 파악
				System.out.println("\n" + studentsName[i] + "학생 점수");
				System.out.println("국어 : " + korea[i]);
				System.out.println("수학 : " + math[i]);
				System.out.println("영어 : " + english[i]);
				System.out.println("역사 : " + history[i]);
				System.out.println("과학 : " + science[i]);
				System.out.println("==================================\n");
				System.out.println("수정할 점수를 입력하세요");
				System.out.println("1. 국어");
				System.out.println("2. 수학");
				System.out.println("3. 영어");
				System.out.println("4. 역사");
				System.out.println("5. 과학");
				System.out.print(">>>> ");
				int select = inputInt.nextInt();
				
				switch(select) {
				case 1 : {
					System.out.println("국어 수정 점수 : ");
					korea[i] = inputInt.nextInt();
					break;
				}
				
				case 2 : {
					System.out.println("수학 수정 점수 : ");
					math[i] = inputInt.nextInt();
					break;
					}
				
				case 3 : {
					System.out.println("영어 수정 점수 : ");
					english[i] = inputInt.nextInt();
					break;
					}

				case 4 : {
					System.out.println("역사 수정 점수 : ");
					history[i] = inputInt.nextInt();
					break;
					}

				case 5 : {
					System.out.println("과학 수정 점수 : ");
					science[i] = inputInt.nextInt();
					break;
					}
				
				default :
					System.out.println("과목 번호를 잘못 입력하셨습니다. 다시 입력하세요.");
					break;
				} // 과목별 성적 수정 종료(switch)
				
				System.out.println("\n수정이 완료되었습니다.");
				System.out.println("수정 점수는 다음과 같습니다.");
				System.out.println("\n==================================");
				System.out.println("국어 : " + korea[i]);
				System.out.println("수학 : " + math[i]);
				System.out.println("영어 : " + english[i]);
				System.out.println("역사 : " + history[i]);
				System.out.println("과학 : " + science[i]);
	            found = true;
				break;
			} 
			
		}// 반복 성적 수정 종료(for문)
		
	    if (!found) {
			System.out.println("찾는 학생이 없습니다. 처음으로 돌아갑니다.");
	        return; // 다시 처음으로
		}
	} // 성적 수정 메서드 종료

	static void scoreAdd(String[] studentsName, int[] korea, int[] math, int[] english, int[] history,
			int[] science) {
		// main에서 만든 배열을 키보드로 값을 넣는다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		for(int i = 0 ; i < studentsName.length ; i++) {
			System.out.println("\n이름을 입력하세요.");
			System.out.print(">>>> ");
			studentsName[i] = inputStr.nextLine();
			
			System.out.print("국어 점수 : ");
			korea[i] = inputInt.nextInt();
			
			System.out.print("수학 점수 : ");
			math[i] = inputInt.nextInt();

			System.out.print("영어 점수 : ");
			english[i] = inputInt.nextInt();

			System.out.print("역사 점수 : ");
			history[i] = inputInt.nextInt();

			System.out.print("과학 점수 : ");
			science[i] = inputInt.nextInt();
			
		} // 반복 성적 입력 종료(for문)
		System.out.println("\n성적 입력이 완료 되었습니다.");
	} //성적 입력 메서드 종료

} // 클래스 종료
