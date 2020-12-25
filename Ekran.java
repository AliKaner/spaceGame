import java.awt.HeadlessException;
import javax.swing.JFrame;
public class Ekran  extends JFrame{
	public Ekran (String  title) throws HeadlessException {
		super(title);
	}
	
	public static void main(String[] args) {
		
		Ekran gameScreen = new Ekran("Space Game");
		gameScreen.setResizable(false);
		gameScreen.setFocusable(false);
		gameScreen.setSize(800,600);
		gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game game = new Game();
		game.requestFocus();
		game.addKeyListener(game);
		game.setFocusable(true);
		game.setFocusTraversalKeysEnabled(false);
		gameScreen.add(game);
		gameScreen.setVisible(true);
	

	}
}
