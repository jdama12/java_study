package it.bank.day30;

public class Game implements Runnable{ 
	public static void main(String[] args) {
		/*int su = 0;
		//1~20까지 0.5 초단위  1~5 6~10 11~15 16~20
		while(true) {
			su++;
			System.out.print(su + "\t");
			try{Thread.sleep(500);}catch(Exception ex){}
			if(su%5 == 0) {System.out.println();}
			if(su == 20) break;//스타게임 일꾼
		}*/
		//쓰레드에서는 run함수를 start()메소드 호출
		Game gg = new Game();
		//gg.run();
		
		Thread tr = new Thread(gg);
		tr.start();
		
		System.out.println("\n국어 = 90");
		System.out.println("영어 = 90");
		System.out.println("총점 = 175");
 	}//main End
	
	public void run() {
		int su = 0;
		while(true){
			su ++;
			System.out.print(su + "\t");
			try{Thread.sleep(1000);}catch(Exception ex) {}
			if(su%5 == 0) {System.out.println();}
			if(su == 30) break;
		}
		
	}
}//class End
