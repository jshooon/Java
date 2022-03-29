/*
 파일이름 : NoOOP.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 04(금)
 프로그램 설명 : NoOOP 대한 실습 내용.
 */
package exam01;

public class NoOOP {
	public static void main(String[] args) {
		int hongKilDong_Quiz1 = 85, hongKilDong_MidTerm = 80, hongKilDong_Quiz2 = 90, hongKilDong_FinalTerm = 95;
		int KangKamChan_Quiz1 = 75, KangKamChan_MidTerm = 60, KangKamChan_Quiz2 = 80, KangKamChan_FinalTerm = 100;
		int LeeSunShin_Quiz1 = 95, LeeSunShin_MidTerm = 90, LeeSunShin = 85, LeeSunShin_FinalTerm = 80;
		int YouKanSun_Quiz1 = 75, YouKanSun_MidTerm = 90, YouKanSun_Quiz2 = 95, YouKanSun_FinalTerm = 100;
		int AnJungKun_Quiz1 = 85, AnJungKun_MidTerm = 80, AnJungKun_Quiz2 = 85, AnJungKun_FinalTerm = 80;
		
		int hongKilDong_Total = Sum(hongKilDong_Quiz1, hongKilDong_MidTerm, hongKilDong_Quiz2, hongKilDong_FinalTerm); 
		int KangKamChan_Total = Sum(KangKamChan_Quiz1, KangKamChan_MidTerm, KangKamChan_Quiz2, KangKamChan_FinalTerm); 
		int LeeSunShin_Total = Sum(LeeSunShin_Quiz1, LeeSunShin_MidTerm, LeeSunShin, LeeSunShin_FinalTerm); 
		int YouKanSun_Total = Sum(YouKanSun_Quiz1, YouKanSun_MidTerm, YouKanSun_Quiz2, YouKanSun_FinalTerm); 
		int AnJungKun_Total = Sum(AnJungKun_Quiz1, AnJungKun_MidTerm, AnJungKun_Quiz2, AnJungKun_FinalTerm); 
		
		int hongKilDong_average = average(hongKilDong_Total);
		int KangKamChan_average = average(KangKamChan_Total);
		int LeeSunShin_average = average(LeeSunShin_Total);
		int YouKanSun_average = average(YouKanSun_Total);
		int AnJungKun_average = average(AnJungKun_Total);
		
		System.out.println();
	}
	
	public static int Sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}
	
	public static int average(int t) {
		return t / 4;
	}
	
	public static void rank() {
		
		
	}
	
}
