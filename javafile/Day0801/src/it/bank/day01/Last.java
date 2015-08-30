package it.bank.day01;

public class Last {
	public static void main(String[] args) {
		int a = 90, b = 47;
		int sum = 0, sub = 0, gob = 0, mok = 0, nmg = 0;
		
		sum = a + b;
		sub = a - b;
		gob = a * b;
		mok = a / b;
		nmg = a % b;
		// 90 + 45 = 135
		
		System.out.println(a + " + "  + b + " = " + sum );
		System.out.println(a + " - "  + b + " = " + sub );
		System.out.println(a + " * "  + b + " = " + gob );
		System.out.println(a + " / "  + b + " = " + mok );
		System.out.println(a + " % "  + b + " = 나머지 값 " + nmg );
	}//main end
}//class END
