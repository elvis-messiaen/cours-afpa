import java.io.*;
import java.util.Scanner;

public class Tableau{
	public static void main (String [] args){
		int tableauE []= new int [5];
		int nombre = 0;
		int notes = 0;
			for (notes = 0; notes <= 4;notes++){
				Scanner in  = new Scanner(System.in);
					System.out.println("Entrez vos valeurs à mettre dans  le tableau : ");
					int note = in.nextInt();
					tableauE [notes] = note;
				}
				for (notes = 0; notes <= 4; notes++){
					System.out.println("les valeur du tableau sont : "tableauE[notes]);	
				}
				
			}

	}
