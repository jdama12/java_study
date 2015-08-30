package it.bank.day30;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Note extends Frame {
	private  TextArea  ta = new TextArea( ); //여러라인
	private  Font  font = new Font("궁서체", Font.BOLD, 34);     
	
	public Note( ){
		ta.setFont(font);
		this.add(ta);
		
		this.setTitle( "초미니메모장만들기" );
		this.setBackground(Color.GREEN);
		this.setBounds(200, 200, 400, 550);
		this.setVisible( true  );
		
		MyExit me = new MyExit( );
		this.addWindowListener( me );
	}//기본생성자end
	
	public static void main(String[] args) {
		 Note  pad = new Note( );
	}//end 
	
	public class MyExit extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("MyExit.java 윈도우종류");
			System.exit(1);//진짜종료
		}//end
	}//내부클래스 end==========================

}//Noteclass END=============================




