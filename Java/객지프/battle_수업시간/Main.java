import player.Player;
import view.GameWindow;

public class Main {

	public static void main(String[] args) {

		Player p1 = new Player("에이브릴", 1000, 100, "singer.png");
		Player p2 = new Player("적", 1000, 80, "monster_1.png");

		new GameWindow(p1, p2).setVisible(true);

	}

}
