package ch05.extended.meeting;

import java.util.Scanner;

public class meetingExam {

	public static void main(String[] args) {
		// 객체를 생성하여 상속 테스트용
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputLine = new Scanner(System.in);

		Server server = new Server();
		System.out.print("직원 번호를 입력하세요: ");
		server.setServerID(inputStr.next());
		
		System.out.print("직원 이름을 입력하세요: ");
		server.setName(inputStr.next());
		
		System.out.print("직원 성별을 입력하세요: ");
		server.setSex(inputStr.next());
		
		System.out.print("직원 나이를 입력하세요: ");
		server.setAge(inputInt.nextInt());
		
		System.out.print("직원 직급을 입력하세요: ");
		server.setPosition(inputStr.next());
		
		System.out.print("직원 성과 점수룰 입력하세요: ");
		server.setPerformancePoint(inputInt.nextInt());
		System.out.println("==================================\n");

		Client client = new Client();
		System.out.print("고객 이름을 입력하세요: ");
		client.setName(inputStr.next());
		
		System.out.print("고객 성별을 입력하세요: ");
		client.setSex(inputStr.next());
		
		System.out.print("고객 나이을 입력하세요: ");
		client.setAge(inputInt.nextInt());
		
		System.out.print("고객 직급를 입력하세요: ");
		client.setPosition(inputStr.next());
		
		System.out.print("고객의 특이사항을 입력하세요: ");
		client.setSingularity(inputLine.nextLine());
		
		System.out.print("고객 점수룰 입력하세요: ");
		client.setPerformancePoint(inputInt.nextInt());
		
		System.out.print("고객과 미팅 일정 입력하세요.");
		System.out.print("년도: ");
		client.setYear(inputInt.nextInt());
		System.out.print("월: ");
		client.setMonth(inputInt.nextInt());
		System.out.print("일: ");
		client.setDay(inputInt.nextInt());
		
		System.out.print("미팅 장소를 입력하세요: ");
		client.setPlace(inputLine.nextLine());
		System.out.println("==================================\n");

		server.show();
		System.out.println("==================================\n");
		client.show();

	}

}
