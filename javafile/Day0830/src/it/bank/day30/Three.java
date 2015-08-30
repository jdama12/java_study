package it.bank.day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Three{ 
	public static void main(String[] args) {
		int[] su = new int[3];
		su[0] = 78; su[1] = 57; su[2] = 48;
		
		//for 반복문 출력
		for(int i = 0; i < 3; i++) {
			System.out.print(su[i] + " ");			
		}
		System.out.println("\n");
		for(int i : su){
			System.out.print(i + " ");		
		}
		//for End
		System.out.println("\n");
		
		//WindowListener인터페이스 = > WindowAdapter
		//List인터페이스 => Vector, ArrayList
//		List list = new ArrayList();
//		list.add("sky"); list.add(27); list.add(true);
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}		
//		System.out.println("\n");
//		
//		Iterator it = list.iterator();
//		while(it.hasNext() == true) {
//			System.out.print(it.next() + " ");
//		}
		
		List<String> list = new ArrayList<String>();
		list.add("sky"); list.add("27"); list.add("true");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}		
		System.out.println("\n");
		
		Iterator it = list.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + " ");
		}
		
 	}//main End
}//class End
