/*
 파일이름 : ReferenceVariableUse.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(Overriding)에 대한 실습 내용.
 */
package exam05;

class Computer{
	Computer(){}
}

class Notebook extends Computer{
	Notebook(){}
}

class TabletPC extends Notebook{
	TabletPC(){}
}

public class ReferenceVariableUse {
	public static void main(String[] args) {
		Computer cpt1 = new Notebook();
		Computer cpt2 = new TabletPC();
		Notebook cpt3 = new TabletPC();
//		TabletPC cpt4 = new Notebook();	// error
		
		TabletPC cpt5 = new TabletPC();		// 다형성
		TabletPC cpt6 = cpt5;				// 다형성
		Notebook cpt7 = cpt6;				// 다형성
		Computer cpt8 = cpt6;				// 다형성
		
		Computer cpt9 = new TabletPC();
//		Notebook cpt10 = cpt9;				// 자식이 부모를 바라볼 순 없다.
//		TabletPC cpt11 = cpt9;				// 자식이 부모를 바라볼 순 없다.
	}
}
