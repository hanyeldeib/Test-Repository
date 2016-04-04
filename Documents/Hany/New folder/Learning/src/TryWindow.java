
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TryWindow {

	public static void createWindow() {
		JFrame aWindow = new JFrame("This is a Window Title");
		int windowWidth = 400;
		int windowHeight = 150;
		aWindow.setBounds(50,100,                windowWidth, windowHeight        
				                   );             
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		aWindow.setVisible(true);
	}
		
		public static void main(String[] args) {
			
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createWindow();
				
			}
		}
	);
		// TODO Auto-generated method stub

	}

}
