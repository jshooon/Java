package exam06;

import exam06.cal.Ex1;

public class Ex {

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		int result;
		result = ex1.addTwoNum(5, 4);
		System.out.println(result);
		result = ex1.subTwoNum(8, 5);
		System.out.println(result);
		
		ex1.ShowOperationTimes();
		
	}

}
