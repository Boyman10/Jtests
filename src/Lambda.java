import java.util.List;
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
		
        Function<List<Integer>, Integer> getMin = (List<Integer> values) -> { 
            return (values.get(0) < Math.abs(values.get(1)))?values.get(0):Math.abs(values.get(1));
            };
	}

}
