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
	
	public static void main(String[] args) {
		Display disp = new Display();
		disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		disp.setSize(1200, 800);
		disp.setTitle("Histogram");
		disp.setVisible(true);
		disp.histogram();
	}
	
}
