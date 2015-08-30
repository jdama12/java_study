package it.bank.day29;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	  //File, PrintWriter=> java.io팩키지
	 try{
	   String path="C:\\Mtest\\my0230\\LG";
	   File file=new File( path );
	   file.mkdir();
	   System.out.println( path  +" 성공성공");
	   
	   PrintWriter pw=null; //JSP2서블릿 out.println("<h2>~~
	   pw = new PrintWriter( path +"\\gugudan.txt");
	   
	   Scanner  stdin = new Scanner(System.in);
	   int dan=1;
	   System.out.print("\n구구단 입력? ");
	   dan=stdin.nextInt();
	   
	   for(int i=1; i<10; i++){
		 System.out.println(dan+"*"+i+"="+(dan*i));
		 pw.println(dan+"*"+i+"="+(dan*i));
	   }
	   
	   pw.close();
	   System.out.println("\ngugudan저장처리 성공성공");
	   stdin.close();
	 }catch(Exception ex){ }
	 
	}//end
}//class END







