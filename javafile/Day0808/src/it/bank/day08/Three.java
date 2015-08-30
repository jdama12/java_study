package it.bank.day08;

public class Three {
	public static void main(String[] args) {
		//int[] su = {78, 36, 27};
		
		int[] su = new int[3];//크기 설정해줘야 한다.
		su[0] = 78; su[1] = 36; su[2] = 27;
		//배열은 같은 타입, 크리고정, 배열의 크기는 length
		for(int i = 0; i < su.length; i++) {
			System.out.print(su[i] + "         ");
		}
		
		System.out.println("\n");//단순 개행
		
		//String[] city = {"시청", "수원", "안양"};//첫번째 방법
		
		String[] city = new String[3];//크기 설정해줘야 한다.
		city[0] = "시청"; city[1] = "수원"; city[2] = "안양";//두번째방법
		
		for(int i = 0; i < city.length; i++) {
			System.out.print(city[i] + "         ");
		}
		
		System.out.println("\n");
		
		
	}//main END
}//class END
