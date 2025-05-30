package ch05.extended.meeting;

public class Server extends Person {
	//필드
	private String serverID;
	private String position;
	private int performancePoint;
	
	// 게터 세터 생성
	public String getServerID() {
		return serverID;
	}
	public void setServerID(String serverID) {
		this.serverID = serverID;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPerformancePoint() {
		return performancePoint;
	}
	public void setPerformancePoint(int performancePoint) {
		this.performancePoint = performancePoint;
	}
	
	// 생성자 - 부모로 부터 상송받음
	public Server(String name, String sex, int age, String place, int year, int month, int day, String serverID,
			String position, int performancePoint) {
		super(name, sex, age, place, year, month, day);
		this.serverID = serverID;
		this.position = position;
		this.performancePoint = performancePoint;
	}
	
	public Server() {
		// TODO Auto-generated constructor stub
	}
	public void show() {
		// 입력된 필드를 출력하는 메서드
		System.out.println("-------------------------");
		System.out.println("참석자 이름: " + getName()); // 부모
		System.out.println("참석자 성별: " + getSex());
		System.out.println("참석자 나이: " + getAge());
		System.out.println("사원 번호: " + getServerID()); // 자식
		System.out.println("사원 직급: " + getPosition());
		System.out.println("사원 점수: " + getPerformancePoint());
		System.out.println("--------------------------");

	}
}
