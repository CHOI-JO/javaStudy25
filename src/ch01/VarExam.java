package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x = 1;
		char y = 74;
		char z = 'O';
	
		System.out.println("int x = " + x);
		System.out.println("int y = " + y);
		System.out.println("char z = " + z);
		System.out.println("���� ���� �̸� : " + y + z + "\n");
		// "\n"�� �� �ٲ�
		
		int a; // �ʱ�ȭ �ȵ� ����
		a = 1004; // �ʱ�ȭ �� ����

		System.out.println(a);
	
		int korea, mathmatic, history, english, german, total;
		double  average; // �پ��� ���� ����
		korea = 75;
		mathmatic = 100;
		history = 60;
		english = 89;
		german = 85;
		total = korea + mathmatic + history + english + german;
		average = (double)total / 5; // ���� ������ ��ȯ�Ϸ��� (double)�� ��� �� �տ� �����
		
		System.out.println("�ѱ��� ���� : " + korea);
		System.out.println("���� ���� : " + mathmatic);
		System.out.println("���� ���� : " + history);
		System.out.println("���� ���� : " + english);
		System.out.println("���Ͼ� ���� : " + german);
		System.out.println("���� : " + total);
		System.out.println("��� ����: " + average + "\n");
		
		
		char firstName = 'C';
		char middleName = 'J';
		char lastName = 'O';
		
		System.out.println("�̸� : " + firstName + middleName + lastName); // print�� �տ� �����ִ� ���� ������ ������
		
		int literal10 = 67;
		int literal08 = 0103;
		int literal02 = 0b1000011;
		int literal16 = 0xC;
		
		System.out.println("10���� 67 : " + literal10);
		System.out.println("8���� 103 : " + literal08);
		System.out.println("2���� 1000011 : " + literal02);
		System.out.println("16���� C : " + literal16);
		
	}

}
