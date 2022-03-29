/*
 파일이름 : IntanceOf.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(IntanceOf)에 대한 실습 내용.
 */
package exam06;

class Box{
	public void simpleWrap(){ 
		System.out.println("simple wrap"); 
	}
}

class PaperBox extends Box{
	public void paperWrap() { 
		System.out.println("paper wrap"); 
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap(){ 
		System.out.println("gold wrap"); 
	}
}


public class IntanceOf {
	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
//	}						// Box box = box1;
//	public static void wrapBox(Box box) {  // 아래의 메소드와 동일.
//		box.simpleWrap();
//	}						// PaperBox box = box2;
//	public static void wrapBox(PaperBox box) { // 아래의 메소드와 동일.
//		box.paperWrap();
//	}						// GoldPaperBox box = box3;
//	public static void wrapBox(GoldPaperBox box) { // 아래의 메소드와 동일.
//		box.goldWrap();
//	}
		}						// Box box = box1;
								// Box box = box2;
								// Box box = box3;
		public static void wrapBox(Box box) {
			if(box instanceof GoldPaperBox) {
				// instanceof : 너 GoldPaperBox 알아 ? 라는 뜻.
				GoldPaperBox wrap = (GoldPaperBox)box; // 강제 자료형변환.
				
				wrap.simpleWrap();
				wrap.paperWrap();
				wrap.goldWrap();
			}else if(box instanceof PaperBox) {
				PaperBox wrap = (PaperBox)box; // 강제 자료형변환.
				
				wrap.simpleWrap();
				wrap.paperWrap();
			}else {
				box.simpleWrap();
			}

		}
}
