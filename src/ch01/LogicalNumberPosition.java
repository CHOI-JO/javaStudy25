package ch01;

public class LogicalNumberPosition {

	public static void main(String[] args) {
		int number = 974;
		String name = "choi jj";
		double length = 160.56d;
		
		System.out.printf("%d\n", number);
		System.out.printf("%o\n", number);
		System.out.printf("%x\n", number);
		System.out.printf("%c\n", number);
		System.out.printf("%7d\n", number);
		System.out.printf("%-7d\n", number);
		System.out.printf("%07d\n", number);
		System.out.println("------------------------------------------");
		System.out.printf("%.2f\n", length);
		System.out.printf("%e\n", length);
		System.out.printf("%10.4f\n", length);
		System.out.printf("%010.4f\n", length);
		System.out.printf("%-10.4f\n", length);
		System.out.println("-------------------------------------------");		
		System.out.printf("%s\n", name);
		System.out.printf("%50s\n", name);
		System.out.printf("%-50s\n", name);
		System.out.println("-------------------------------------------");		
		System.out.println("16 << 5 = " + (256  << 5));
		System.out.println("-16 >> 5 = " + (-256 >> 5));
		System.out.println("-16 >>> 3 = " + (-256 >>> 3));
	}

}
