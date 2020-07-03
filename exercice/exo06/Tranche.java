import java.util.Scanner;
import java.io.*;

public class Tranche{
	public static void main(String [] args){

		 System.out.println("quelle est votre age : ");

		 // Scanner pour la lecture du nomnre entrée
		 	Scanner in = new Scanner(System.in);
		 	int age = in.nextInt();
		 	if (age < 6){
		 		System.out.println("quelle est votre age : ");
		 	}
		 		else if (age == 6 || age ==7){
		 			System.out.println("vous est poussin");
		 	}
		 	   else if (age == 8 || age == 9){
		 			System.out.println("vous est Pupille");
		 	}
		 		else if (age== 10 || age == 10){
		 			System.out.println("vous est Minime");
		 	}
		 		else {
		 			System.out.println("vous est cadet");
		 	}
		}
}