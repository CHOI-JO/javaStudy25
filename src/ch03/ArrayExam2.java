package ch03;

public class ArrayExam2 {

	public static void main(String[] args) {
		double[] arr2 = new double[3];
		for(int i = 0; i <3 ; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		arr2 = new double [] {10.0, 20.0, 30.0};
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		String [] arr3 = new String[3];
		for(int i = 0; i <3 ; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		} 

		arr3 = new String [] {"최장옥", "자바", "클라우드"};
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
	}

}
