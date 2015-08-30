package it.bank.day30;

public class Two {
	public static void main(String[] args) {
		String msg="안내문";
		String jumin="841224-1528913"; 
		//indexOf, substring, trim, toUpperCase, toLowerCase
		//문제1 indexOf, substring
		int pos= jumin.indexOf("-");
		//System.out.println("pos=" + pos);
		msg = jumin.substring(pos+1);
		System.out.println("주민번호 뒷번호 = " + msg);
				
		String data="  itBank  ";
		System.out.println();
		System.out.println("aa" + data + "bb" );
		System.out.println("aa" + data.trim() + "bb" );
		
		data="itBankApple";
		System.out.println();
		System.out.println(data.toLowerCase());
		System.out.println(data.toUpperCase());
		System.out.println(data.replace("Bank","bc"));
	}//end 
}//class END




