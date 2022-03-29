/*
파일 이름 : DoubleType.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : DoubleType에 대한 실습 내용.
*/
package exam03;

public class DoubleType {
	public static void main(String[] args) {
		double data1 = 3.14, data2 = 1.05;
		System.out.println(data1 - data2);
		
		data1 = 2.24;
		data2 = 1.22;
		System.out.println(data1 - data2);
		
		double e1 = 1.2e-3; // e표기법 1.2e-3 = 1.2 * 10^-3
		double e2 = 1.2e+3; // e표기법 1.2e+3 = 1.2 * 10^3
		
		System.out.println(e1);	//0.0012
		System.out.println(e2);	//1200.0
		
		
//		//if
//		
//		double valueOfSupply = 5000.0;
//		double vat = valueOfSupply * 0.1;
//		double total = valueOfSupply + vat;
//		double expense = valueOfSupply * 0.3;
//		double income = valueOfSupply - expense;
//		
//		double dividend1;
//		double dividend2;
//		double dividend3;
//				
//		if(valueOfSupply > 10000.0) {
//			dividend1 = (income) * 0.5;
//			dividend2 = (income) * 0.3;
//			dividend3 = (income) * 0.2;
//		} else {
//			dividend1 = (income) * 1;
//			dividend2 = (income) * 0;
//			dividend3 = (income) * 0;
//		}
//		
//		System.out.println("valueOfSupply : " + valueOfSupply );
//		System.out.println("vat : " + valueOfSupply * 0.1 );
//		System.out.println("total : " + total );
//		System.out.println("expense : " + valueOfSupply * 0.3 );
//		System.out.println("income : " + (income) );
//		System.out.println("dividend1 : " + dividend1);
//		System.out.println("dividend2 : " + dividend2);
//		System.out.println("dividend3 : " + dividend3);
		
	
		//Array
		
//		double ValueOfSupplyRate = 10000.0;
//		double valueOfSupply = ValueOfSupplyRate;
//		double VatRate = 0.1;
//		double vat = valueOfSupply * VatRate;
//		double total = valueOfSupply + vat;
//		double ExpenseRate = 0.3;
//		double expense = valueOfSupply * ExpenseRate;
//		double income = valueOfSupply - expense;
//		
//		double[] dividend = new double[3];
//		dividend[0] = income * 0.5;
//		dividend[1] = income * 0.3;
//		dividend[2] = income * 0.2;
//		
//		System.out.println("valueOfSupply : " + ValueOfSupplyRate );
//		System.out.println("vat : " + valueOfSupply * VatRate );
//		System.out.println("total : " + valueOfSupply + vat );
//		System.out.println("expense : " + valueOfSupply * ExpenseRate );
//		System.out.println("income : " + (valueOfSupply - expense) );
//		System.out.println("dividend : " + dividend[0] );
//		System.out.println("dividend : " + dividend[1] );
//		System.out.println("dividend : " + dividend[2] );
		
		
		
//		//ArrayLoop
//		
//		double valueOfSupply = 10000.0;
//		double vat = valueOfSupply * 0.1;
//		double total = valueOfSupply + vat;
//		double expense = valueOfSupply * 0.3;
//		double income = valueOfSupply - expense;
//
//		
//		double[]dividend = new double[3];
//		dividend[0] = (income) * 0.5;
//		dividend[1] = (income) * 0.3;
//		dividend[2] = (income) * 0.2;
//		
//		int i = 0;
//		while(i < dividend.length) {
//			dividend[0] = (income) * 0.5;
//			dividend[1] = (income) * 0.3;
//			dividend[2] = (income) * 0.2;
//			i = i + 1;
//		}
//		
//		System.out.println("valueOfSupply : " + 10000.0 );
//		System.out.println("vat : " + valueOfSupply * 0.1 );
//		System.out.println("total : " + valueOfSupply + vat );
//		System.out.println("expense : " + valueOfSupply * 0.3 );
//		System.out.println("income : " + (valueOfSupply - expense) );
//		System.out.println("dividend : " + (income * dividend[i]));
		
		
		
		
	
		
	}

}
