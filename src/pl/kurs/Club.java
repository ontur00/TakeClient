package pl.kurs;

import java.io.Serializable;
import java.util.GregorianCalendar;



import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Club implements Serializable {
	
	private int id;									//id klubu
	private String clubName;						//nazwa klubu
	private String nationality;						//narodowosc
	
	private GregorianCalendar dateCreateClub;		//data utworzenia klubu
	private int year;								//rok
	private int month;								//miesiac
	private int day;								//dzien
	

	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
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
		//Parse all date to simple format at String
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
