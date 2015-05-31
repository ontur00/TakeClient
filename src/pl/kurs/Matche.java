package pl.kurs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Matche implements Serializable{
	
	private int id;							//identyfikator meczu
	private String result;			//wynik meczu
	private Goals goals;			//od jakiego gracza pochodza bramki ?
	private Club  host;				//gospodarz spotkania
	private Club  guest;			//goœæ spotkania
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public Goals getGoals() {
		return goals;
	}
	
	public void setGoals(Goals goals) {
		this.goals = goals;
	}
	
	public Club getHost() {
		return host;
	}
	
	public void setHost(Club host) {
		this.host = host;
	}
	
	public Club getGuest() {
		return guest;
	}
	
	public void setGuest(Club guest) {
		this.guest = guest;
	}	
	
}
