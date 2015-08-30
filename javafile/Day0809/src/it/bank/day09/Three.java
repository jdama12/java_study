package it.bank.day09;

public class Three {
	public static void main(String[] args) {
		int kor = 90;//정수형 4Byte
		double avg = 78.9;//실수형 8Byte
		String data = "1200";//클래스
		
		int a = (int)avg;
		int b = Integer.parseInt(data);
		//java.lang패키지 Integer클래스
		//static키워드가 있는 함수는 클래스.메소드() 형식으로 사용가능
		
		System.out.println(b + 98);
		System.out.println(data + 98);
	}//main END
}//class END
