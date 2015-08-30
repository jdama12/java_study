package it.bank.day22;

public interface Game {
	//interface상속키워드는 implements
	//interface상속하면 반드시 추상메소드 재정의
	//interface는 추상메소드만=구현이나 { }있음 에러발생
	//interface는 abstract키워드 생략가능해요
	public abstract  void android( );
	public abstract  int price( );
	public abstract  String book( );
}//interface END
