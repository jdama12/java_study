package it.bank.day30;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Note extends Frame {
	private TextArea ta = new TextArea();//여러라인
	
	private Font font = new Font("궁서체", Font.BOLD, 34);
	
	public Note() {
		this.setTitle("초미니 메모장 만들기");
		this.setBackground(Color.GREEN);
		this.setBounds(200, 200, 400, 500);
		this.add(ta);
		ta.setFont(font);
		this.setVisible(true);
		
		//MyExit me = new MyExit();
		this.addWindowListener(
			new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("MyExit.java 윈도우 종료");
					System.exit(1);
				}
			}
		);
	}//기본생성자 end
		
	public static void main(String[] args) {
		Note pad = new Note();
	}//main End
	
//	public class MyExit extends WindowAdapter{
//		//오른쪽 버튼 => source => Override/implement Method..
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.out.println("MyExit.java 윈도우 종료");
//			System.exit(1);//진짜종료
//		}//end
//	}//내부클래스 End
	
}//class End
