/*
 파일이름 : UseCalendar.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.util.package(상속관계)사용법에 대한 실습 내용.
 */
package exam09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UseCalendar {
	public static void main(String[] args) {
		//	현재 날짜
		 Calendar today = Calendar.getInstance(); // 이미 생성된 인스턴스를 리턴받아 메소드에 주소값이 들어옴.
		 
		// 년, 월, 일 구하기		 
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;	// 월 정보만 1월일땐 0의값이 리턴이 되기때문에 +1을 붙여준다.
		int day = today.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		// 시, 분, 초 구하기
		int hour = today.get(Calendar.HOUR_OF_DAY); //0~23
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d시:%d분:%d초\n", hour, minute, second);
		
		// 요일 구하기
		String[] DAY_OF_WEEK = {"일","월","화","수","목","금","토"};
		int week = today.get(Calendar.DAY_OF_WEEK)-1; //인덱스 값은 0부터시작하기때문에 +1
		
		System.out.println("오늘은 " + DAY_OF_WEEK[week] + "요일 입니다.");
		
		// Date : 국제 표준시간
		Date now = new Date();	// 국제 표준시간
		
		System.out.println("현재 시간 : " + now.toString());
		
		// 종종 볼 수 있는 코드.
		now = today.getTime(); // Date 타입으로 변경. Date와 같다.
		
		System.out.println(now);
		
		// 원하는 형식으로 하고 싶을때 사용법. 중요!!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a");
		String date = sdf.format(now);
		
		System.out.println(date);
		
		// Calendar -> Date 변환.
		Date d1 = new Date(today.getTimeInMillis());// Date(long date)
		
		// Date -> Calendar 변환.
		Date d2 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}
}
