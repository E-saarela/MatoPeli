import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MenuFrame extends JFrame {

	MenuFrame(){
		
		this.addMouseListener(new MouseInput());
		this.add(new Menu());
		this.setTitle("Snake");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
