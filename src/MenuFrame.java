import javax.swing.JFrame;

public class MenuFrame extends JFrame {

	MenuFrame(){
		
		this.add(new Menu());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
