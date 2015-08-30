package it.bank.day09;

public class First {
	public static void main(String[] args) {
		First ob = new First( );
		ob.bank("KB국민은행", 7.8);
	}//main end
	
	//함수이름중복=OverLoading=오버로딩 => PDF10장 20
	//상속 부모클래스 메소드를 자식이 재정의=> OverRiding
	public void bank( ){//Non-static일반함수 
	  System.out.println("bank(X)");
	}//end
	
	public void bank(String name ){//Non-static일반함수 
	  System.out.println(name);
	}//end
	
	public void bank(String name, double rate ){//Non-static일반함수 
	  System.out.println(name + " " + rate +"%");
	}//end
}//class END



