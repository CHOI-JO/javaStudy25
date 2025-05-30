package ch05.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못된 속도를 제공
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//정상적인 속도
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤 테스트
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 중지 상태: " + myCar.getSpeed());
	}

}
