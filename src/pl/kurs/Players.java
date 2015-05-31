package pl.kurs;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Players {
	
	private List<Player> players = new ArrayList<Player>();
	
	public Players(List<Player> players){
		super();
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}	
	
}
