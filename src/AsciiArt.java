import java.util.Scanner;

public class AsciiArt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int width = 4;
		int height = 5;
		
		String myStr = "error";
		
		char character = 'Z';    
		int ascii = (int) character;
		
		System.out.println("ASCII code for letter " + character + " = " + ascii );
		
		String str = "hello Worl §";
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		
		for(char cc: ch) {
			System.out.println("Char : " + cc);
		}
		
		System.out.println("My uppercase string : " + str);
		
		StringBuilder[] strB = new StringBuilder[5];
		
		strB[0] = new StringBuilder();
		strB[0].append("Char");
		
		System.out.println("Substring : " + str.substring(3,5));
		
        String[] rows = new String[5];
        
        for (int i = 0; i < 5; i++) {
            rows[i] = in.nextLine();
        }
        
        
		
	}

}
