package it.bank.day09;

public class First {
	public static void main(String[] args) {
		First ob = new First();
		
		ob.bank("KB국민은행", 7.8);
	}//main END
	
	//함수이름이 동일한경우를 overLoading - PDF10장 20P
	//상속시 부모클래스 메소드를 자식이 재정의 = overRiding
	
	/*bank Start*/
	public void bank() {
		System.out.println("bank(X)");
	}
	/*bank End*/
	
	/*bank Start*/
	public void bank(String name) {
		System.out.println("은행이름 = " + name);
	}
	/*bank End*/
	
	/*bank Start*/
	public void bank(String name, double rate) {
		System.out.println(name + "의 이자 = " + rate + "%" );
	}
	/*bank End*/
	
}//class END
