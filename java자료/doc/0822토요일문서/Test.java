package it.bank.day22;

import java.util.Scanner; //클래스의 구성요소가 아니다

public class Test{
  public static void main(String[ ] args ){
	  	//도스=DOS=콘솔창에서  Hello.java문서를 컴파일
	    //javac.exe  Hello.java =>컴파일
	    //java.exe   Hello  =>실행
	  
	  System.out.println("1" + "1"); //문자열 11
	  System.out.println('1' + '1');  //98
	  //'A' => 아스키코드65  a=>97, 0=>48  1=>49
	  
	  String data="1200"; //String은 클래스
	  double avg=78.9; //8Byte
	  int a=(int)avg;
	  int b=Integer.parseInt(data);
	  
	  if( avg >= 90){ }
	  else if( avg >= 80){ }
	  else if( avg >= 70){ }
	  else if( avg >= 60){ }
	  else { }  //else에는 조건기술하면 에러발생
	  
	  switch((int)avg){
	   //switch조건문에서 실수형에러발생=>변수의자료형결정됨
	  }
	  Scanner stdin = null ;
	  
	  //메소드내부안에는 메소드기술하면 에러가발생 
  }//main end
}//class END








