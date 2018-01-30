import java.util.Arrays;

public class TestRandom {

	public static void main(String[] args) {
		
		
		int[] combo = new int[5];
		
		// Generate a random number between 0 and 10 :
		for (int i = 0 ; i< 5; i++) {
			combo[i] = (int)(Math.random() * 10);
		}
				
		System.out.println("generated combo : " + Arrays.toString(combo));
	}
}
