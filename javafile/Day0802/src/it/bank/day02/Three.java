package it.bank.day02;

public class Three {
	public static void main(String[] args) {
		int a = 0;
		
		a = a + 1;
		System.out.print(a + " ");
		
		a = a++;
		System.out.print(a + " ");
		
		++a;
		System.out.print(a + " ");
		
		System.out.println();//enter 기능
		System.out.println("이름 : 서현호");
		System.out.println("\n //////////////////////////////////////////////////////////////////////// \n" );
		
		int dan = 5;
		
		for(int i=1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i) );
		}
		System.out.println("\n //////////////////////////////////////////////////////////////////////// \n" );		
		
		int danStart = 2, danEnd = 9;
		
		for(int i = danStart; i <= danEnd; i++) {
			for(int k = 1; k <= 9; k++) {
				System.out.println(i + " * " + k + " = " + (i *k) );		
				if(k == 9) {System.out.println("\n");}
			}
		}
		

	}//main END
}//class END
