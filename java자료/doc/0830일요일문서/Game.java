package it.bank.day30;

import java.awt.Frame;

public class Game implements Runnable {
	public static void main(String[] args) {
		//쓰레드에서는 run함수를 start( )메소드호출
		System.out.println("\n국어=90");
		System.out.println("영어=85");
		System.out.println("총점=175");
	}//main end 

	public void run() { //Non-static일반함수
		int su=0;
		while(true){
			su++;
			System.out.print( su + "\t");
			try{ Thread.sleep(1000); }catch(Exception ex){ }
			if(su%5==0){System.out.println(); }
		}//while end
	}//run end
}//class END



