package it.bank.day01;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름,나이,몸무게 입력? ");
		String name = stdIn.next(); //문자열
		int i = stdIn.nextInt(); //나이이라서 정수
		double d = stdIn.nextDouble();//실수형태
		System.out.println( ); //단순라인개행=enter
		System.out.print(name+"님 " + i +"세 ");
		System.out.println( "몸무게는 " + d+"kg " );
		stdIn.close();
	}//main end
}//class END



