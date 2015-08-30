package it.bank.day09;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int dan=3;
		Scanner stdin = new Scanner(System.in);
		System.out.print("단 입력? ");
		try{
			dan = stdin.nextInt();//실행중에 에러이면 try~catch
		}catch(Exception ex){ }
		
		for(int i=1; i<10; i++){
		  System.out.println(dan+"*"+i+"="+(dan*i));
		  if(i==5)break;
		}
		stdin.close();//개체닫기
		
		System.out.println("국어=90");
		System.out.println("영어=85");
		System.out.println("총점=175");
		System.out.println("마지막문장=영수증역할");
	}//main end
}//class END
