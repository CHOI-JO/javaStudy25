package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x = 1;
		char y = 74;
		char z = 'O';
	
		System.out.println("int x = " + x);
		System.out.println("int y = " + y);
		System.out.println("char z = " + z);
		System.out.println("나의 영어 이름 : " + y + z + "\n");
		// "\n"은 줄 바꿈
		
		int a; // 초기화 안된 변수
		a = 1004; // 초기화 값 지정

		System.out.println(a);
	
		int korea, mathmatic, history, english, german, total;
		double  average; // 다양한 변수 선언
		korea = 75;
		mathmatic = 100;
		history = 60;
		english = 89;
		german = 85;
		total = korea + mathmatic + history + english + german;
		average = (double)total / 5; // 변수 형식을 변환하려면 (double)을 계산 값 앞에 써야함
		
		System.out.println("한국어 점수 : " + korea);
		System.out.println("수학 점수 : " + mathmatic);
		System.out.println("역사 점수 : " + history);
		System.out.println("영어 점수 : " + english);
		System.out.println("독일어 점수 : " + german);
		System.out.println("총점 : " + total);
		System.out.println("평균 점수: " + average + "\n");
		
		
		char firstName = 'C';
		char middleName = 'J';
		char lastName = 'O';
		
		System.out.println("이름 : " + firstName + middleName + lastName); // print는 앞에 적혀있는 변수 형식을 가져감
		
		int literal10 = 67;
		int literal08 = 0103;
		int literal02 = 0b1000011;
		int literal16 = 0xC;
		
		System.out.println("10진수 67 : " + literal10);
		System.out.println("8진수 103 : " + literal08);
		System.out.println("2진수 1000011 : " + literal02);
		System.out.println("16진수 C : " + literal16);
		
	}

}
