import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	
	public Rectangle playButton = new Rectangle(SCREEN_WIDTH / 5 + 120, 150, 100,50);
	public Rectangle stats = new Rectangle(SCREEN_WIDTH / 5 + 120, 250, 100,50);
	public Rectangle quitButton = new Rectangle(SCREEN_WIDTH / 5 + 120, 350, 100,50);
	
	public Menu() {
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Snake", SCREEN_WIDTH/3, 100);
		
		Font fnt1 = new Font("arial", Font.BOLD, 30);
		g.setFont(fnt1);
		g.drawString("Play", playButton.x + 19, playButton.y + 35);
		g2d.draw(playButton);
		g.drawString("Stats", stats.x + 19, stats.y + 35);
		g2d.draw(stats);
		g.drawString("Quit", quitButton.x + 19, quitButton.y + 35);
		g2d.draw(quitButton);

		
	}


}
