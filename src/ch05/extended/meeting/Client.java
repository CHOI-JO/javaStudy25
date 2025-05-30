package ch05.extended.meeting;

public class Client extends Person {
	//필드
	private String position;
	private String Singularity;
	private int performancePoint;
	
	// 게터 세터 생성
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSingularity() {
		return Singularity;
	}
	public void setSingularity(String singularity) {
		Singularity = singularity;
	}
	public int getPerformancePoint() {
		return performancePoint;
	}
	public void setPerformancePoint(int performancePoint) {
		this.performancePoint = performancePoint;
	}
	
	public Client(String name, String sex, int age, String place, int year, int month, int day, String position,
			String singularity, int performancePoint) {
		super(name, sex, age, place, year, month, day);
		this.position = position;
		Singularity = singularity;
		this.performancePoint = performancePoint;
	}

	// 기본 생성자
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		// 입력된 필드를 출력하는 메서드
		System.out.println("-------------------------");
		System.out.println("고객 이름: " + getName()); // 부모
		System.out.println("고객 성별: " + getSex());
		System.out.println("고객 나이: " + getAge());
		System.out.println("미팅 장소: " + getPlace());
		System.out.println("미팅 날짜: " + getYear() + "년 " + getMonth() + "월 " + getDay() + "일");
		System.out.println("--------------------------");
		System.out.println("고객 직급: " + getPosition()); // 자식
		System.out.println("고객 특이사항: " + getSingularity());
		System.out.println("고객 점수: " + getPerformancePoint());
		System.out.println("--------------------------");

	}
}
