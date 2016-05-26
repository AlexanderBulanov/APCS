//Adam Barszczak, Alexander Bulanov
import java.util.Scanner;

public class Fastexpt {

	public static int calcFastExpt(int b, int p) {
		int a = 1;
		for (int i = p; i > 0; i--) {
			a = a * b;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base number:");
		int base = s.nextInt();
		System.out.println("Enter power to which you want the base number to be raised:");
		int power = s.nextInt();
		System.out.println(calcFastExpt(base, power));
	}

}
