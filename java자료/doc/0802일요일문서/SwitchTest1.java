package it.bank.day02;

import java.util.Scanner;

//PDF문서 4장 28페이지 
public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner  stdin = new Scanner(System.in);
		System.out.print("월 입력? ");
		int month = stdin.nextInt();//int입력
		String MtoS="안내문"; 
		switch(month){
			case 12: 
			case 1:
			case 2:
				MtoS="추운겨울입니다"; break;
			case 3: 
			case 4:
			case 5:
				MtoS="따뜻한 봄날입니다"; break;
			case 6: 
			case 7:
			case 8:
				MtoS="더운 여름날입니다"; break;
			case 9: 
				MtoS="멋진 9월은 가을입니다"; break;
			case 10: 
				MtoS="아름다운 10월은 가을입니다"; break;
			case 11: 
				MtoS="낙엽의 11월은 가을입니다"; break;
			default:
				MtoS="1~12월 벗어난 계절입니다"; break;
		}//switch end
		System.out.println( MtoS);
	}//main end
}//class END



