package pl.kurs;

import java.util.GregorianCalendar;

public class OgolneTesty {
	
	public static void main(String[] args){
		
		//Wypelnianie GregorianCalendar
		GregorianCalendar todayTime = new GregorianCalendar();
		GregorianCalendar dateCreateClub = new GregorianCalendar(1990, 11, 15);
		
		System.out.println("Obecna data " + todayTime.DAY_OF_MONTH);
		
		String year = String.valueOf(dateCreateClub.get(dateCreateClub.YEAR));
		String month = String.valueOf(dateCreateClub.get(dateCreateClub.MONTH));
		String day = String.valueOf(dateCreateClub.get(dateCreateClub.DAY_OF_MONTH));
		
		//Wypisanie
		System.out.println(zwrocDate());
	}
	
	public static String zwrocDate(){
		GregorianCalendar dateCreateClub = new GregorianCalendar(1990, 11, 15);
				
		String year = String.valueOf(dateCreateClub.get(dateCreateClub.YEAR));
		String month = String.valueOf(dateCreateClub.get(dateCreateClub.MONTH));
		String day = String.valueOf(dateCreateClub.get(dateCreateClub.DAY_OF_MONTH));
		
		return year + "-" + month + "-" + day;
	}
}
