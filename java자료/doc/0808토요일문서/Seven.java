package it.bank.day08;

public class Seven{
	public static void main(String[] args) {

	}//main end
	
	public String book( ){
		String title="몽블랑";//지역변수
		return title;
	}//end
	
	public  int  price( ){
		int m=23000;//지역변수
		return m;
	}//end
	
	public void  note( ){ //main함수호출
		String a = book( );
		//int b  = price( );
		System.out.println("제목=" + a );
		System.out.println("가격=" + price( ) );
	}//end
}//class END


