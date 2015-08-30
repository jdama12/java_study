package it.bank.day23;

public class Son  extends Father{ 
	public Son( ){ }
	public Son(String name ){ }
	
	public static void main(String[] args){
		Son  tom = new Son( "톰소여" );
		tom.game( );
	}//end 
	
	public void bank( ){//Non-static=일반함수
		System.out.println("\nSon 제로상태뱅크");
	}//end
	
	public void game( ){ //Non-static일반함수
		System.out.println("WOW Loading..\n");
		super.bank();
		this.bank();
	}//end
}//class END

