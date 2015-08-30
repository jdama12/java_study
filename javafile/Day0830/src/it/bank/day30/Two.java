package it.bank.day30;

public class Two {
	public static void main(String[] args) {
		String msg = "안내문";
		String jumin = "840620-1901909";
		//indexOf, substring, trim, toUpperCase, toLowerCase
		//문제1 indexOf, substring
		int pos = jumin.indexOf("-");
		//System.out.println("pos = " + pos);
		msg = jumin.substring(pos + 1);
		System.out.println("주민번호 뒷번호 = " + msg);
		System.out.println();
				
		String data = " itBankAndroid ";
		System.out.println("aa" + data + "bb");
		System.out.println("trim = " + "aa" + data.trim() + "bb");
		System.out.println();
		
		data = "itBankApple";
		System.out.println("toLowerCase = " + data.toLowerCase());
		System.out.println("toUpperCase = " + data.toUpperCase());
		System.out.println("replace = " + data.replace("Bank", "pc"));
		
	}//main End
}//class End
