/*
 파일이름 : IntroArrayList.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(ArrayList) 사용법에 대한 실습 내용.
 */
package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroArrayList {
	public static void main(String[] args) {
		/*
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3 = new Integer(30);
		
		Integer[] num = new Integer[3];
		num[0] = new Integer(10);
		num[2] = new Integer(20);
		num[3] = new Integer(30);
		*/
		// 4버전까지는 Generic이 적용 되지 않았기 때문에 꺽쇠갈호를 사용하지않아도되었다.
		// 그 이후버전에서도 호환이 되어 작성하지 않아도 에러가 나지 않는다.
		// 8버전 이후에는 인스턴스에는 자료형을 작성하지 않아도 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		// 데이터(instance-참조변수) 저장 방법.
		// add메소드를 사용하여 생성된 참조자료형-참조변수를 저장할 수 있다.
		// 그전까지는 인스턴스를 참조변수통하여 프로그래머가 관리했지만
		// list.add 메소드를 사용하여 list가 관리하게 된다. 따라서 프로그래머는 저장만 하면 된다.
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
		// AutoBoxing에 의하여 아래와 같이 사용가능하다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		
		//데이터 참조
		// list는 몇개의 데이터가 저장 되어있는지 size메소드로 알 수 있다.
		for(int i = 0; i < list.size(); i++) {
		// list는 호출하려면 get메소드로 index와같은 저장값을 불러올 수 있다.
			System.out.println(list.get(i));
		}
		
		System.out.println("===============");
		// 저장되있는 데이터를 검색하고 메모리에 다시저장한다.
		// 그리고 그 시작 주소값을 반환한다.
		Iterator<Integer> itr = list.iterator();
		// 데이터가 있으면 true를 반환한다.
		while(itr.hasNext()) {
			System.out.println(itr.next());//next메소드는 데이터를 리턴하는메소드
		}
		
		System.out.println("===============");
		
		for(Integer e : list) {
			System.out.println(e);
		}

	}
}
