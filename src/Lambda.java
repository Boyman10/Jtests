import java.util.function.Function;

/**
 * Testing lambda - Java 8
 * @author John
 *
 */
public class Lambda {

	public static void main(String[] args) {


		Function<Integer, Integer> var = (Integer param) -> { return param * 2;};
	
		System.out.println("Printing the result of a lambda : " + var.apply(4));
	}

}
