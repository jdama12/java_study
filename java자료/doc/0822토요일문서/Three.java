package it.bank.day22;

public abstract class Three { //추상클래스=여러메소드혼합
  //추상메소드가 하나라도 있으면 자동으로 추상클래스 
  public abstract void  study( );//abstract메소드=함수를선언만
	
  public String book( ){//Non-static일반함수
	String title="몽블랑";
	return title;
  }//end
  
  public void star( ){//Non-static일반함수
	  for(int i=0; i<5; i++){
		  for(int J=0; J<=i ; J++){
			  System.out.print("★ ");
		  }//J end
		  System.out.println( );//라인개행=enter
	  }//i end
  }//end
  
  public static void nemo( ){//static정적함수
	for(int i=0; i<3; i++){
		System.out.println("# # # # #");
	}
  }//end
  
  
}//class END
