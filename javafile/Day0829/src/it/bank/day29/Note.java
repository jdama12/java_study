package it.bank.day29;

import java.awt.Frame;

public class Note extends Frame {
	 public Note( ){
		 	this.setTitle( "aa" ); //창제목
		 	this.setVisible( true );//진짜 창보여주는 명령어
	 }//기본생성자
			
	public static void main(String[] args) { 
		Note  pad = new  Note( );//익명의개체anonymous
		pad.bank( "국민은행");
	}//end
	
	public void bank(String kb){ }
	
	public String book( ){
		String title="몽블랑";
		return title;
	}//end
	
	public class MyExit{ 
		//MyExit.java 없어요
		//MyExit.class대신  Note$MyExit.class 생성됨
	}//MyExit내부클래스 end
	
}//Note Class END







