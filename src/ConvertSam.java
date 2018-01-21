
import java.util.Scanner;

public class ConvertSam {

	public static void main(String[] args) {


		Scanner clavier = new Scanner(System.in);
		int reponse1 = 0;
		double tempC = 0;
		double tempF = 0;
		double calculC = 0; 
		double calculF = 0;            
		String str = new String();

		System.out.println("Convertisseur degré Celsius et degré Fahrenheit");
		System.out.println("-----------------------------------------------");
		do {	
			do {
				System.out.println("Choisissez un mode de conversion:");
				System.out.println("1. Fahrenheit en Clesius\n2.Celsius en Fahrenheit");

				reponse1 = clavier.nextInt();




				switch(reponse1) {
				case 1:
					System.out.println("Quelle température souhaitez-vous convertir en Celsius?");
					tempF = clavier.nextInt();
					calculC = ((tempF-32)*5)/9;
					System.out.println(tempF+"° Fahrenheit fait " + calculC + "° Celsius");
					break;
				case 2:
					System.out.println("Quelle température souhaitez-vous convertir en Fahrenheit?");
					tempC = clavier.nextInt();
					calculF = (9/5)*tempC+32; 	
					System.out.println(tempC+"° Celsius fait "+ calculF+"° Fahrenheit");
					break;
				default:
					System.out.println("Le chiffre rentré n'est pas valide!");
				}

			}while (reponse1 != 1|| reponse1 != 2);
			System.out.println("Souhaitez-vous faire une nouvelle conversion? (oui/non)");	

			str = clavier.nextLine();

			if(str == "non")
				System.out.println("Merci, bonne journée!");

		}
		while(str == "oui");	

	}
}