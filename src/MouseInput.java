import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MouseInput extends JFrame implements MouseListener {
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		/*
		public Rectangle playButton = new Rectangle(SCREEN_WIDTH / 4 + 120, 150, 100,50);
		public Rectangle stats = new Rectangle(SCREEN_WIDTH / 4 + 120, 250, 100,50);
		public Rectangle quitButton = new Rectangle(SCREEN_WIDTH / 4 + 120, 350, 100,50);
		 */
		
		//play button
		if(mx >= SCREEN_WIDTH / 5 + 120) {
			if(my >= 150 && my <= 250) {
				new GameFrame();
			}
		}
		
		//quit button
				if(mx >= SCREEN_WIDTH / 5 + 120) {
					if(my >= 350 && my <= 450) {
						System.exit(1);
					}
				}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
