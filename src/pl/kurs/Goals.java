package pl.kurs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Goals implements Serializable{
	
								//TO DO 	narazie nie zastanawialem sie nad struktura tej klasy
	int id;						//identyfikator
	int count;					//ile bramek posiada gracz
	Player player;				//identyfikacja gracza
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}	
	
		
}
