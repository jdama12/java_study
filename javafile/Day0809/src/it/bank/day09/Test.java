package it.bank.day09;

import java.util.Arrays;



public class Test {
	public static void main(String[] args) {
		String[] city = new String[3];
		city[0] = "서울"; city[1] = "가산";  city[2] = "로마";
		
		Arrays.sort(city);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(city[i] + "\t");
		}
		
		System.out.println();
		
		//forEach문
		for(String name : city) {
			System.out.print(name + "\t");
		}
		
		System.out.println();
		
		//PDF6장 13페이지
		int[] inum = {33, 77, 12, 4, 5, 26};
		
		// 배열을 관리하는 클래스 Arrays
		Arrays.sort(inum); // 자동으로 오름차순 sort
		
		for(int i = 0; i < inum.length; i++) {
			System.out.print(inum[i] + "\t");
		}
		
		System.out.println();
		
		//forEach문
		for(int num : inum) {
			System.out.print(num + "\t");
		}
	}//main END
}//class END
