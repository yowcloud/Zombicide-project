package game;
import java.util.ArrayList;

import players.Player;
import zombie.Zombie;

public class Game {
	private ArrayList<Player> playersSelects;
	private ArrayList<Zombie> enemiZombie;
	private int level = 0;
	private int numberRound = 0;
	
	public Game(ArrayList<Player> playerSelects) {
		setEnemiZombies(new ArrayList<Zombie>());
		setPlayersSelects(new ArrayList<Player>());
		playersSelects.addAll(playerSelects);
	}
	
	public void setEnemiZombies(ArrayList<Zombie> arrayList)
	{
		this.enemiZombie = new ArrayList<Zombie>();
	}
	
	public void setPlayersSelects(ArrayList<Player> playersSelects)
	{
		this.playersSelects = new ArrayList<Player>();
	}
}
