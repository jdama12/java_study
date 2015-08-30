package it.bank.day01;

public class Three {
	public static void main(String[] args) {
		int kor=90, eng=85, sum=0;
		double avg=0.0; // 8Byte 실수 => 소수점
		String msg="메세지";
		
		sum=kor+eng;
		avg=(double)sum/2;
		//평균점수 90점부터는 합격 및 보너스 지급
		//60점 합격, 59~0 재시험
		
		if(avg >= 90) {
			msg = "합격 및 보너스 지급";			
		}else if(avg >= 60) {
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
