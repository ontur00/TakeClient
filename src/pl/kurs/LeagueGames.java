package pl.kurs;

import java.util.List;

public interface LeagueGames {
	
	public abstract void create(Club club);

	public abstract Club find(int idc);

	public abstract List<Club> get();

	public abstract void update(Club club);

	public abstract void delete(int idc);
}
