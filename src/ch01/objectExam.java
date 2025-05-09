package ch01;

public class objectExam {

	public static void main(String[] args) {
		String strVal1 = "c";
		String strVal2 = "choi";
		String strVal3 = "choi";
		String strVal4 = "choi";
		String strVal5 = "choi";

		String strVal6 = new String("c"); 
		String strVal7 = new String("choi"); 
		String strVal8 = new String("choi"); 
		String strVal9 = new String("choi"); 
		String strVal10 = new String("choi"); 

		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println(strVal2 == strVal5);
		System.out.println(strVal5 == strVal4);
		System.out.println("-----------------------------------------------------");

		System.out.println(strVal1 == strVal6);
		System.out.println(strVal2 == strVal7);
		System.out.println(strVal3 == strVal8);
		System.out.println(strVal4 == strVal9);
		System.out.println(strVal5 == strVal10);
		System.out.println(strVal6 == strVal10);
		System.out.println(strVal7 == strVal10);
		System.out.println("-----------------------------------------------------");


		boolean eq1 = strVal1.equals(strVal10); 
		System.out.println("1과 10번의 equals메서드 사용 결과 : " + eq1);
		System.out.println("-----------------------------------------------------");

		 // 문자열 참조값(주소) 출력
        System.out.println("strVal1: " + System.identityHashCode(strVal1));
        System.out.println("strVal2: " + System.identityHashCode(strVal2));
        System.out.println("strVal3: " + System.identityHashCode(strVal3));
        System.out.println("strVal4: " + System.identityHashCode(strVal4));
        System.out.println("strVal5: " + System.identityHashCode(strVal5));
        System.out.println("strVal6: " + System.identityHashCode(strVal6));
        System.out.println("strVal7: " + System.identityHashCode(strVal7));
        System.out.println("strVal8: " + System.identityHashCode(strVal8));
        System.out.println("strVal9: " + System.identityHashCode(strVal9));
        System.out.println("strVal10: " + System.identityHashCode(strVal10));
	}

}
