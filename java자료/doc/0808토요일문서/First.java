package it.bank.day08;

public class First {
	public static void main(String[] args){//static정적함수
		System.out.println("First.java main함수");
		First ff = new First( );
		ff.star( );
	}//main end
	
	public void star( ){ //Non-static일반함수
		for(int i=0; i<5; i++){
			for(int J=0 ; J <= i ; J++){
				System.out.print( "★ ");
			}//J end
			System.out.println( ); //Enter역할
		}//i end
	}//star end
}//class END
