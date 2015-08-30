package it.bank.day29;

import java.util.Scanner;

public class Game  extends Thread {
	public static void main(String[] args) {
		Game gg = new Game( );
		gg.start();
		
		System.out.println("\n2초를 기다리세요" );
		try{Thread.sleep(2000);}catch(Exception e){ }
		   Scanner  stdin = new Scanner(System.in);
		   int dan=1;
		   System.out.print("\n구구단 입력? ");
		   dan=stdin.nextInt();
		 
		   for(int i=1; i<10; i++){
			 System.out.println(dan+"*"+i+"="+(dan*i));
		   }
		   
		System.out.println("\n아래문서내용출력" );
		System.out.println("국어=90");
		System.out.println("영어=85");
		System.out.println("총점=175");
	}//main end
	
	public void run( ){//start함수로 호출 
		int su=0;
		while(true){
	   	  su++;
		  System.out.print(su  + "\t"); 
		  try{Thread.sleep(500);}catch(Exception e){ }
		  if(su%5==0) { System.out.println(); }
		}//while end	
	}//run end
}//class END





