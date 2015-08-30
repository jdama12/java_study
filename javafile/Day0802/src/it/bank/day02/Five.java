package it.bank.day02;

public class Five {
	public static void main(String[] args) {
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String ret = "메세지";
		
		sum = kor + eng;
		avg = (double)sum/2.0;
		
		//if 제어문 평균 70점부터 합격 , 0 ~ 69재시험
		if(avg >= 70){
			ret = "pass";
		}else{
			ret = "No pass";
		}
		System.out.println("당신은 " + ret);
		
		//삼항연산
		String msg = (avg >= 70 ) ? "합격" : "재시험";
		System.out.println("당신은 " + msg);
		
	}//main END
}//class END
