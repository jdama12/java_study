package it.bank.day02;

import java.util.Scanner;

//PDF문서 4장 28페이지
public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("월 입력 ? ");
		
		int month = stdin.nextInt();//int 입력
		String MtoS;
		
		//switch Start
		switch(month) {
			case 12 :
			case 1 : 
			case 2 : MtoS = "추운 겨울입니다."; break;
			case 3 :
			case 4 :
			case 5 : MtoS = "따뜻한 봄입니다."; break;
			case 6 :
			case 7 :
			case 8 : MtoS = "더운 여름입니다."; break;
			case 9 :  MtoS = "멋진 9월은 가을입니다."; break; //System.out.print("멋진 9월과");
			case 10 : MtoS = "아름다운 10월은 가을입니다."; break; //System.out.print("아름다운 10월과");
			case 11 : MtoS = "납엽의 11월은 가을입니다."; break; //MtoS = "가을입니다."; System.out.print("납엽의 11월은 "); break;
			default : MtoS = "1~12월을 벗어난 달입니다."; break; 
		}
		//switch End
		
		System.out.println(MtoS);
		
	}//main END
}//class END
