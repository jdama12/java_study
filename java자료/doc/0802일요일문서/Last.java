package it.bank.day02;

public class Last {
	public static void main(String[] args) {
		int kor=100,eng=100,sum=0;
		double avg=0.0;
		String ret="메세지" ;
		char grade='F';
		
		sum=kor+eng;
		avg=(double)sum/2.0;
		//switch(double형에러){ case 값: 기술; break; }   
		switch((int)avg/10){ //8, 8, 8, 8, 8
			case 10:  
			case 9:   grade='A'; break;
			case 8:   grade='B'; break;
			case 7:   grade='C'; break;
			case 6:   grade='D'; break;
			default:   grade='F'; break;
		}
		
	    System.out.println("총점=" + sum);
	    System.out.println("평균=" + avg);
	    System.out.println("학점=" + grade);
	}//main end
}//class END









