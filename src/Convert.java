
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("BONJOUR, BIENVENUE DANS MON PROGRAMME DE CONVERSION CELSIUS / FAHRENHEIT.");
		System.out.println ("-------------------------------------------------------------------------");
		char reponse ='o';
		
		while (reponse == 'o')
		{
			System.out.println ("Veuillez choisir votre m�thode de conversion:"
				+ "\n\n1 - Conversion du Celsius vers Fahrenheit"
				+ "\n\n2 - Conversion du Fahrenheit vers Celsius");
			int str = sc.nextInt();
			

			if  (str == 1)
			{
				System.out.println("temp�rature � convertir (Celsius -> Fahrenheit):");	
					int temperature = sc.nextInt();
						double resultat = (temperature * 1.8) + 32;
							System.out.println(temperature +" degr�s Celsius correspondent � "+ resultat  + " degr�s Fahrenheit." );
			}
			else if (str ==2)
			{	
				System.out.println("temp�rature � convertir (Fahrenheit -> Celsius):");
					int temperature = sc.nextInt();
						double resultat = (temperature - 32) / 1.8;
							System.out.println(temperature +" degr�s Fahrenheit correspondent � "+ resultat + " degr�s Celsius.");
			}


			String rep  = " ";
			do 
			{
				System.out.println("Voulez vous faire une nouvelle conversion? (o/n)");
			
				rep = sc.nextLine();
				reponse = rep.charAt(0);
			} while (reponse != 'o' && reponse != 'n');
				
				
			
					
			
		}
		System.out.println("Au revoir!");
	}
}
