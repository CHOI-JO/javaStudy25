package member.service;

import java.sql.SQLException;
import java.util.Scanner;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberService {
    public static MemberDAO memberDAO = new MemberDAO();

    // �α��� �� ����޴�
	public static void subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		boolean subRun = true ;
		
		while(subRun) {
			System.out.println("ȸ�� ���� �Դϴ�.");
			System.out.println("1. �Խ��� �޴�");
			System.out.println("2. ��� ȸ�� ����");
			System.out.println("3. ȸ�� �ڼ��� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� Ż��");
			System.out.println("6. ������");
			System.out.print(">>>");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1":
				System.out.println("�Խ���");
				BoardService boardService = new BoardService();
				boardService.subMenu(session, inputStr);
				break;
			case "2":
				System.out.println("��� ȸ�� ����");
				selectAll();
				break;
			case "3":
				System.out.println("ȸ�� ���� �ڼ��� ����");
				readOne(inputStr); 
				break;
			case "4":
				System.out.println("ȸ�� ���� ���� �޼���� �����մϴ�.");
				modifyOne(inputStr);
				break;
			case "5":
				System.out.println("ȸ�� Ż�� �޼���� �����մϴ�.");
				deleteOne(inputStr);
				subRun = false ;
				break;
			case "6":
				System.out.println("�α׾ƿ��մϴ�.");
				memberDAO.connection.close(); // ����� connection ����
				subRun = false ;
				break;
			} // switch�� ����(�θ޴�)
		}// while �� ���� (�θ޴� �ݺ�)
	} // subMenu ����
	
	private static void deleteOne(Scanner inputStr) throws SQLException {
		// �Խù��� ��ȣ�� �޾� �����Ѵ�.
		System.out.println("Ż���� ȸ�� id�� �Է��ϼ���");
		System.out.print(">>>");
		String selectId = inputStr.next();
		memberDAO.deleteOne(selectId);
	}

	private static void modifyOne(Scanner inputStr) throws SQLException {
		// ������ ã�Ƽ� ������ �����Ѵ�.
		System.out.println("================================================== \nȸ������ ���̵� �ٽ� �Է����ּ���.");
		System.out.print(">>>");
		String selectId = inputStr.next();
		memberDAO.modifyOne(selectId, inputStr);
		System.out.println("ȸ�� ������ ���������� �����Ǿ����ϴ�.");
	}

	private static void readOne(Scanner inputStr) throws SQLException {
		// ������ �Է��ϸ� ������ ���̵��� select ó��
		System.out.println("================================================== \nȸ������ ���̵� �ٽ� �Է����ּ���.");
		System.out.print(">>>");
		String selectId = inputStr.next();
		
		memberDAO.readOne(selectId);
		System.out.println("=====================================================");
	}

	private static void selectAll() throws SQLException {
        System.out.println("==================================== ��ü ȸ�� ��� �Դϴ�.====================================");
        memberDAO.selectAll();
	}

	public void insertmember(MemberDTO memberDTO, Scanner inputStr) throws SQLException {
		Scanner inputInt = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		
		System.out.println("ȸ�������� �����մϴ�.");
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());
				
		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());
				
		System.out.print("ȸ�� �̸� : ");
		memberDTO.setMname(inputStr.next());
				
		System.out.print("�������(yyMMdd) : ");	
		memberDTO.setBirthday(inputInt.nextInt());
		
		System.out.print("�ڵ��� ��ȣ : ");
		memberDTO.setPhonenumber(inputStr.next());
		
		System.out.print("�̸��� �ּ� : ");
		memberDTO.setEmail(inputStr.next());
		
		System.out.print("���ּ� : ");
		memberDTO.setAddress(inputStr.next());
		
		memberDAO.insertMember(memberDTO);
		System.out.println("==========ȸ�� ������ �Ϸ�Ǿ����ϴ�.==========");
	}

	

}
