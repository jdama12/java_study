package it.bank.day22;

public class First  implements  Game {
  public static void main(String[ ] args ){
	  //First클래스 new연산자로 개체생성 안함
	  First.move( );
	  First.move("시청");
	  First.move("시청역", 20);
  }//end
  
  public static void move( ){ }
  public static void move(String subway){ }
  public static void move(String subway, int m){ }

	@Override
	public void android() {	}//end
	public int price() {return 0;}//end
	public String book() {	return null;	}//end
}//class END
