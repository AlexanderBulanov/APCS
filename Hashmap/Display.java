//Adam Barszczak, Alexander Bulanov

import java.util.HashMap;
import javax.swing.JFrame;

public class Display extends JFrame {
	
	public void histogram() {
		HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>(1000);
		Die die = new Die(6);
		for (int key = 0; key < 1000; key++) {
			sums.put(key, FourRollSum(die));
		}
	}

	public int FourRollSum(Die die) {
		int totalsum = 0;
		for (int i = 0; i < 4; i++) {
			die.roll();
			totalsum += die.getValue();
		}
		return totalsum;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	}
}
