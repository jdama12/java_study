package it.bank.day23;

public class Father {
	private  String SM="아뱅";//필드=field=속성 
	private  int m=7800;//필드=field=속성 
	
	public Father( ){  } //기본생성자 생략가능함
	public Father(String name){ }//생성자도 중복가능
		
	public void bank( ){//Non-static=일반함수
		System.out.println("Father bank( ) -300억");
		int m=2300;//지역변수
		System.out.println("지역변수m=" + m); //2300
		System.out.println("전역변수m=" + this.m); //7800
	}//end
	
	public String house( ){//Non-static=일반함수
		System.out.println("Father house( )함수");
		String type="아파트";
		return type ;
	}//end

	//PDF10장 21페이지 함수의중복=OverLoading
	//생성자중복=생성자 OverLoading
	public void move(String city){ }
	public void move(String city, int m){ }
	public void move(String city, int m, String sub){ }
}//Father class END





