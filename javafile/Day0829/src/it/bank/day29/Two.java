package it.bank.day29;

public class Two {
  public static void main(String[] args) {
	String msg="안내문";
	String jumin="841224-1528913"; 
	//문제1  char  charAt(숫자) =>당신은 남자입니다
	char gender = jumin.charAt(7);
	if(gender=='1'){ msg="당신은 남자입니다"; }
	else if(gender=='2'){ msg="당신은 남자입니다"; }
	else { msg="성별확인 하시기 바랍니다"; }
	System.out.println(msg);
	
	//문제2  String  substring(시작, 끝+1)
	String m = jumin.substring(2, 4);
	String d = jumin.substring(4, 6);
	System.out.println(m+"월 " + d +"일 생일입니다" );
	
	String ju1 = "84124"; //6자릿수
	String ju2 = "15289136"; //7자릿수
	int size1 = ju1.length();
	int size2 = ju2.length();
	if(size1 !=6 || size2 != 7){
	 System.out.println("주번 자릿수가 틀렸습니다");
	}
	
	System.out.println();
	String data="HSBbankTest";
	System.out.println(data.toLowerCase());//소문자
	System.out.println(data.toUpperCase());//대문자
	System.out.println(data.replace("bank", "my"));
  }//main end
}//Twoclass END





