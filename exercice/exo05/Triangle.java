import java.util.Scanner;
import java.io.*;

public class triangle {
	public static void main ( String [] args){
		System.out.println("Entrez une valeur");
		Scanner in = new Scanner(System.in);
		int valeur = in.nextInt();
		
			for(int i = 1; i <= valeur;i++ ){
				for(int j = i ; j <= 1;j++){
				System.out.print(j);
				}
				System.out.println();
			}
			
		}
	}