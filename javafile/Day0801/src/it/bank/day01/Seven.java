package it.bank.day01;

public class Seven {
	public static void main(String[] args) {
		int kor=90;
		int eng=85;
		int sum=0;
		double avg=0.0; // 8Byte �Ǽ� => �Ҽ���
		String msg="�޼���";
		
		sum=kor+eng;
		avg=(double)sum/2;
		//100~70������ �հ�
		//0~69�������� �����
		
		if(avg >= 70){
			msg = "�հ�";			
		}else{
			msg = "�����";			
		}
		
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
		System.out.println(msg);
		
	}//main end
}//class END