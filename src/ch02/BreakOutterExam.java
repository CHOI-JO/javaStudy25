package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		// break 문에 라벨을 붙이면 반복코드 종료 시점을 알 수 있다.
		
		Outter : for(char upper='A' ; upper <= 'Z' ; upper++) {
			for(char lower='a' ; lower<= 'z' ; lower++) {	
				
				System.out.println(upper + "-" + lower);
				if(lower == 'c') {
					break Outter;
				}
			} // 소문자 반복 for문 종료
		} // 대문자 반복 for문 종료
	}

}
