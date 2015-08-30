package it.bank.day02;

public class First {
	public static void main(String[] args) {
	  int a=0, b=0, c=0;
	  //for(1;2;3){ }, while(조건){ }, do{~}while(조건);
	  for(int i=0; i<10 ; i++){
		  a++;//단항연산
		  System.out.print( a  + "  " );  //1 2 ~ 9 10
	  }//for end
	  
	  System.out.println( ); //enter기능
	   while(true){
		  b=b+1; 
		  System.out.print( b  + "  " ); //1~10
		  if(b==10) break ;
	   }//while end
	  
	  System.out.println( ); //enter기능
	  do{
		 ++c;
		 System.out.print( c  + "  " ); //1~10
	  }while(c<10);
	  
	  
	}//main end
}//class END
