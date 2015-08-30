package it.bank.day02;

public class Two {
	public static void main(String[] args) {
		final int SIZE = 200; //상수
		final String SM="이수만사단"; //상수
		final double PI=3.1415;//상수
		
		int kor=95; //local variable, 값이없는상태출력에러
		System.out.println("국어=" + kor );
		kor=40 ; //지역변수는 값변경이 가능
		System.out.println("국어=" + kor );
		System.out.println("크기=" + SIZE );
		System.out.println("사단=" + SM );
		System.out.println("파이=" + PI );
	}//main end
}//class END




