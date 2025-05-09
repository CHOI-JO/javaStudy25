package ch01;

public class LocalVariableExam {

	public static void main(String[] args) {

		int a = 60;
		int b = 0;
		int c; // 원래는 초기화 해주는 것이 좋다.
		
		if (a>50) {
			System.out.println("a가 50보다 큽니다." + "\n");
			b = a - 50 ;
		}
		else {
			System.out.println("a가 50보다 작습니다." + "\n");
			b = a + 50 ;
		}
		
		c = a + b + 5; // if문 안에 들어가 있지 않기에, c는 오류가 나지는 않는다. 그러나 위에서 초기화 해주는 것이 좋다.
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
	}

}
