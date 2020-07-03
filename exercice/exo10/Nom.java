import java.io.*;
import java.util.Scanner;

public class Nom{
	public static void main (String [] args){
			
		
			Scanner in = new Scanner(System.in);

			System.out.println("Entrez votre nom :");
			String nom = in.nextLine();

			System.out.println("Entrez votre prenom :");
			String prenom = in.nextLine();

			System.out.println("vous vous appelez : " + nom + " " +prenom);
			System.out.println("votre nom comporte : " + nom.length() + " lettres");
			System.out.println("votre nom comporte : " + prenom.length() + " lettres");
			
	}
}