import java.util.Scanner;
import java.io.*;

public class Olympique{
	public static void main(String [] args){
		int valeur= 0;
		int min = valeur;
		int max = valeur;
		int total = 0;
		
		Scanner in = new Scanner(System.in);
		for (int i = 1;i <= 10;i++){

		System.out.println("Entrez un nombre : ");
		int nombre = in.nextInt();

			 total = total + nombre;
			
				if(valeur > max){
					max = valeur;
			}
				else if(valeur < min){
					min = valeur;
			}
						int moyenne = 0;	
					int moyenne = (nombre - (min + max)) / (valeur - 2);	
						
			}
				System.out.println("total : " + total);
				System.out.println("la moyenne olympique est de : " + moyenne);
		}	
	}
