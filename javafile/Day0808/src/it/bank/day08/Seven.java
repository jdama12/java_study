package it.bank.day08;

public class Seven {
	public static void main(String[] args) {
		Seven info = new Seven();
		info.note();
	}//main END
	
	//book Start
	public String book() {
		String  title = "몽블랑";
		return title;
	}
	//book End
	
	//price Start
	public int price() {
		int m = 23000;
		return m;
	}
	//price End
	
	//save Start
	public double save() {
		double point = 34.5;
		return point;
	}
	//save End
	
	//note Start
	public void note() { // main함수 호출
		String title = book();
		int m = price();
		System.out.println("제목 = " + title);
		System.out.println("가격 = " + m);
		System.out.println("제목 = " + book());
		System.out.println("가격 = " + price());
	}
	//note End
	
}//class END
