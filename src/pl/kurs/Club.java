package pl.kurs;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Club implements Serializable {
	
	private String clubName;
	private String nationality;
	
	private GregorianCalendar dateCreateClub;
	private int year;
	private int month;
	private int day;
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public GregorianCalendar getDateCreateClub() {
		return dateCreateClub;
	}
	
	/**
	 * Return year-month-day
	 * @param value you can add anything what you want it is does not matter
	 * @return Return year-month-day
	 */
	public String getDateCreateClub(String value) {
		String year = String.valueOf(dateCreateClub.get(dateCreateClub.YEAR));
		String month = String.valueOf(dateCreateClub.get(dateCreateClub.MONTH));
		String day = String.valueOf(dateCreateClub.get(dateCreateClub.DAY_OF_MONTH));
		return year + "-" + month + "-" + day;
	}
	
	public void setDateCreateClub(GregorianCalendar dateCreateClub) {
		this.dateCreateClub = dateCreateClub;
	}
	
	/**
	 *  
	 * @param _year
	 * @param _month moth can be between 1 and 12
	 * @param _day day can be between 1 and 31
	 * else one of param wrong dateCreateClub = 1970-1-1
	 */
	public void setDateCreateClub(int _year, int _month, int _day) {
		if( ( _month >= 1 && _month <= 12) && ( _day >=1 && _day <= 31 ) ){
			this.dateCreateClub = new GregorianCalendar(_year, _month, _day);
		}else{
			//wrong one of param(month, day)
			this.dateCreateClub = new GregorianCalendar( 1970, 1, 1);
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
			this.year =	year;
	}
	
	public int getMonth() {
		return month;
	}
	
	/**
	 * Month can be between 1 and 12 value
	 * else the dateCreateClub = 1970-1-1
	 * @param month
	 */
	public void setMonth(int month) {
		if(month >= 1 && month <= 12){
			this.month = month;
		}else{
			//month wrong param
			this.dateCreateClub = new GregorianCalendar(1970, 1, 1);
		}
	}
	
	public int getDay() {
		return day;
	}
	
	/**
	 * day can be between 1 and 31
	 * else dateCreateClub = 1970-1-1
	 * @param day
	 */
	public void setDay(int day) {
		if( day >= 1 && day <= 31){
			this.day = day;
		}else{
			//day wrong param
			this.dateCreateClub = new GregorianCalendar( 1970, 1, 1);
		}
	}
	
}
