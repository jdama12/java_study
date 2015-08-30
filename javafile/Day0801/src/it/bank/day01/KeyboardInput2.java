package it.bank.day01;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름, 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		
		String name = stdIn.next();//이름 문자열
		int i = stdIn.nextInt();//나이 정수형
		double d = stdIn.nextDouble();//몸무게 실수형

		System.out.println();//단순개행
		System.out.println(name + "씨의 나이는 " + i + " 세이고");
		System.out.println("몸무게는 " + d + "kg입니다.");
		
		stdIn.close();

	}//main end
}//class END
