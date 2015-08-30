package it.bank.day08;

import java.util.Scanner;

public class Last {
	public static void main(String[] args) {		
		String name = "서현호";
		int age = 1;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("이름입력?   ");
		name = stdin.nextLine();//enter앞까지 인식
		System.out.print("이름 = " + name);
		
		System.out.println();
		System.out.println();
		
		System.out.print("나이입력?   ");
		age = stdin.nextInt();
		System.out.print("나이 = " + age);
		stdin.close(); //기술안해도 에러 없음
		
	}//main END
}//class END
