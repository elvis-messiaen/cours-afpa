import java.io.*;
import java.util.Scanner;


public class Pgcd{
	public static void main(String args [] ){
			int nombreA;
			int nombreB;
			int diviseurC;
			int diviseurCA;
			int diviseurCB;

			 Scanner in = new Scanner(System.in);
			 System.out.println(" entrez le nombre A :");
			 int nombreA = in.nextInt();
			 System.out.println(" entrez le nombre B :");
			 int nombreB = in.nextInt();

			for(i = 2; nombreA -1 >= i ;i--){
				nombreA / i;
				diviseurCA = i;
			}
			for(j = 2; nombreA -1 >= j ;j--){
				nombreA / j;
				diviseurCA = j;
			}
				if(diviseurCA == diviseurCB  ){
					System.out.println("les nombres ont comme diviseur commun : " + diviseurCA);
				}
			else {
				System.out.println("les nombres ont comme diviseur commun :");
				}
			}
		}
	


