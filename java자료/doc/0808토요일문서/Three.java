package it.bank.day08;

public class Three {
	public static void main(String[] args) {
		int[] su = {78, 36, 27} ;
		//su[0]=78;  su[1]=36;  su[2]=27;
		//배열은 같은타입, 크기고정, 배열의 크기는 length
		for(int i=0; i<su.length; i++){
			System.out.print( su[i] + "\t" );
		}System.out.println(); //Enter기능
		
		String[ ] city= new String[3];
		city[0]="시청";  city[1]="수원"; city[2]="안양";  
		for(int i=0; i<city.length; i++){
			System.out.print( city[i] + "\t" );
		}
	}//main end
}//class END


