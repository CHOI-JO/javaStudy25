package ch01;

// import java.util.Scanner;

public class VariableExam {

	public static void main(String[] args) {
		// Scanner input = new Scanner (System.in);
		
		int distance;
		int time;
		double velocity;
		
		//System.out.println("�Ÿ�(m)�� �Է����ּ��� : ");
		//distance = input.nextInt();
		
		//System.out.println("�ð�(��)�� �Է����ּ��� : ");
		//time = input.nextInt();
		
		
		
		distance = 100;
		time = 3;
		velocity = distance / (double)time;
		System.out.print("����� �ӵ��� " + velocity);
		System.out.println(" m/s �Դϴ�."); // �Ҽ��� �ڸ����� ������ ���߿�

	}

}
