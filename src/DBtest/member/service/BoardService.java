package member.service;

import java.sql.SQLException;
import java.util.Scanner;

import member.dao.BoardDAO;
import member.dto.BoardDTO;
import member.dto.MemberDTO;

public class BoardService {
	public BoardDAO boardDAO = new BoardDAO();
	
	// ������
	
	// �޼��� (�θ޴�, ����, ��κ���, 1������, �����ϱ�, �����ϱ�) 
	public void subMenu(MemberDTO session, Scanner inputStr) throws SQLException {
		boolean subRun = true ;
		while(subRun) {
			System.out.println("\n==========================================");
			System.out.println("ȸ���� �Խ����Դϴ�.");
			System.out.println("1. �Խ��� ��κ���");
			System.out.println("2. �Խñ� �ۼ�");
			System.out.println("3. �Խñ� �ڼ��� ����");
			System.out.println("4. �Խñ� ����");
			System.out.println("5. �Խñ� ����");
			System.out.println("6. ������");
			System.out.print(">>>");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1":
				selectAll();
				break;
			case "2":
				insertBoard(session, inputStr);
				break;
			case "3":
				readOne(session, inputStr); 
				break;
			case "4":
				modify(session, inputStr);
				break;
			case "5":
				deleteOne();
				break;
			case "6":
				System.out.println("�Խ��� ����");
				boardDAO.connection.close(); // �Խ��� ����� connection ����
				subRun = false ;
				break;		
			} // switch�� ����(�θ޴�)
		}// while �� ���� (�θ޴� �ݺ�)
	} // �θ޴� �޼��� ����

	private void deleteOne() throws SQLException {
		// �Խù��� ��ȣ�� �޾� �����Ѵ�.
		System.out.println("�����Ϸ��� �Խñ��� ��ȣ�� �Է��ϼ���");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
		
		
	}

	private void modify(MemberDTO session, Scanner inputStr) throws SQLException {
		// ������ ã�Ƽ� ������ �����Ѵ�.
		System.out.println("�����Ϸ��� �Խñ� ������ �Է��ϼ���");
		System.out.print(">>>");
		String title = inputStr.next();
		boardDAO.modify(title, inputStr);
		System.out.println("=========================");
	}

	private void readOne(MemberDTO session, Scanner inputStr) throws SQLException {
		// ������ �Է��ϸ� ������ ���̵��� select ó��
		System.out.println("Ȯ���� �Խñ� ������ �Է��ϼ���");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("============================");
		
		
	} // readOne�޼��� ����

	private void insertBoard(MemberDTO session, Scanner inputStr) throws SQLException {
		// Ű����� �Է��� �����͸� dto�� ����Ͽ� �����ͺ��̽��� insert����.
		BoardDTO boardDTO = new BoardDTO(); //��ü ����
        boardDTO.setBwriter(session.getId());
        
        System.out.print("�ۼ��� : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("���� : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("���� : ");
		boardDTO.setBcontent(inputLine.nextLine()); // ���Ⱑ �ִ� ����!!!! nextLine()
		
		boardDAO.insertBoard(boardDTO); // ������ ���� ��ü�� DAO���� ����
		System.out.println("============================");
		
	} // insertBoard()�޼��� ����

	private void selectAll() throws SQLException {
		// dao���� ��ü���� �ϴ� ���񽺸� �����Ѵ�.
		System.out.println("=================================");
		System.out.println("====��ü �Խ��Ǹ���Դϴ�====");
		boardDAO.selectAll();
		System.out.println("==================================");
		
	}
}
