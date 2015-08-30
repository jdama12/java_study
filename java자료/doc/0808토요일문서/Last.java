package it.bank.day08;

import java.util.Scanner;

public class Last {
	public static void main(String[] args) {
		String name="김영림"; 
		int age=1;
		Scanner  stdin = new Scanner(System.in);
		System.out.print("이름입력? ");
		name = stdin.nextLine(); //enter앞까지 인식
		System.out.print("나이입력? ");
		age = stdin.nextInt(); //int형
		
		System.out.println( );//enter기능
		System.out.println("이름=" + name );
		System.out.println("나이=" + age );
	}//main end
}//class END




