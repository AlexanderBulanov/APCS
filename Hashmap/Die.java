//Adam Barszczak, Alexander Bulanov

public class Die {
	private int sides;
	private int rollresult = 0;

	public Die(int sides) {
		this.sides = sides;
	}

	public int roll() {
		int range = sides - 1;
		int rollresult = (int)(Math.random()*range) + 1;
		return rollresult;
	}

	public int getValue() {
		return rollresult;
	}
}
