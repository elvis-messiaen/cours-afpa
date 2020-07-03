import java.io.*;
import java.util.Scanner;

public class Nom{
	public static void main (String [] args){
			
		
			Scanner in = new Scanner(System.in);

			System.out.println("Entrez un mot");
			String  nom = in.nextLine();

				for (i = 0 ; i <= nom ;i++){
				String temp	= string  [0];
				String [0] =  nom.length;
				String [nom.length] = temp;
				nomInvers = i;
					if(nom != nomInvers){
						System.out.println("le mot est pas palindrome");
					}
					else {
						System.out.println("le mot est palindrome");
				}

		}
	}
}