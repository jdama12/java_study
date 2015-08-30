package it.bank.day09;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[ ] city = new String[3];
		city[0]="서울"; city[1]="가산"; city[2]="로마";
		//배열을 관리하는 클래스 Arrays
		Arrays.sort(city);
		
		for(int i=0; i<3; i++){
		  System.out.print(city[i] +"\t");
		}System.out.println( );
		
		//city배열도 forEach=향샹된for
		for(String data : city){
		  System.out.print(data +"\t");
		}
		
		System.out.println( );
		int[ ] inum = { 33, 77, 12, 47, 5, 26 } ;
		//배열을 관리하는 클래스 Arrays
		Arrays.sort(inum); //자동으로 오름차순으로 소트
		for(int i=0; i<inum.length; i++){
		  System.out.print(inum[i] + "  " );
		}
		
		System.out.println( );
		//PDF6장 13페이지
		for(int temp: inum){ //속도가 빨라요
			System.out.print(temp + "  " );	
		}
		
	}//main end
}//class END
