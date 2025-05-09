package ch01;

public class compareValueExam {

	public static void main(String[] args) {
		double v1 = 0.1 ;
		double v2 = 0.11 ;
		double v3 = 0.1111 ;
		double v4 = 0.2 ;
		double v5 = 0.2225 ;
		float v6 = 0.1f;
		float v7 = 0.11f;
		float v8 = 0.1111f;
		float v9 = 0.2f;
		float v10 = 0.2225f;

		System.out.println(v1 == v6); 
		System.out.println(v1 == v2); 
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v6);
		System.out.println("-----------------------------------------------------" + "\n");

		System.out.println((float)v1 == v6);
		System.out.println((float)v2 == v7);
		System.out.println((float)v3 == v8);
		System.out.println((float)v4 == v9);
		System.out.println((float)v5 == v10);
		System.out.println((float)v1 == v2);
		System.out.println((float)v2 == v3);
		System.out.println((float)v1 == v7);
		System.out.println((float)v1 == v8);
		System.out.println((float)v3 == v7);
		System.out.println("-----------------------------------------------------" + "\n");

		System.out.println(v1 == (double)v6);
		System.out.println(v2 == (double)v7);
		System.out.println(v3 == (double)v8);
		System.out.println(v4 == (double)v9);
		System.out.println(v5 == (double)v10);
		System.out.println(v1 == (double)v2);
		System.out.println(v2 == (double)v3);
		System.out.println(v1 == (double)v7);
		System.out.println(v1 == (double)v8);
		System.out.println(v3 == (double)v7);
		System.out.println("-----------------------------------------------------" + "\n");

		System.out.println((float)v1 == (double)v6);
		System.out.println((float)v2 == (double)v7);
		System.out.println((float)v3 == (double)v8);
		System.out.println((float)v4 == (double)v9);
		System.out.println((float)v5 == (double)v10);
	
		System.out.println("-----------------------------------------------------" + "\n");

		

		System.out.println((int)v4 == (int)v5);
		System.out.println((int)v4 == (int)v10);

		System.out.println((int)(v4*100) == (int)(v10*100));
		System.out.println((int)(v4*10) == (int)(v5*10));

		System.out.println((int)(v4*100));
		System.out.println((int)(v10*100));
		System.out.println("-----------------------------------------------------" + "\n");

        System.out.println("v1: " + System.identityHashCode(v1));
        System.out.println("v2: " + System.identityHashCode(v2));
        System.out.println("v3: " + System.identityHashCode(v3));
        System.out.println("v4: " + System.identityHashCode(v4));
        System.out.println("v5: " + System.identityHashCode(v5));
        System.out.println("v6: " + System.identityHashCode(v6));
        System.out.println("v7: " + System.identityHashCode(v7));
        System.out.println("v8: " + System.identityHashCode(v8));
        System.out.println("v9: " + System.identityHashCode(v9));
        System.out.println("v10: " + System.identityHashCode(v10));
	}

}
