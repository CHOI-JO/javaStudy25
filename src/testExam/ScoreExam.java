package testExam;

import java.util.Scanner;

import testExam.dto.StudentDTO;
import testExam.service.ScoreService;

public class ScoreExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputDou = new Scanner(System.in);

	public static StudentDTO[] students = null;
	
	//생성자
		static {
			students = new StudentDTO[100]; // 100명의 학생이 들어갈 방(배열)
		}
		
	public static void main(String[] args) {
		// 성적 처리 메서드
		boolean run = true;
		while(run) {
			System.out.println("\n" + "===================================");
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("\n" + "===================================");
			System.out.print(">>>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("성적을 등록합니다.");
				
				StudentDTO newStudent = new StudentDTO();
				
				System.out.print("학생 이름을 입력하세요.");
				newStudent.setName(inputStr.next());
				System.out.print("학생 번호를 입력하세요.");
				newStudent.setStudentID(inputStr.next());
				System.out.print("등록할 수학 점수를 입력하세요.");
				newStudent.setMath(inputDou.nextDouble());
				System.out.print("등록할 국어 점수를 입력하세요.");
				newStudent.setKorean(inputDou.nextDouble());
				System.out.print("등록할 영어 점수를 입력하세요.");
				newStudent.setEnglish(inputDou.nextDouble());
				System.out.print("등록할 역사 점수를 입력하세요.");
				newStudent.setHistory(inputDou.nextDouble());
				System.out.print("등록할 과학 점수를 입력하세요.");
				newStudent.setScience(inputDou.nextDouble());
				System.out.println("========================");
				System.out.println("성적 등록이 완료되었습니다. \n");
						// 객체 입력 완료
				for(int i = 0; i < students.length; i++) {
					if(students[i] == null) {
						students[i] = newStudent; //베열에 입력한 객체가 연결
					break;
					}
				}
				break;
				
			case "2" :
				System.out.println("성적을 확인합니다.");
				ScoreService ScoreService = new ScoreService();
				ScoreService.ScoreCheck(students);
				break;
				
			case "3" :
				System.out.println("성적을 수정합니다.");
				ScoreService ScoreService1 = new ScoreService();
				ScoreService1.ScoreChange(students);
				break;
				
			case "4" :
				System.out.println("성적을 삭제합니다.");
				ScoreService ScoreService2 = new ScoreService();
				ScoreService2.ScoreDelete(students);
				break;
				
			default :
				System.out.println("1~3번까지만 입력하세요.");
			}
		}
	} // 메인 메서드 종료'
	
}// 클래스 종료
