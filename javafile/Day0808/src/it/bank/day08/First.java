package it.bank.day08;

public class First {
	public static void main(String[] args) {//static 정적함수
		//main 함수에서 star()메소드 호출;
		First firstObj = new First();//클래스를 객체로 변환시키는거 같음....?
		firstObj.star(5);
		
		//Seven 클래스 메소드 호출
		Seven noteInfoCall = new Seven();
		noteInfoCall.note();
				
		System.out.println(firstObj.globalAge);
	}//main END
	
	int globalAge = 32;
	
	// star Start
	public void star(int repeatNum) {//Non-static 일반함수
		//이중 for  반복문
		for(int i = 1; i < repeatNum; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("★");
			}	
			System.out.println();
		}				
	}
	// star End
	
	//nemo Start
	public static void nemo() {//정적함수
		//static 키워드가 있으면 클래스 이름.메소드()
		System.out.println();
		
		for(int i = 0; i <=3; i++) {
			System.out.println("####");
		}
	}
	//nemo End
	
}//class END
