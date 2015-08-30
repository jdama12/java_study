package it.bank.day01;

public class Three {
	public static void main(String[] args) {
		int kor=90, eng=85, sum=0;
		double avg=0.0;  //8Byte=>소수점이 있는 실수
		String msg ="메세지";
		
		sum=kor+eng;
		avg=(double)sum/2;

		if(avg >= 90){msg="합격및보너스지급되셨습니다"; }   
		else if( avg >= 60 ){msg="합격되셨습니다"; }
		else{ msg="재시험을 보셔야 합니다"; }
		
		System.out.println("국어=" + kor );
		System.out.println("영어=" + eng );
		System.out.println("총점=" + sum );
		System.out.println("평균=" + avg );
		System.out.println(  msg );
	}//main end
}//class END




