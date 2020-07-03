import java.util.Scanner;
import java.io.*;

public class Double{
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez votre nombre : ");
		int nombre = in.nextInt();
		nombre = nombre * 2;
		System.out.println("Le double de la valeur est : " + nombre);

	}
}