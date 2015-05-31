package pl.kurs;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player implements Serializable{
	
	private String firstName;		//imie
	private String lastName;		//nazwisko
	private String position;		//pozycja(napastnik,obronca itd)
	private String currentClub;		//obecny klub
	private String previousClub;	//wczesniejszy klub
	
	@XmlAttribute
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getCurrentClub() {
		return currentClub;
	}

	public void setCurrentClub(String currentClub) {
		this.currentClub = currentClub;
	}

	public String getPreviousClub() {
		return previousClub;
	}

	public void setPreviousClub(String previousClub) {
		this.previousClub = previousClub;
	}
	
}
