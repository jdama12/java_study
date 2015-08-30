package it.bank.day02;

public class Father {
	private int password=1234; //필드=멤버변수=전역변수
	public static void main(String[] args) {//static정적함수
		System.out.println("Father클래스의 main함수");
		Father john = new Father( );
		john.bank( );
	}//main end
	
	public void bank( ){ //Non-static=일반함수
		int password=7800;//지역변수
		int m=300;
		System.out.println(m+"억 있어요");
	}//bank end
}//class END
