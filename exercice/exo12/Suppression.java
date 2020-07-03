
import java.io.*;
import java.util.Scanner;

public class Suppression {

public static void main(String[] args) {
			int compteur = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Entrez la taille du tableau : ");
			int valeur = in.nextInt();
			int tableau[] = new int[valeur];

			System.out.println("Entrez les valeurs du tableau : ");
		for (int j = 0; j < valeur ; j++){
			tableau [j] = in.nextInt();
	}

			System.out.println("Entrez la valeur a supprimer du tableau : ");
			int nombreSup = in.nextInt();
		for (int i = 0; i < tableau.length; i++){
			if (nombreSup == tableau [i]){
			compteur++;
				for (int j = i; j < tableau.length - 1; j++) {
					tableau [j] = tableau [j+1];
	}
			tableau [tableau.length - 1] = 0;
			i--;

	}
}
			System.out.println("le chiffre est supprimé : " + compteur + " fois");
			System.out.print("Tableau : ");
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " , ");
		}
	}
}