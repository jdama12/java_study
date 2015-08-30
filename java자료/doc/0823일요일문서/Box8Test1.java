package it.bank.day23;

 class Box8{ 
	 int width;//필드=속성=멤버변수=전역변수=field
	 int height;
	 int depth;
	 public Box8(int width, int height, int depth){
		 this.width=width;
		 this.height=height;
		 this.depth=depth;
	 }//end
	 
	 public int volume( ){//계산만 처리
		 int vol=width*height*depth;
		 return vol;
	 }
 }//Box8 class END

public class Box8Test1 {
	public static void main(String[] args){
		Box8 mybox1 = new Box8(7,2,3);
		int data =  mybox1.volume();
		System.out.println("부피는 " + data);
	}//end 
}//Box8Test1 class END





