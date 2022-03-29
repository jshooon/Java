package exam06.cal;

public class Ex1 {
	private Bdder adder;
	private Sub sub;
	
	public Ex1(){
		adder = new Bdder();
		sub = new Sub();
	}
	
	public int addTwoNum(int n1, int n2) {
		int result = 0;
		result = adder.Add(n1, n2);
		return result;
	}
	public int subTwoNum(int n1, int n2) {
		int result = 0;
		result = sub.Sub(n1, n2);
		return result;
	}
	public void ShowOperationTimes() {
		adder.getAddCnt();
		sub.getSubCnt();
	}
	
}

class Bdder{
	int AddCnt;
	
	Bdder(){
		AddCnt = 0;
	}
	
	public int Add(int n1, int n2) {
		return n1 + n2; 
	}
	
	public int getAddCnt() {
		return AddCnt;
	}
}
class Sub{
	int SubCnt;
	
	Sub(){
		this.SubCnt = 0;
	}
	
	public int Sub(int n1, int n2) {
		SubCnt++;
		return n1 - n2; 
	}
	public int getSubCnt() {
		return SubCnt;
	}
}