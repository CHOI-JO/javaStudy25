package testExam.dto;

public class StudentDTO {
	private String name; // 성명
	private String studentID; // 성별
	private double math;
	private double korean;
	private double english;
	private double history;
	private double science;
	
	//게터 세터 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getKorean() {
		return korean;
	}
	public void setKorean(double korean) {
		this.korean = korean;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getHistory() {
		return history;
	}
	public void setHistory(double history) {
		this.history = history;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	//기본 생성자
	public StudentDTO() {
		super();
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("이름: " + getName()); // 부모
		System.out.println("학생 번호: " + getStudentID());
		System.out.println("수학: " + getMath());
		System.out.println("국어: " + getKorean());
		System.out.println("영어: " + getEnglish());
		System.out.println("역사: " + getHistory());
		System.out.println("과학: " + getScience());
	}

	
}
