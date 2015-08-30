package it.bank.day22;

public class My implements Game  {
  public static void main(String[ ] args ){
	  My kb = new My( );
	  kb.bank("국민은행");
	  kb.bank("국민은행", 7.8);
	  kb.bank("국민은행", 7.8, "종각역지점");
  }//end
  
  //PDF10장  20페이지 => OverLoading& OverRiding(재정의)
  //메소드=함수이름동일=OverLoading=함수의중복
  public void bank( String name){ }
  public void bank( String name,double rate){ }
  public void bank( String name,double r,String pos){ }

	@Override
	public void android() {  }
	public int price() { return 0;	}

	@Override
	public String book() {	return null;	}//end
}//class END


