package ch01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("ȸ������" + "\n");
		System.out.print("������ ID�� �Է��ϼ��� : ");
		String id = input.nextLine();
		System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
		String pw = input.nextLine();
		System.out.print("\n" + "������ �������ּ���. ���� = 1, ���� = 2 : " );
		String gender= input.nextLine();
		if(gender.equals("1")) {
		System.out.println("����� ������ ���� �Դϴ�." + "\n");
		} else {
			System.out.println("����� ������ ���� �Դϴ�." + "\n");
		}
		System.out.print("��������� �Է��ϼ��� : " );
		String date= input.nextLine();
		System.out.println("����� ��������� " + date + "�Դϴ�." + "\n");

		System.out.println("-----------------------------------------------------");
		System.out.println("�α����� �����մϴ�." + "\n");
	
	    // �α��� �õ��� ���� ������ �ݺ�
		do {
			System.out.print("ID : ");
			String inputId = input.nextLine();
			
			System.out.print("PW : ");
			String inputPw = input.nextLine();

	    // ID�� PW�� ��ġ�ϸ� �α��� ����
		if(inputId.equals(id) & inputPw.equals(pw)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break; // �α��� �����ϸ� �ݺ��� ����
		} else {
			System.out.println("ID�� PW�� ��ġ���� �ʽ��ϴ�." + "\n");
			System.out.println("ID�� PW�� �ٽ� �Է����ּ���");
		}
		
		} while (true); // ���� ���� ��� �ݺ� (�α��� ������ ������)

	}

}
