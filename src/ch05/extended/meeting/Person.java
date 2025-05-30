package ch05.extended.meeting;


public class Person {
	// 필드
	private String name; // 성명
	private String sex; // 성별
	private int age; //나이
	
	// 미팅 날짜 필드
	public int year;
	public int month; // 컴퓨터는 0일 시작이라 +1을 진행
	public int day;
	
	public String place; // 미팅 장소
	
	// 게터 세터 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	// 기본 생성자
	public Person() {
		super();
	}
	
	// 파라미터가 포함된 생성자
	public Person(String name, String sex, int age, String place, int year, int month, int day) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.place = place;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}// 클래스 종료
