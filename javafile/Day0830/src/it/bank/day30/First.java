package it.bank.day30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class First {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1200");
		list.add("길동");
		list.add("true");
		//for문으로 출력
//		for(String temp : list){
//			System.out.println(temp);
//		}
		
		System.out.println();
		
		Iterator it = list.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		Map<Integer,  String> mp = new HashMap<Integer, String>();
		mp.put(1100, "aaa");
		mp.put(7700, "sk");
		mp.put(2200, "bbb");
		mp.put(3300, "ccc");
		//for문으로 출력
		for(int i = 0; i < mp.size(); i++){
			System.out.print(mp.get(i) + "\t");
		}
		System.out.println();
		
		//Set set = mp.keySet();
		Iterator tt = mp.keySet().iterator();
		while(tt.hasNext() == true) {
			int index = (int)tt.next();
			System.out.print(index + " : " + mp.get(index) + "    ");
		}
		
	}//main End
}//class End
