package it.bank.day09;

public class Three {
	public static void main(String[] args) {
		int kor=85; //int=정수형=4Byte=냉장고
		double avg=78.9; //double=실수형=8Byte=코끼리
		String data="1200"; //String클래스
		
		int  a = (int)avg ;
		int  b = Integer.parseInt(data) ;
		System.out.println( b + 98); //1298
		System.out.println( data + 98); //120098
		//java.lang팩키지 Integer클래스  
		//static키워드 있는 함수는 클래스이름.메소드( )
	}//main end
}//class END









