package pl.kurs;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class LeagueGamesTableModel extends AbstractTableModel{
	
	/**
	 * ClubDAO jest wstrzykiwane
	 */
	LeagueGames clubDAO;
	public void setCars(List<Club> club) {this.club = club;}

	/**
	 * Lokalnie przechowywana lista obiektów.
	 * Co jakis czas synchronizowana z baz¹.
	 */
	
	List<Club> club = new ArrayList<Club>();
	
	/**
	 * Inicjalizacja lokalnej listy obiektów
	 */
	
	public void init() {
		club = clubDAO.get();
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return club.get(rowIndex).getId();
		case 1: return club.get(rowIndex).getClubName();
		case 2: return club.get(rowIndex).getNationality();
		case 3: return club.get(rowIndex).getMake();
		case 4: return club.get(rowIndex).getDateCreateClub("nothing");		
		}
		return null;
	}

}
