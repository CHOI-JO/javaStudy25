package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner inputChar = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner inputLine = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputDouble = new Scanner(System.in);

		System.out.println("====================================");
		System.out.println("=============엠비씨 아카데미============");
		System.out.println("=============성적처리프로그램============");
		System.out.println("a. 교직원 관리");
		System.out.println("b. 학생 관리");
		System.out.println("c. 성적 관리");
		System.out.println("z. 프로그램 종료");
		System.out.println("\n" + "===================================");
		System.out.print("(a~z)>>>");
		char select = inputChar.next().charAt(0); //0번지에 맨 앞에 잇는 문자가 들어감
		
		System.out.println("\n" + "===================================");
		System.out.println("선택한 문자 : " + select);
		
		switch(select) {
		case 'A' :
		case 'a' :
			System.out.println("\n" + "===================================");
			System.out.println("교직원 관리 메뉴로 진입하셨습니다.");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			int num1 = inputInt.nextInt();
			System.out.println("\n" + "===================================");
			System.out.println("선택한 번호 : " + num1);
			
			switch(num1) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("교직원 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				System.out.println("\n" + "등록할 직원의 이름을 입력하세요.");
				String employee = inputString.next();
				
				System.out.println("\n" + "직원의 직급을 입력하세요.");
				String position = inputString.next();
				
				System.out.println("\n" + "성별을 입력하세요.");
				String gender = inputString.next();
				
				System.out.println("\n" + "나이를 입력하세요.");
				int age = inputInt.nextInt();
				
				System.out.println("\n" + "휴대번호를 입력하세요.");
				String phoneNumber = inputString.next();

				System.out.println("\n" + "이메일 주소를 입력하세요.");
				String eMail = inputString.next();
				
				System.out.println("\n" + "집 주소를 입력하세요.");
				String address = inputLine.nextLine();

				System.out.println("\n" + "새로운 교직원 등록이 완료되었습니다.");
				System.out.println("===================================");
				System.out.println("이름: " + employee);
				System.out.println("직급: " + position);
				System.out.println("성별: " + gender);
				System.out.println("나이: " + age);
				System.out.println("휴대번호: " + phoneNumber);
				System.out.println("이메일 주소: " + eMail);
				System.out.println("집 주소 : " + address);
				System.out.println("===================================");
				System.out.println("교직원 등록이 종료되었습니다.");
				break;
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("교직원 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("확인할 교직원 번호를 입력하세요.");
				System.out.println("1. 짱구");
				System.out.println("2. 영구");
				System.out.println("3. 맹구");
				System.out.println("4. 짱아");
				System.out.println("5. 동구");
				int employeeNumber = inputInt.nextInt();
				
				switch(employeeNumber) { // 교직원 정보를 보기 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 짱구(남)");
					System.out.println("나이: 35");
					System.out.println("직급: 대리");
					System.out.println("휴대전화번호: 010-1234-5678");
					System.out.println("이메일: abc@gmail.com");
					System.out.println("주소: 경기도 안산시 부곡동");
					System.out.println("===================================" + "\n");
					break;
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 영구(남)");
					System.out.println("나이: 39");
					System.out.println("직급: 부장");
					System.out.println("휴대전화번호: 010-1234-9999");
					System.out.println("이메일: bbb@gmail.com");
					System.out.println("주소: 경기도 수원시 팔달구");
					System.out.println("===================================" + "\n");
					break;
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 맹구(남)");
					System.out.println("나이: 28");
					System.out.println("직급: 사원");
					System.out.println("휴대전화번호: 010-1234-0000");
					System.out.println("이메일: ccc@gmail.com");
					System.out.println("주소: 경기도 수원시 장안문");
					System.out.println("===================================" + "\n");
					break;
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 짱아(여)");
					System.out.println("나이: 22");
					System.out.println("직급: 인턴");
					System.out.println("휴대전화번호: 010-1234-8888");
					System.out.println("이메일: ddd@gmail.com");
					System.out.println("주소: 경기도 안산시 이동");
					System.out.println("===================================" + "\n");
					break;
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 동구(남)");
					System.out.println("나이: 56");
					System.out.println("직급: 사장");
					System.out.println("휴대전화번호: 010-1234-1111");
					System.out.println("이메일: 1111@gmail.com");
					System.out.println("주소: 경기도 안산시 중앙동");
					System.out.println("===================================" + "\n");
					break;
				}// 교직원 보기 Switch문 종료
				break;
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("교직원 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("수정할 교직원의 번호를 선택해주세요");
				System.out.println("1. 짱구");
				System.out.println("2. 영구");
				System.out.println("3. 맹구");
				System.out.println("4. 짱아");
				System.out.println("5. 동구");
				int employeeChangeInfomation = inputInt.nextInt();
				
				switch(employeeChangeInfomation) { //교직원 수정을 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 직급");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int employeeChangeNumber1 = inputInt.nextInt();
					
					switch(employeeChangeNumber1) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String employeeChangeName = inputString.next();
						
						System.out.println("교직원의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + employeeChangeName);
						System.out.println("나이: 35");
						System.out.println("직급: 대리");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int employeeChangeAge = inputInt.nextInt();
						
						System.out.println("교직원의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱구");
						System.out.println("나이: " + employeeChangeAge);
						System.out.println("직급: 대리");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 직급을 입력해주세요.");
						String employeeChangePosition = inputString.next();
						
						System.out.println("교직원의 직급이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱구");
						System.out.println("나이: 35");
						System.out.println("직급: " + employeeChangePosition);
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String employeeChangePhoneNumber = inputString.next();
						
						System.out.println("교직원의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱구");
						System.out.println("나이: 35");
						System.out.println("직급: 대리");
						System.out.println("휴대전화번호: " + employeeChangePhoneNumber);
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String employeeChangeEmail = inputString.next();
						
						System.out.println("교직원의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱구");
						System.out.println("나이: 35");
						System.out.println("직급: 대리");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: " + employeeChangeEmail);
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String employeeChangeAddress = inputLine.nextLine();
						
						System.out.println("교직원의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱구");
						System.out.println("나이: 35");
						System.out.println("직급: 대리");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: " + employeeChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //교직원의 항목을 수정하는 switch 종료

					break; // 1번 교직원 수정 종료
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 직급");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int employeeChangeNumber2 = inputInt.nextInt();
					
					switch(employeeChangeNumber2) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String employeeChangeName = inputString.next();
						
						System.out.println("교직원의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + employeeChangeName);
						System.out.println("나이: 39");
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int employeeChangeAge = inputInt.nextInt();
						
						System.out.println("교직원의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 영구");
						System.out.println("나이: " + employeeChangeAge);
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 직급을 입력해주세요.");
						String employeeChangePosition = inputString.next();
						
						System.out.println("교직원의 직급이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 영구");
						System.out.println("나이: 39");
						System.out.println("직급: " + employeeChangePosition);
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String employeeChangePhoneNumber = inputString.next();
						
						System.out.println("교직원의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 영구");
						System.out.println("나이: 39");
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: " + employeeChangePhoneNumber);
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String employeeChangeEmail = inputString.next();
						
						System.out.println("교직원의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 영구");
						System.out.println("나이: 39");
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: " + employeeChangeEmail);
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String employeeChangeAddress = inputLine.nextLine();
						
						System.out.println("교직원의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 영구");
						System.out.println("나이: 39");
						System.out.println("직급: 부장");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: " + employeeChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //교직원의 항목을 수정하는 switch 종료
					
					break; // 2번 교직원 수정 switch 종료
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 직급");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int employeeChangeNumber3 = inputInt.nextInt();
					
					switch(employeeChangeNumber3) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String employeeChangeName = inputString.next();
						
						System.out.println("교직원의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + employeeChangeName);
						System.out.println("나이: 28");
						System.out.println("직급: 사원");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int employeeChangeAge = inputInt.nextInt();
						
						System.out.println("교직원의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 맹구");
						System.out.println("나이: " + employeeChangeAge);
						System.out.println("직급: 사원");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 직급을 입력해주세요.");
						String employeeChangePosition = inputString.next();
						
						System.out.println("교직원의 직급이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 맹구");
						System.out.println("나이: 28");
						System.out.println("직급: " + employeeChangePosition);
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String employeeChangePhoneNumber = inputString.next();
						
						System.out.println("교직원의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 맹구");
						System.out.println("나이: 28");
						System.out.println("직급: 사원");
						System.out.println("휴대전화번호: " + employeeChangePhoneNumber);
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String employeeChangeEmail = inputString.next();
						
						System.out.println("교직원의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 맹구");
						System.out.println("나이: 28");
						System.out.println("직급: 사원");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: " + employeeChangeEmail);
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String employeeChangeAddress = inputLine.nextLine();
						
						System.out.println("교직원의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 맹구");
						System.out.println("나이: 28");
						System.out.println("직급: 사원");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: " + employeeChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //교직원의 항목을 수정하는 switch 종료	
					
					break;// 3번 교직원 수정 switch 종료
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 직급");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int employeeChangeNumber4 = inputInt.nextInt();
					
					switch(employeeChangeNumber4) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String employeeChangeName = inputString.next();
						
						System.out.println("교직원의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + employeeChangeName);
						System.out.println("나이: 22");
						System.out.println("직급: 인턴");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int employeeChangeAge = inputInt.nextInt();
						
						System.out.println("교직원의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱아");
						System.out.println("나이: " + employeeChangeAge);
						System.out.println("직급: 인턴");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 직급을 입력해주세요.");
						String employeeChangePosition = inputString.next();
						
						System.out.println("교직원의 직급이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱아");
						System.out.println("나이: 22");
						System.out.println("직급: " + employeeChangePosition);
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String employeeChangePhoneNumber = inputString.next();
						
						System.out.println("교직원의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱아");
						System.out.println("나이: 22");
						System.out.println("직급: 인턴");
						System.out.println("휴대전화번호: " + employeeChangePhoneNumber);
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String employeeChangeEmail = inputString.next();
						
						System.out.println("교직원의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱아");
						System.out.println("나이: 22");
						System.out.println("직급: 인턴");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: " + employeeChangeEmail);
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String employeeChangeAddress = inputLine.nextLine();
						
						System.out.println("교직원의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 짱아");
						System.out.println("나이: 22");
						System.out.println("직급: 인턴");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: " + employeeChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //교직원의 항목을 수정하는 switch 종료

					break; // 4번 교직원 수정 완료
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 교직원 번호는 " + employeeChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 직급");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int employeeChangeNumber5 = inputInt.nextInt();
					
					switch(employeeChangeNumber5) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String employeeChangeName = inputString.next();
						
						System.out.println("교직원의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + employeeChangeName);
						System.out.println("나이: 56");
						System.out.println("직급: 사장");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int employeeChangeAge = inputInt.nextInt();
						
						System.out.println("교직원의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 동구(남)");
						System.out.println("나이: " + employeeChangeAge);
						System.out.println("직급: 사장");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 직급을 입력해주세요.");
						String employeeChangePosition = inputString.next();
						
						System.out.println("교직원의 직급이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 동구(남)");
						System.out.println("나이: 56");
						System.out.println("직급: " + employeeChangePosition);
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String employeeChangePhoneNumber = inputString.next();
						
						System.out.println("교직원의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 동구(남)");
						System.out.println("나이: 56");
						System.out.println("직급: 사장");
						System.out.println("휴대전화번호: " + employeeChangePhoneNumber);
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String employeeChangeEmail = inputString.next();
						
						System.out.println("교직원의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 동구(남)");
						System.out.println("나이: 56");
						System.out.println("직급: 사장");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: " + employeeChangeEmail);
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String employeeChangeAddress = inputLine.nextLine();
						
						System.out.println("교직원의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 동구(남)");
						System.out.println("나이: 56");
						System.out.println("직급: 사장");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: " + employeeChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //교직원의 항목을 수정하는 switch 종료

					break; // 5번 교직원 수정 완료
				}// 교직원 수정 Switch문 종료
				break;
			case 4 :
				System.out.println("\n" + "===================================");
				System.out.println("교직원 삭제 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("삭제할 교직원 번호를 입력하세요.");
				System.out.println("1. 짱구");
				System.out.println("2. 영구");
				System.out.println("3. 맹구");
				System.out.println("4. 짱아");
				System.out.println("5. 동구");
				int employeeDelete = inputInt.nextInt();
				
				switch(employeeDelete) {
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("짱구님의 데이터가 삭제되었습니다.");
					break;
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("영구님의 데이터가 삭제되었습니다.");
					break;
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("맹구님의 데이터가 삭제되었습니다.");
					break;
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("짱아님의 데이터가 삭제되었습니다.");
					break;
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("동구님의 데이터가 삭제되었습니다.");
					break;
				} // 선택한 교직원 데이터 삭제
				
				break; // 교직원 삭제 switch 종료
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
			} // 교직원 Switch문 종료
			break;
		
		case 'B' :
		case 'b' :
			System.out.println("학생 관리 메뉴로 진입하셨습니다.");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 학생 수정");
			System.out.println("4. 학생 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			int student = inputInt.nextInt();
			System.out.println("선택한 번호 : " + student);
			
			switch(student) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				System.out.println("\n" + "등록할 학생의 이름을 입력하세요.");
				String studentName = inputString.next();
				
				System.out.println("\n" + "학생의 학년을 입력하세요.");
				String studentPosition = inputString.next();
				
				System.out.println("\n" + "성별을 입력하세요.");
				String studentGender = inputString.next();
				
				System.out.println("\n" + "나이를 입력하세요.");
				int studentAge = inputInt.nextInt();
				
				System.out.println("\n" + "휴대번호를 입력하세요.");
				String studentPhoneNumber = inputString.next();

				System.out.println("\n" + "이메일 주소를 입력하세요.");
				String studentMail = inputString.next();
				
				System.out.println("\n" + "집 주소를 입력하세요.");
				String studentAddress = inputLine.nextLine();

				System.out.println("\n" + "새로운 학생 등록이 완료되었습니다.");
				System.out.println("===================================");
				System.out.println("이름: " + studentName);
				System.out.println("학년: " + studentPosition);
				System.out.println("성별: " + studentGender);
				System.out.println("나이: " + studentAge);
				System.out.println("휴대번호: " + studentPhoneNumber);
				System.out.println("이메일 주소: " + studentMail);
				System.out.println("집 주소 : " + studentAddress);
				System.out.println("===================================");
				System.out.println("학생 등록이 종료되었습니다.");
				break; //학생등록 종료
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("확인할 학생의 번호를 입력하세요.");
				System.out.println("1. 김철수");
				System.out.println("2. 김영희");
				System.out.println("3. 박재현");
				System.out.println("4. 김수진");
				System.out.println("5. 이은지");
				int studentNumber = inputInt.nextInt();
				
				switch(studentNumber) { // 학생 정보를 보기 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김철수(남)");
					System.out.println("나이: 18");
					System.out.println("학년: 고3");
					System.out.println("휴대전화번호: 010-1234-5678");
					System.out.println("이메일: abc@gmail.com");
					System.out.println("주소: 경기도 안산시 부곡동");
					System.out.println("===================================" + "\n");
					break;
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김영희(여)");
					System.out.println("나이: 15");
					System.out.println("학년: 중3");
					System.out.println("휴대전화번호: 010-1234-9999");
					System.out.println("이메일: bbb@gmail.com");
					System.out.println("주소: 경기도 수원시 팔달구");
					System.out.println("===================================" + "\n");
					break;
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 박재현(남)");
					System.out.println("나이: 17");
					System.out.println("학년: 고2");
					System.out.println("휴대전화번호: 010-1234-0000");
					System.out.println("이메일: ccc@gmail.com");
					System.out.println("주소: 경기도 수원시 장안문");
					System.out.println("===================================" + "\n");
					break;
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김수진(여)");
					System.out.println("나이: 16");
					System.out.println("학년: 고1");
					System.out.println("휴대전화번호: 010-1234-8888");
					System.out.println("이메일: ddd@gmail.com");
					System.out.println("주소: 경기도 안산시 이동");
					System.out.println("===================================" + "\n");
					break;
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 이은지(여)");
					System.out.println("나이: 15");
					System.out.println("학년: 중3");
					System.out.println("휴대전화번호: 010-1234-1111");
					System.out.println("이메일: 1111@gmail.com");
					System.out.println("주소: 경기도 안산시 중앙동");
					System.out.println("===================================" + "\n");
					break;
				}
				break;// 학생 보기 Switch문 종료
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("학생 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("수정할 학생의 번호를 선택해주세요");
				System.out.println("1. 김철수");
				System.out.println("2. 김영희");
				System.out.println("3. 박재현");
				System.out.println("4. 김수진");
				System.out.println("5. 이은지");
				int studentChangeInfomation = inputInt.nextInt();
				
				switch(studentChangeInfomation) { //학생 수정을 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 학년");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int studentChangeNumber1 = inputInt.nextInt();
					
					switch(studentChangeNumber1) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String studentChangeName = inputString.next();
						
						System.out.println("학생의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + studentChangeName);
						System.out.println("나이: 18");
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int studentChangeAge = inputInt.nextInt();
						
						System.out.println("학생의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김철수");
						System.out.println("나이: " + studentChangeAge);
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 학년을 입력해주세요.");
						String studentChangePosition = inputString.next();
						
						System.out.println("학생의 학년이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김철수");
						System.out.println("나이: 18");
						System.out.println("학년: " + studentChangePosition);
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String studentChangePhoneNumber = inputString.next();
						
						System.out.println("학생의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김철수");
						System.out.println("나이: 18");
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: " + studentChangePhoneNumber);
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String studentChangeEmail = inputString.next();
						
						System.out.println("학생의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김철수");
						System.out.println("나이: 18");
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: " + studentChangeEmail);
						System.out.println("주소: 경기도 안산시 부곡동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String studentChangeAddress = inputLine.nextLine();
						
						System.out.println("학생의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김철수");
						System.out.println("나이: 18");
						System.out.println("학년: 고3");
						System.out.println("휴대전화번호: 010-1234-5678");
						System.out.println("이메일: abc@gmail.com");
						System.out.println("주소: " + studentChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //학생의 항목을 수정하는 switch 종료

					break; // 1번 학생 수정 종료
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 학년");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int studentChangeNumber2 = inputInt.nextInt();
					
					switch(studentChangeNumber2) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String studentChangeName = inputString.next();
						
						System.out.println("학생의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + studentChangeName);
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int studentChangeAge = inputInt.nextInt();
						
						System.out.println("학생의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김영희");
						System.out.println("나이: " + studentChangeAge);
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 학년을 입력해주세요.");
						String studentChangePosition = inputString.next();
						
						System.out.println("학생의 학년이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김영희");
						System.out.println("나이: 15");
						System.out.println("학년: " + studentChangePosition);
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String studentChangePhoneNumber = inputString.next();
						
						System.out.println("학생의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김영희");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: " + studentChangePhoneNumber);
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String studentChangeEmail = inputString.next();
						
						System.out.println("학생의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김영희");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: " + studentChangeEmail);
						System.out.println("주소: 경기도 수원시 팔달구");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String studentChangeAddress = inputLine.nextLine();
						
						System.out.println("학생의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김영희");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-9999");
						System.out.println("이메일: bbb@gmail.com");
						System.out.println("주소: " + studentChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //학생의 항목을 수정하는 switch 종료
					
					break; // 2번 학생 수정 switch 종료
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 학년");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int studentChangeNumber3 = inputInt.nextInt();
					
					switch(studentChangeNumber3) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String studentChangeName = inputString.next();
						
						System.out.println("학생의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + studentChangeName);
						System.out.println("나이: 17");
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int studentChangeAge = inputInt.nextInt();
						
						System.out.println("학생의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 박재현");
						System.out.println("나이: " + studentChangeAge);
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 학년을 입력해주세요.");
						String studentChangePosition = inputString.next();
						
						System.out.println("학생의 학년이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 박재현");
						System.out.println("나이: 17");
						System.out.println("학년: " + studentChangePosition);
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String studentChangePhoneNumber = inputString.next();
						
						System.out.println("학생의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 박재현");
						System.out.println("나이: 17");
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: " + studentChangePhoneNumber);
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String studentChangeEmail = inputString.next();
						
						System.out.println("학생의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 박재현");
						System.out.println("나이: 17");
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: " + studentChangeEmail);
						System.out.println("주소: 경기도 수원시 장안문");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String studentChangeAddress = inputLine.nextLine();
						
						System.out.println("학생의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 박재현");
						System.out.println("나이: 17");
						System.out.println("학년: 고2");
						System.out.println("휴대전화번호: 010-1234-0000");
						System.out.println("이메일: ccc@gmail.com");
						System.out.println("주소: " + studentChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //학생의 항목을 수정하는 switch 종료	
					
					break;// 3번 학생 수정 switch 종료
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 학년");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int studentChangeNumber4 = inputInt.nextInt();
					
					switch(studentChangeNumber4) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String studentChangeName = inputString.next();
						
						System.out.println("학생의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + studentChangeName);
						System.out.println("나이: 16");
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int studentChangeAge = inputInt.nextInt();
						
						System.out.println("학생의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김수진");
						System.out.println("나이: " + studentChangeAge);
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 학년을 입력해주세요.");
						String studentChangePosition = inputString.next();
						
						System.out.println("학생의 학년이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김수진");
						System.out.println("나이: 16");
						System.out.println("학년: " + studentChangePosition);
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String studentChangePhoneNumber = inputString.next();
						
						System.out.println("학생의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김수진");
						System.out.println("나이: 16");
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: " + studentChangePhoneNumber);
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String studentChangeEmail = inputString.next();
						
						System.out.println("학생의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김수진");
						System.out.println("나이: 16");
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: " + studentChangeEmail);
						System.out.println("주소: 경기도 안산시 이동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String studentChangeAddress = inputLine.nextLine();
						
						System.out.println("학생의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 김수진");
						System.out.println("나이: 16");
						System.out.println("학년: 고1");
						System.out.println("휴대전화번호: 010-1234-8888");
						System.out.println("이메일: ddd@gmail.com");
						System.out.println("주소: " + studentChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //학생의 항목을 수정하는 switch 종료

					break; // 4번 학생 수정 완료
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentChangeInfomation + " 입니다.");
					System.out.println("===================================" + "\n");

					System.out.println("수정할 사항의 해당하는 번호를 선택해주세요.");
					System.out.println("1. 이름");
					System.out.println("2. 나이");
					System.out.println("3. 학년");
					System.out.println("4. 휴대전화번호");
					System.out.println("5. 이메일");
					System.out.println("6. 주소");
					int studentChangeNumber5 = inputInt.nextInt();
					
					switch(studentChangeNumber5) { // 수정할 항목 번호 선택
					case 1 : 
						System.out.println("수정할 이름을 입력해주세요.");
						String studentChangeName = inputString.next();
						
						System.out.println("학생의 이름이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: " + studentChangeName);
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;
						
					case 2 : 
						System.out.println("수정할 나이을 입력해주세요.");
						int studentChangeAge = inputInt.nextInt();
						
						System.out.println("학생의 나이가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 이은지");
						System.out.println("나이: " + studentChangeAge);
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 3 : 
						System.out.println("수정할 학년을 입력해주세요.");
						String studentChangePosition = inputString.next();
						
						System.out.println("학생의 학년이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 이은지");
						System.out.println("나이: 15");
						System.out.println("학년: " + studentChangePosition);
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 4 : 
						System.out.println("수정할 휴대전화번호을 입력해주세요.");
						String studentChangePhoneNumber = inputString.next();
						
						System.out.println("학생의 휴대전화번호이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 이은지");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: " + studentChangePhoneNumber);
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 5 : 
						System.out.println("수정할 이메일을 입력해주세요.");
						String studentChangeEmail = inputString.next();
						
						System.out.println("학생의 이메일이 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 이은지");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: " + studentChangeEmail);
						System.out.println("주소: 경기도 안산시 중앙동");
						System.out.println("===================================" + "\n");
						break;

					case 6 : 
						System.out.println("수정할 주소를 입력해주세요.");
						String studentChangeAddress = inputLine.nextLine();
						
						System.out.println("학생의 주소가 수정되었습니다."+ "\n");
						System.out.println("===================================");
						System.out.println("이름: 이은지");
						System.out.println("나이: 15");
						System.out.println("학년: 중3");
						System.out.println("휴대전화번호: 010-1234-1111");
						System.out.println("이메일: 1111@gmail.com");
						System.out.println("주소: " + studentChangeAddress);
						System.out.println("===================================" + "\n");
						break;
					} //학생 항목을 수정하는 switch 종료

					break; // 5번 학생 수정 완료
				}// 학생 수정 Switch문 종료
				break;
			case 4 :
				System.out.println("학생 삭제 메뉴로 진입하셨습니다.");
				break;
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
			} // 학생 Switch문 종료
			break;
			
		case 'C' :
		case 'c' :
			System.out.println("성적 관리 메뉴로 진입하셨습니다.");
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("\n" + "===================================");
			System.out.print("(1~4)>>>>");
			
			int score = inputInt.nextInt();
			System.out.println("선택한 번호 : " + score);
			
			double math1 = 93;
			double korean1 = 96;
			double english1 = 90;
			double history1 = 97;
			double science1 = 87;
			double Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;

			double math2 = 85;
			double korean2 = 100;
			double english2 = 95.5;
			double history2 = 80;
			double science2 = 89;
			double Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
			
			double math3 = 87;
			double korean3 = 100;
			double english3 = 95.5;
			double history3 = 80;
			double science3 = 86;
			double Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;

			double math4 = 60;
			double korean4 = 79;
			double english4 = 91.5;
			double history4 = 80.5;
			double science4 = 77;
			double Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
			
			double math5 = 30;
			double korean5 = 68.5;
			double english5 = 59;
			double history5 = 72;
			double science5 = 85;
			double Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
			
			
			switch(score) {
			case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 등록 메뉴로 진입하셨습니다.");
				System.out.println("===================================");
				
				System.out.println("\n" + "성적을 등록할 학생의 이름을 입력하세요.");
				String studentName = inputString.next();
				
				System.out.println("\n" + "수학 점수를 입력하세요.");
				double studentMath = inputDouble.nextDouble();
				
				System.out.println("\n" + "국어 점수를 입력하세요.");
				double studentKorean = inputDouble.nextDouble();
				
				System.out.println("\n" + "영어 점수를 입력하세요.");
				double studentEnglish = inputDouble.nextDouble();
				
				System.out.println("\n" + "역사 점수를 입력하세요.");
				double studentHistory = inputDouble.nextDouble();

				System.out.println("\n" + "과학 점수를 입력하세요.");
				double studentScience = inputDouble.nextDouble();
				
				double Average = (studentMath + studentKorean + studentEnglish + studentHistory + studentScience) / 5;
				System.out.println("\n" + "성적 등록이 완료되었습니다.");
				System.out.println("\n" +"===================================");
				System.out.println("이름: " + studentName);
				System.out.println("전체 평균: " + Average);
				
				if(Average >= 95) {
					System.out.println("전체 등급: A");
				} else if(Average >= 90 || Average < 95) {
					System.out.println("전체 등급: B");
				} else if(Average >= 80 || Average < 90) {
					System.out.println("전체 등급: C");
				}  else if(Average >= 70 || Average < 80) {
					System.out.println("전체 등급: D");
				} else if (Average >= 0 || Average < 70) {
					System.out.println("전체 등급: F");
				} // 평균에 따른 등급 계산
				
				System.out.println("------------------------------------");
				System.out.println("수학: " + studentMath);
				System.out.println("국어: " + studentKorean);
				System.out.println("영어: " + studentEnglish);
				System.out.println("역사: " + studentHistory);
				System.out.println("과학: " + studentScience);
				System.out.println("===================================");
				System.out.println("성적 등록이 종료되었습니다.");

				break; //성적 등록 종료
				
			case 2 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 보기 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("확인할 학생의 번호를 입력하세요.");
				System.out.println("1. 김철수");
				System.out.println("2. 김영희");
				System.out.println("3. 박재현");
				System.out.println("4. 김수진");
				System.out.println("5. 이은지");
				int studentNumber = inputInt.nextInt();
				
				switch(studentNumber) { // 학생 정보를 보기 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김철수(남)");
					System.out.println("전체 평균: " + Average1);
					System.out.println("전체 등급: A");
					System.out.println("전체 학년 석차: 7등");
					System.out.println("수학: " + math1);
					System.out.println("국어: " + korean1);
					System.out.println("영어: " + english1);
					System.out.println("역사: " + history1);
					System.out.println("과학: " + science1);
					System.out.println("===================================" + "\n");
					break;
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김영희(여)");
					System.out.println("전체 평균: " + Average2);
					System.out.println("전체 등급: B");
					System.out.println("전체 학년 석차: 20등");
					System.out.println("수학: " + math2);
					System.out.println("국어: " + korean2);
					System.out.println("영어: " + english2);
					System.out.println("역사: " + history2);
					System.out.println("과학: " + science2);
					System.out.println("===================================" + "\n");
					break;
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 박재현(남)");
					System.out.println("전체 평균: " + Average3);
					System.out.println("전체 등급: B");
					System.out.println("전체 학년 석차: 21등");
					System.out.println("수학: " + math3);
					System.out.println("국어: " + korean3);
					System.out.println("영어: " + english3);
					System.out.println("역사: " + history3);
					System.out.println("과학: " + science3);
					System.out.println("===================================" + "\n");
					break;
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 김수진(여)");
					System.out.println("전체 평균: " + Average4);
					System.out.println("전체 등급: C");
					System.out.println("전체 학년 석차: 103등");
					System.out.println("수학: " + math4);
					System.out.println("국어: " + korean4);
					System.out.println("영어: " + english4);
					System.out.println("역사: " + history4);
					System.out.println("과학: " + science4);
					System.out.println("===================================" + "\n");
					break;
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentNumber + " 입니다.");
					System.out.println("===================================");
					System.out.println("이름: 이은지(여)");
					System.out.println("전체 평균: " + Average5);
					System.out.println("전체 등급: D");
					System.out.println("전체 학년 석차: 217등");
					System.out.println("수학: " + math5);
					System.out.println("국어: " + korean5);
					System.out.println("영어: " + english5);
					System.out.println("역사: " + history5);
					System.out.println("과학: " + science5);
					System.out.println("===================================" + "\n");
					break;
				}
				break;// 성적 보기 Switch문 종료
				
			case 3 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 수정 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("수정할 학생의 번호를 입력하세요.");
				System.out.println("1. 김철수");
				System.out.println("2. 김영희");
				System.out.println("3. 박재현");
				System.out.println("4. 김수진");
				System.out.println("5. 이은지");
				int studentScore = inputInt.nextInt();
				
				switch(studentScore) { // 학생 정보를 보기 위한 번호 선택
				case 1 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentScore + " 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					int studentSubjects = inputInt.nextInt();

					switch(studentSubjects) {
					case 1 :						
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 수학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						math1 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김철수 학생의 점수는 다음과 같습니다.");
						Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김철수(남)");
						System.out.println("전체 평균: " + Average1);
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;
						
					case 2 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 국어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						korean1 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김철수 학생의 점수는 다음과 같습니다.");
						Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김철수(남)");
						System.out.println("전체 평균: " + Average1);
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;

					case 3 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 영어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						english1 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김철수 학생의 점수는 다음과 같습니다.");
						Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김철수(남)");
						System.out.println("전체 평균: " + Average1);
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;
						
					case 4 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 역사 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						history1 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김철수 학생의 점수는 다음과 같습니다.");
						Average1 = (math1 + korean1 + english1 + history1 + science1) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김철수(남)");
						System.out.println("전체 평균: " + Average1);
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;
						
					case 5 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 과학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						science1 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김철수 학생의 점수는 다음과 같습니다.");
						Average1 = (math1 + korean1 + english1 + history1+ science1) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김철수(남)");
						System.out.println("전체 평균: " + Average1);
						System.out.println("수학: " + math1);
						System.out.println("국어: " + korean1);
						System.out.println("영어: " + english1);
						System.out.println("역사: " + history1);
						System.out.println("과학: " + science1);
						System.out.println("===================================" + "\n");
						break;
					} 
					break; // 첫번째 학생 점수 수정 종료문
					
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentScore + " 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();

					switch(studentSubjects) {
					case 1 :						
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 수학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						math2 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김영희 학생의 점수는 다음과 같습니다.");
						Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김영희(여)");
						System.out.println("전체 평균: " + Average2);
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;
						
					case 2 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 국어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						korean2 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김영희 학생의 점수는 다음과 같습니다.");
						Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김영희(여)");
						System.out.println("전체 평균: " + Average2);
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;

					case 3 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 영어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						english2 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김영희 학생의 점수는 다음과 같습니다.");
						Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김영희(여)");
						System.out.println("전체 평균: " + Average2);
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;
						
					case 4 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 역사 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						history2 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김영희 학생의 점수는 다음과 같습니다.");
						Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김영희(여)");
						System.out.println("전체 평균: " + Average2);
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;
						
					case 5 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 과학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						science2 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김영희 학생의 점수는 다음과 같습니다.");
						Average2 = (math2 + korean2 + english2 + history2 + science2) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김영희(여)");
						System.out.println("전체 평균: " + Average2);
						System.out.println("수학: " + math2);
						System.out.println("국어: " + korean2);
						System.out.println("영어: " + english2);
						System.out.println("역사: " + history2);
						System.out.println("과학: " + science2);
						System.out.println("===================================" + "\n");
						break;
					} 
					break; // 두 번째 학생 점수 수정 종료
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentScore + " 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();

					switch(studentSubjects) {
					case 1 :						
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 수학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						math3 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("박재현 학생의 점수는 다음과 같습니다.");
						Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 박재현(남)");
						System.out.println("전체 평균: " + Average3);
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;
						
					case 2 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 국어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						korean3 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("박재현 학생의 점수는 다음과 같습니다.");
						Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 박재현(남)");
						System.out.println("전체 평균: " + Average3);
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;

					case 3 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 영어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						english3 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("박재현 학생의 점수는 다음과 같습니다.");
						Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 박재현(남)");
						System.out.println("전체 평균: " + Average3);
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;
						
					case 4 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 역사 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						history3 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("박재현 학생의 점수는 다음과 같습니다.");
						Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 박재현(남)");
						System.out.println("전체 평균: " + Average3);
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;
						
					case 5 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 과학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						science3 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("박재현 학생의 점수는 다음과 같습니다.");
						Average3 = (math3 + korean3 + english3 + history3 + science3) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 박재현(남)");
						System.out.println("전체 평균: " + Average3);
						System.out.println("수학: " + math3);
						System.out.println("국어: " + korean3);
						System.out.println("영어: " + english3);
						System.out.println("역사: " + history3);
						System.out.println("과학: " + science3);
						System.out.println("===================================" + "\n");
						break;
					} 
					break; // 세 번째 학생 점수 수정 종료
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentScore + " 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();

					switch(studentSubjects) {
					case 1 :						
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 수학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						math4 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김수진 학생의 점수는 다음과 같습니다.");
						Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김수진(여)");
						System.out.println("전체 평균: " + Average4);
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;
						
					case 2 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 국어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						korean4 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김수진 학생의 점수는 다음과 같습니다.");
						Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김수진(여)");
						System.out.println("전체 평균: " + Average4);
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;

					case 3 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 영어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						english4 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김수진 학생의 점수는 다음과 같습니다.");
						Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김수진(여)");
						System.out.println("전체 평균: " + Average4);
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;
						
					case 4 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 역사 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						history4 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김수진 학생의 점수는 다음과 같습니다.");
						Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김수진(여)");
						System.out.println("전체 평균: " + Average4);
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;
						
					case 5 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 과학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						science4 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("김수진 학생의 점수는 다음과 같습니다.");
						Average4 = (math4 + korean4 + english4 + history4 + science4) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 김수진(여)");
						System.out.println("전체 평균: " + Average4);
						System.out.println("수학: " + math4);
						System.out.println("국어: " + korean4);
						System.out.println("영어: " + english4);
						System.out.println("역사: " + history4);
						System.out.println("과학: " + science4);
						System.out.println("===================================" + "\n");
						break;
					} 
					break; // 네 번째 학생 점수 수정 종료
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생 번호는 " + studentScore + " 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 수정할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();

					switch(studentSubjects) {
					case 1 :						
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 수학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						math5 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("이은지 학생의 점수는 다음과 같습니다.");
						Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 이은지(여)");
						System.out.println("전체 평균: " + Average5);
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;
						
					case 2 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 국어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						korean5 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("이은지 학생의 점수는 다음과 같습니다.");
						Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 이은지(여)");
						System.out.println("전체 평균: " + Average5);
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;

					case 3 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 영어 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						english5 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("이은지 학생의 점수는 다음과 같습니다.");
						Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 이은지(여)");
						System.out.println("전체 평균: " + Average5);
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;
						
					case 4 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 역사 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						history5 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("이은지 학생의 점수는 다음과 같습니다.");
						Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 이은지(여)");
						System.out.println("전체 평균: " + Average5);
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;
						
					case 5 :
						System.out.println("\n" + "===================================");
						System.out.println("선택한 과목은 과학 입니다.");
						System.out.println("수정할 점수를 입력하세요");
						science5 = inputDouble.nextDouble();
						
						System.out.println("\n" + "===================================");
						System.out.println("점수가 수정되었습니다.");
						System.out.println("이은지 학생의 점수는 다음과 같습니다.");
						Average5 = (math5 + korean5 + english5 + history5 + science5) / 5;
						
						System.out.println("\n" + "===================================");
						System.out.println("이름: 이은지(여)");
						System.out.println("전체 평균: " + Average5);
						System.out.println("수학: " + math5);
						System.out.println("국어: " + korean5);
						System.out.println("영어: " + english5);
						System.out.println("역사: " + history5);
						System.out.println("과학: " + science5);
						System.out.println("===================================" + "\n");
						break;
					} 
					break; // 다섯 번째 학생 점수 수정 종료
				}
				break;// 성적 수정 Switch문 종료
				
			case 4 :
				System.out.println("\n" + "===================================");
				System.out.println("성적 삭제 메뉴로 진입하셨습니다.");
				System.out.println("===================================");

				System.out.println("성적을 삭제할 학생의 번호를 입력하세요.");
				System.out.println("1. 김철수");
				System.out.println("2. 김영희");
				System.out.println("3. 박재현");
				System.out.println("4. 김수진");
				System.out.println("5. 이은지");
				studentNumber = inputInt.nextInt();
				
				switch(studentNumber) {
				case 1 :
				System.out.println("\n" + "===================================");
				System.out.println("선택한 학생은 김철수 입니다.");
				System.out.println("===================================" + "\n" );
				
				System.out.println("점수를 삭제할 과목 번호를 선택하세요");
				System.out.println("1. 수학");
				System.out.println("2. 국어");
				System.out.println("3. 영어");
				System.out.println("4. 역사");
				System.out.println("5. 과학");
				int studentSubjects = inputInt.nextInt();
				
				switch(studentSubjects) {
				case 1: 
					System.out.println("\n" + "===================================");
					System.out.println("수학 점수가 삭제되었습니다.");
					break;
					
				case 2: 
					System.out.println("\n" + "===================================");
					System.out.println("국어 점수가 삭제되었습니다.");
					break;
					
				case 3: 
					System.out.println("\n" + "===================================");
					System.out.println("영어 점수가 삭제되었습니다.");
					break;
					
				case 4: 
					System.out.println("\n" + "===================================");
					System.out.println("역사 점수가 삭제되었습니다.");
					break;
					
				case 5: 
					System.out.println("\n" + "===================================");
					System.out.println("과학 점수가 삭제되었습니다.");
					break;
				} // 첫 번째 학생의 해당 과목 점수 삭제 완료
				break; 
				
				case 2 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생은 김영희 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 삭제할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();
					
					switch(studentSubjects) {
					case 1: 
						System.out.println("\n" + "===================================");
						System.out.println("수학 점수가 삭제되었습니다.");
						break;
						
					case 2: 
						System.out.println("\n" + "===================================");
						System.out.println("국어 점수가 삭제되었습니다.");
						break;
						
					case 3: 
						System.out.println("\n" + "===================================");
						System.out.println("영어 점수가 삭제되었습니다.");
						break;
						
					case 4: 
						System.out.println("\n" + "===================================");
						System.out.println("역사 점수가 삭제되었습니다.");
						break;
						
					case 5: 
						System.out.println("\n" + "===================================");
						System.out.println("과학 점수가 삭제되었습니다.");
						break;
					} // 두 번째 학생의 해당 과목 점수 삭제 완료
					break; 
					
				case 3 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생은 박재현 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 삭제할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();
					
					switch(studentSubjects) {
					case 1: 
						System.out.println("\n" + "===================================");
						System.out.println("수학 점수가 삭제되었습니다.");
						break;
						
					case 2: 
						System.out.println("\n" + "===================================");
						System.out.println("국어 점수가 삭제되었습니다.");
						break;
						
					case 3: 
						System.out.println("\n" + "===================================");
						System.out.println("영어 점수가 삭제되었습니다.");
						break;
						
					case 4: 
						System.out.println("\n" + "===================================");
						System.out.println("역사 점수가 삭제되었습니다.");
						break;
						
					case 5: 
						System.out.println("\n" + "===================================");
						System.out.println("과학 점수가 삭제되었습니다.");
						break;
					} // 세 번째 학생의 해당 과목 점수 삭제 완료
					break; 
					
				case 4 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생은 김수진 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 삭제할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();
					
					switch(studentSubjects) {
					case 1: 
						System.out.println("\n" + "===================================");
						System.out.println("수학 점수가 삭제되었습니다.");
						break;
						
					case 2: 
						System.out.println("\n" + "===================================");
						System.out.println("국어 점수가 삭제되었습니다.");
						break;
						
					case 3: 
						System.out.println("\n" + "===================================");
						System.out.println("영어 점수가 삭제되었습니다.");
						break;
						
					case 4: 
						System.out.println("\n" + "===================================");
						System.out.println("역사 점수가 삭제되었습니다.");
						break;
						
					case 5: 
						System.out.println("\n" + "===================================");
						System.out.println("과학 점수가 삭제되었습니다.");
						break;
					} // 네 번째 학생의 해당 과목 점수 삭제 완료
					break; 
					
				case 5 :
					System.out.println("\n" + "===================================");
					System.out.println("선택한 학생은 이은지 입니다.");
					System.out.println("===================================" + "\n" );
					
					System.out.println("점수를 삭제할 과목 번호를 선택하세요");
					System.out.println("1. 수학");
					System.out.println("2. 국어");
					System.out.println("3. 영어");
					System.out.println("4. 역사");
					System.out.println("5. 과학");
					studentSubjects = inputInt.nextInt();
					
					switch(studentSubjects) {
					case 1: 
						System.out.println("\n" + "===================================");
						System.out.println("수학 점수가 삭제되었습니다.");
						break;
						
					case 2: 
						System.out.println("\n" + "===================================");
						System.out.println("국어 점수가 삭제되었습니다.");
						break;
						
					case 3: 
						System.out.println("\n" + "===================================");
						System.out.println("영어 점수가 삭제되었습니다.");
						break;
						
					case 4: 
						System.out.println("\n" + "===================================");
						System.out.println("역사 점수가 삭제되었습니다.");
						break;
						
					case 5: 
						System.out.println("\n" + "===================================");
						System.out.println("과학 점수가 삭제되었습니다.");
						break;
					} // 다섯 번째 학생의 해당 과목 점수 삭제 완료
					break; 
				}
				break; // 성적 삭제 종료
				
			default :
				System.out.println("메뉴에 없는 문자를 넣었습니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
				
			} // 성적 관리 Switch문 종료
			break;
			
		case 'Z' :
		case 'z' :
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default :
			System.out.println("메뉴에 없는 문자를 넣었습니다.");
			System.out.println("프로그램을 다시 실행해주세요.");
			break;
		} //Switch문 종료

	}

}
