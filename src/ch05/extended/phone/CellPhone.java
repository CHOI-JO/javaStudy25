package ch05.extended.phone;

public class CellPhone {
	// 필드 
	String model;
	String color; // 부모 필드
	
	// 생성자 
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("본인: " + message);}
	void receiveVoice(String message) {System.out.println("상대방: " + message);}
	void hangup() {System.out.println("전화를 마칩니다.");}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
