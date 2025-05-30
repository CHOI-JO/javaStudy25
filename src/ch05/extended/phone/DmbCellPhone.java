package ch05.extended.phone;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	
	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중지합니다.");
	}
	
}
