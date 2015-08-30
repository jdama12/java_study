package it.bank.day22;

public class Two {  
  public void star( ){//Non-static일반함수
	  for(int i=0; i<5; i++){
		  for(int J=0; J<=i ; J++){
			  System.out.print("★ ");
		  }//J end
		  System.out.println( );//라인개행=enter
	  }//i end
  }//end
  
  public static void nemo( ){//static정적함수
	//메소드에 static키워드가 있으면 클래스이름.메소드( )
	for(int i=0; i<3; i++){
		System.out.println("# # # # #");
	}
  }//end
}//class END
