package data;

public class Ex76 {

	
	public static void main(String[] args) {
		
		//Ex76.java
		
		//OpenApi , Application Programming Interface
		//-공개된 프로그래밍 기능
		//-공공 데이터 포털
		//-구글,아마존,네이버,다음 > 지도
		
		//OpenApI> 데이터 확보 > 전부 진짜 데이터
		
		
		
		m1();
		
	}//main

	private static void m1() {
	
		//1. 요청 URL 만들기
		String ur1 =
		" http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		ur1 += "ServiceKey=ZSNxX195Y9hiJPTGDU9oSWsFVw0L6jVJJOlh%2BchIXkoUbGx6e3XxXm4ZdlyMnw6SxJUuQ%2BNUN%2B%2FTvwuAqb9qsw%3D%3D";
		
		
		ur1+="&_type=json"; //XML or JSON
		
		ur1 += "&numOfRows=10";
		
		ur1 += "&pageNo=1";
		
		ur1 += "&subwayStationName=잠실";
		
		System.out.println(ur1);
		
		//QueryString
		//http://apis.data.go.kr/SttnList?키=데이터&키=데이터
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
