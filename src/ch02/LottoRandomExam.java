package ch02;

public class LottoRandomExam {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println("오늘의 로또 번호는 : " + num);
			i++;
			if(i >= 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}// while 문 종료
	} // 메인 메서드 종료

} // 클래스 종료
