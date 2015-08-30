package it.bank.day09;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int dan;
		Scanner stdin = new Scanner(System.in);
		String msg = "출력할 단을 입력하세요 - ";
		
		System.out.print(msg);
		try{
			dan = stdin.nextInt();
		}catch(Exception ex){dan = 2;}
		System.out.print("\n");
		
		for(int k = 1; k < 10; k++) {
			System.out.println(dan + " * " + k + " = " + dan*k );
			if(k == 5) break;
		}
		
		stdin.close();
		
		
		System.out.println();
		System.out.println("국어 = 90");
		System.out.println("영어 = 85");
		System.out.println("총점 = 175");
		System.out.println("마지막 문장 = 영수증 역할");
	}//main END
}//class END
