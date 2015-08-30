package it.bank.day01;

public class Seven {
	public static void main(String[] args) {
		int kor=90;
		int eng=85;
		int sum=0;
		double avg=0.0; // 8Byte 실수 => 소수점
		String msg="메세지";
		
		sum=kor+eng;
		avg=(double)sum/2;
		//100~70점까지 합격
		//0~69점까지는 재시험
		
		if(avg >= 70){
			msg = "합격";			
		}else{
			msg = "재시험";			
		}
		
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);
		System.out.println(msg);
		
	}//main end
}//class END
