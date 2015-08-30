package it.bank.day09;

public class Seven {
	public static void main(String[] args) {
		int a = 92, b =0;
		int sum = 0, gob = 0, mok = 0;
		
		try{
			sum = a + b;
			gob =  a * b;
			mok = a / b; //실행중 에러방생하면 탈출
		}catch(Exception ex){}
	
		System.out.println("국어 = " +  a);
		System.out.println("영어 = " + b);
		System.out.println(a + " + " + b + " = " + sum );
		System.out.println(a + " * " + b + " = " + gob );
		System.out.println(a + " / " + b + " = " + mok );
	}//main END
}//class END
