package it.bank.day08;

public class Two {
	public static void main(String[] args) {
	  int a=92,b=0,c=0,d=0;
	    try{
	    	c=a+b;
	    	d=a/b; //실행시에러발생하면 제외시킴
	    }catch(Exception ex){ }
		
	   System.out.println(a+"+"+b+"="+c);
	   System.out.println(a+"/"+b+"="+d);
	   System.out.println("\n마지막문장=영수증역할");
	}//main end
}//class END
