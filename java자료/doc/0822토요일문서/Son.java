package it.bank.day22;

public class Son  extends Father{
  public static void main(String[ ] args ){
	  Son  tom = new Son( );
	  tom.game( );
	  System.out.println();//라인개행=enter
	  Two.nemo();//static있으면 직접호출이 가능해요
  }//end
  
  public void game( ){ //Non-static일반함수
	  System.out.println("Son.java");
	  System.out.println("game( )메소드 WOW...");
	  bank( );
  }//end
  
}//class END






