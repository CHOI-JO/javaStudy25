package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import member.dto.MemberDTO;

public class MemberDAO {

	// �ʵ�
	public MemberDTO memberDTO = new MemberDTO();	
	public Connection connection = null; 
	public Statement statement = null; 
	public PreparedStatement preparestatement = null; 
	public ResultSet resultset = null; 
	public int result = 0; 
		
	//��Ŭ����DB���� 
	public MemberDAO() {
		try { // ���ܰ� �߻��� �� �ִ� ���๮ ���α׷� �������� ó����
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1�ܰ� ojdbc6.jar ȣ��
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.179:1521:xe", "membertest","membertest"); 
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �̸��̳�, ojdbc6.jar ������ �߸� �Ǿ����ϴ�.");
			e.printStackTrace();
			System.exit(0); // ���� ����
		} catch (SQLException e) {
			System.out.println("url, id, pw�� �߸� �Ǿ����ϴ�. MemberDAO�� �⺻�����ڸ� Ȯ���ϼ���");
			e.printStackTrace();
			System.exit(0); // ���� ����
		}

	} // �⺻ �޼��� ����
		
	public MemberDTO login(Scanner inputStr) throws SQLException {
	    System.out.print("���̵� �Է��ϼ���: ");
	    String id = inputStr.next();
	    System.out.print("��й�ȣ�� �Է��ϼ���: ");
	    String pw = inputStr.next();
	    
	    MemberDTO session = null;

	    try {
	        String sql = "SELECT * FROM member WHERE id = ? AND pw = ?";
	        preparestatement = connection.prepareStatement(sql);
	        preparestatement.setString(1, id);
	        preparestatement.setString(2, pw);
	        resultset = preparestatement.executeQuery();

	        if (resultset.next()) {
	            session = new MemberDTO(); // �α��ε� ȸ�� ��ü ����
	            session.setId(resultset.getString("id"));
	            session.setPw(resultset.getString("pw"));

	            System.out.println("[" + session.getId() + "]�� ȯ���մϴ�");
	        } else {
	            System.out.println("�α����� ���� �Ͽ����ϴ�. ���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
	        }

	    } catch (SQLException e) {
	        System.out.println("���ܹ߻� : login() �޼��� Ȯ��");
	        e.printStackTrace();
	    } finally {
	        preparestatement.close();
	    }
	    return session;
	}// login() �޼��� ����
	
	public void insertMember(MemberDTO memberDTO) throws SQLException {
		try {
			String sql = "INSERT INTO member(mno, id, pw, mname, birthday, phonenumber, email, address, regidate) "
			           + "VALUES (board_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)";
			preparestatement = connection.prepareStatement(sql);

			preparestatement.setString(1, memberDTO.getId());
			preparestatement.setString(2, memberDTO.getPw());
			preparestatement.setString(3, memberDTO.getMname());
			preparestatement.setInt(4, memberDTO.getBirthday());  // �������: ����
			preparestatement.setString(5, memberDTO.getPhonenumber());
			preparestatement.setString(6, memberDTO.getEmail());
			preparestatement.setString(7, memberDTO.getAddress());

			result = preparestatement.executeUpdate(); // ������ �����ؼ� ����� ������ ����

			if (result > 0) {
				connection.commit(); // ��������
			} else {
				System.out.println("���� ���� ��� : " + result);
				System.out.println("�Է½���!!!");
				connection.rollback(); // �ѹ�(�������)
			}
		} catch (SQLException e) {
			System.out.println("���ܹ߻� : insertMember()�޼��忡 �������� Ȯ���ϼ��� ");
			e.printStackTrace();

		} finally {
			if (preparestatement != null) {
			    preparestatement.close();
			}
		}
		
	}

	public void selectAll() throws SQLException { 
		try {
			String sql = "select * from member order by mno desc";

			statement = connection.createStatement(); 
			resultset = statement.executeQuery(sql); 

			System.out.printf("%-5s %-10s %-10s %-8s %-15s %-20s %-15s %-12s\n", "��ȣ", "id", "�̸�", "�������", "�ڵ��� ��ȣ", "�̸��� �ּ�", "�� �ּ�", "������");
			while (resultset.next()) {
				 System.out.printf("%-5d %-10s %-10s %-8d %-15s %-20s %-15s %-12s\n", resultset.getInt("mno"), resultset.getString("id"), resultset.getString("mname"), resultset.getInt("birthday"), resultset.getString("phonenumber"), resultset.getString("email"), resultset.getString("address"), resultset.getDate("regidate").toString());
			}
			System.out.println("==================================");
		} catch (SQLException e) {
			// �����߻��� ����ó����
			System.out.println("selectAll()�޼��忡 �������� �߸� �Ǿ����ϴ�.");
			e.printStackTrace();
		} finally {
			// �׻���๮
			resultset.close();
			statement.close();
			// ���� ��ü�� �ݾƾ� �ٸ� �޼��嵵 ���� �۵���.
		}
		
	}

	public void readOne(String selectId) throws SQLException {
		// ���� ���ڿ��� �Ѿ�� ���� select ó���Ͽ� ��� ��

		try {
			String sql = "select mno, id, pw, mname, birthday, phonenumber, email, address, regidate from member where id= ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, selectId); // service���� �Ѿ�� ã�� ���� ������ ?�� �Ѿ��.
			resultset = preparestatement.executeQuery(); // ������ ���� �� ����� ǥ�� �޴´�.

			if (resultset.next()) {
				MemberDTO memberDTO = new MemberDTO();

				memberDTO.setMno(resultset.getInt("mno"));
				memberDTO.setId(resultset.getString("id"));
				memberDTO.setPw(resultset.getString("pw"));
				memberDTO.setMname(resultset.getString("mname"));
				memberDTO.setBirthday(resultset.getInt("birthday"));
				memberDTO.setPhonenumber(resultset.getString("phonenumber"));
				memberDTO.setEmail(resultset.getString("email"));
				memberDTO.setAddress(resultset.getString("address"));
				memberDTO.setRegidate(resultset.getDate("regidate"));

				System.out.println("=========================");
				System.out.println("ȸ�� ��ȣ : " + memberDTO.getMno());
				System.out.println("ȸ�� ���̵� : " + memberDTO.getId());
				System.out.println("ȸ�� ��й�ȣ : " + memberDTO.getPw());
				System.out.println("ȸ�� �̸� : " + memberDTO.getMname());
				System.out.println("ȸ�� ������� : " + memberDTO.getBirthday());
				System.out.println("ȸ�� �ڵ��� ��ȣ : " + memberDTO.getPhonenumber());
				System.out.println("ȸ�� �̸��� �ּ� : " + memberDTO.getEmail());
				System.out.println("ȸ�� �� �ּ� : " + memberDTO.getAddress());
				System.out.println("������ : " + memberDTO.getRegidate());

			} else {
				// �˻� ����� ������!!!
				System.out.println("�ش��ϴ� �Խù��� �������� �ʽ��ϴ�.");

			} // if�� ����

		} catch (SQLException e) {
			System.out.println("���ܹ߻� : readOne() �޼��带 Ȯ���ϼ���");
			e.printStackTrace();
		} finally {
			// �׻� ���๮
			resultset.close();
			preparestatement.close();
		}
	}//readOne() �޼��� ����

	public void modifyOne(String selectId, Scanner inputStr) throws SQLException {
		MemberDTO memberDTO = new MemberDTO();
		Scanner inputInt = new Scanner(System.in);
		System.out.println("������ " + selectId + "������ ������� �Է��ϼ���");
		
		System.out.print("�̸� : ");
		memberDTO.setMname(inputStr.next());
		System.out.print("��й�ȣ : ");
		memberDTO.setPw(inputStr.next());
		System.out.print("������� : ");
		memberDTO.setBirthday(inputInt.nextInt());
		System.out.print("�ڵ��� ��ȣ : ");
		memberDTO.setPhonenumber(inputStr.next());
		System.out.print("�̸��� �ּ� : ");
		memberDTO.setEmail(inputStr.next());
		System.out.print("�� �ּ� : ");
		memberDTO.setAddress(inputStr.next());

		try {
			String sql = "update member set mname=? , pw =?, birthday =?, phonenumber=?, email=?, address=? where id=?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, memberDTO.getMname()); 
			preparestatement.setString(2, memberDTO.getPw()); 
			preparestatement.setInt(3, memberDTO.getBirthday()); 
			preparestatement.setString(4, memberDTO.getPhonenumber()); 
			preparestatement.setString(5, memberDTO.getEmail()); 
			preparestatement.setString(6, memberDTO.getAddress()); 
			preparestatement.setString(7, selectId); 

			result = preparestatement.executeUpdate(); // ������ ������ ����� ������ ����

			if (result > 0) {
				System.out.println(memberDTO.getMname() + "���� ������ ���� �Ǿ����ϴ�. ");
				connection.commit(); // ���� ����
			} else {
				System.out.println("������ ���� �ʾҽ��ϴ�.");
				connection.rollback();
			}

		} catch (SQLException e) {
			System.out.println("���ܹ߻� : modify() �޼���� sql���� Ȯ���ϼ���!!!");
			e.printStackTrace();
		} finally {
			preparestatement.close();
		}
	}

	public void deleteOne(String selectId) throws SQLException {
		// ���񽺿��� ���� ���� ���̵��� �����͸� �����Ѵ�.
		try {
	        String sql = "DELETE FROM member WHERE id = ?";
	        preparestatement = connection.prepareStatement(sql);
	        preparestatement.setString(1, selectId);

	        result = preparestatement.executeUpdate();

	        if (result > 0) {
	            System.out.println(selectId + "���� Ż��Ǿ����ϴ�.");
	            connection.commit(); 
	        } else {
	            System.out.println("Ż����� �ʾҽ��ϴ�.");
	            connection.rollback();
	        }

	        selectAll(); // ���� �� ��ü ȸ�� ����

	    } catch (SQLException e) {
	        System.out.println("���ܹ߻� : deleteOne() �޼��忡�� ����");
	        e.printStackTrace();
	    } finally {
	    	preparestatement.close();	       
	    }
	}


	
	
}
