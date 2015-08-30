package it.bank.day23;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args){
		File file = null ;
		PrintWriter pw = null;
		String path="C:\\Mtest\\my0230\\LG";
		Scanner  stdin = new Scanner(System.in);
		
	int dan=1;
	try{
		file = new File(path);
		file.mkdir();
		System.out.println( path  +" 경로생성");
		
		pw = new  PrintWriter(path +"\\gugudan.txt");
		
		System.out.print("구구단 입력? ");
		dan = stdin.nextInt();
		for(int i=1; i<10; i++){
		  System.out.println(dan+"*"+i+"="+(dan*i));
		  pw.println(dan+"*"+i+"="+(dan*i));//파일로저장
		}//for end
		System.out.println("gugudan.txt 저장성공");
		pw.close();//이것안하면 저장안됩니다.
		stdin.close( ); //생략가능해요
	}catch(Exception ex){
		System.out.println("gugudan.txt 저장실패");
	}
		
	}//end 
}//class END
