package ch01;

public class LocalVariableExam {

	public static void main(String[] args) {

		int a = 60;
		int b = 0;
		int c; // ������ �ʱ�ȭ ���ִ� ���� ����.
		
		if (a>50) {
			System.out.println("a�� 50���� Ů�ϴ�." + "\n");
			b = a - 50 ;
		}
		else {
			System.out.println("a�� 50���� �۽��ϴ�." + "\n");
			b = a + 50 ;
		}
		
		c = a + b + 5; // if�� �ȿ� �� ���� �ʱ⿡, c�� ������ ������ �ʴ´�. �׷��� ������ �ʱ�ȭ ���ִ� ���� ����.
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
	}

}
