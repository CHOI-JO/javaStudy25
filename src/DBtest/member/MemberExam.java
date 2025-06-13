package member;

import java.sql.SQLException;
import java.util.Scanner;

import member.dao.MemberDAO;
import member.dto.MemberDTO;
import member.service.MemberService;

public class MemberExam {
	// �ʵ�
	public static Scanner inputStr = new Scanner(System.in);
	public static MemberDTO session = null; //���� ���� ����  //�α��� ���� �ʴ»���
	
	// ������->static ��
			
	// �޼���
	public static void main(String[] args) throws SQLException {
		// ȸ���� �����ϴ� Exam, �α��� �� ���� ����
		// dto: ��ü�� ����Ѵ�
		// dao: �����ͺ��̽����� ������ ����Ѵ�
		// service: �θ޴��� ���񽺸� ����Ѵ�

		MemberService memberService = new MemberService();
		MemberDAO memberDAO = new MemberDAO();
		boolean run = true;		
		
		while (run) {
			System.out.println("==========�׽�Ʈ�� Ȩ�������Դϴ�..==========");
			System.out.println("1.�α��� | 2.ȸ������ | 3.����");
			System.out.print(">>>");
			String select = inputStr.next();
			
			 switch (select) {
                case "1":
                    session = memberDAO.login(inputStr);
                    if (session != null) {
                        System.out.println("[" + session.getId() + "]��, �α��εǾ����ϴ�.");
                        MemberService.subMenu(inputStr, session);
                    }
                    break;
              
                case "2":
                	MemberDTO memberDTO = new MemberDTO();
                	memberService.insertmember(memberDTO, inputStr);
                    break;
                    
                case "3": 
                	System.out.println("���α׷��� �����մϴ�.");
                    run = false;
                    break;
                    
                default:
                    System.out.println("1~3������ �Է� �ٶ��ϴ�.");
            } // switch�� ����
        } // while�� ����
    } // main ����

}
