package it.bank.day02;

public class Two {
	public static void main(String[] args) {
		int kor=95; //지역변수  = local variable, 값이없는 상태에서 출력하면 에러
		final int SIZE = 200; //상수로 아래에서 변수값을 변경할 수 없다.
		String SM = "이수만 사단";
		double PI = 3.1415;	
		
		System.out.println("국어 = " + kor);
		System.out.println("크기 = " + SIZE);
		System.out.println("사단 = " + SM);
		System.out.println("파이 = " + PI);
		
		kor = 40;//지역변수는 변경이 가능
		//SIZE = 70;
		SM = "박진영사단";
		PI = 78.9;
		System.out.println("국어 = " + kor);
		System.out.println("크기 = " + SIZE);
		System.out.println("사단 = " + SM);
		System.out.println("파이 = " + PI);

	}//main END
}//class END
