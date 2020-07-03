
import java.io.*;
import java.util.Scanner;

public class Assurance{
	public static void main( String args []){
		int permis = 0;
		int age = 25;
		int accident;
		int fidelite = 0;

		Scanner in = new Scanner(System.in);
		System.out.println(" Entrez votre année de fielité : ");
		fidelite = in.nextint();
		System.out.println(" Entrez votre age : ");
		age = in.nextint();
		System.out.println(" Entrez depuis combien de temps vous avez le permis : ");
		permis = in.nextint();
		System.out.println(" Entrez votre nombre d'accident : ");
		accident = in.nextint();
		String bleu, vert, orange, rouge, refus;
		//tarif fidelité
			if(fidelite >= 5){
				vert = bleu;
				orange = vert;
				rouge = orange;
			}
		// pour tarif rouge
			if((age <= 25) && (permis < 2) && (accident == 0)) ||
			  ((age <= 25) && (permis > 2) && (accident == 1)) ||
			  ((age >= 25) && (permis > 2) && (accident == 1)) ||
			  ((age =< 25) && (permis > 2) && (accident == 2)) {
				int tarif = (int)rouge;	
			} 
		//pour tarif orange
			else if {
			  ((age < 25) && (permis > 2) && (accident == 0)) ||
			  ((age > 25) && (permis < 2) && (accident == 0)) ||
			  ((age > 25) && (permis > 2) && (accident == 1)) ||
				int tarif = (int)orange;	
			}
		//pour tarif vert
			else if {
			  ((age > 25) && (permis > 2) && (accident == 0)) 
				int tarif = (int)orange;	
			}
		// pour refus	
			else if {
			  ((age < 25) && (permis < 2) && (accident > 0)) ||
			  ((age < 25) && (permis > 2) && (accident == 2)) ||
			  ((age > 25) && (permis < 2) && (accident == 2)) ||
			  ((age > 25) && (permis < 2) && (accident > 3))
				int tarif = (int)refus;	
			}	
	}
}