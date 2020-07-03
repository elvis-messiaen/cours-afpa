import java.util.Scanner;
import java.io.*;

public class Calculatrice{
    public static void main(String [] args){
    		String str = args [0];
    		int n = str.length();
    		char operateurC;
    		for(int j = 0; j < n;j++){
    			int value = j;
    			String operateur = "" + value;
    			for (i = 0;i < operateur.length;i++) {
    				 char operateurC = i.charAt(0);
    				if ( operateurC == '-' &&  operateurC == '+') {
    					n = j;
    					
    		int sommeP = 0;
    		int sommeN = 0;
    		char neg = 'j';
		}
	}
    		for (int i=0;i<=n;i++) {
    			if (charAt(i)!= neg){
    				char c = str.charAt(i+1);
    				String nb ="" + c;
    				int nbr = Integer.parseInt (nb);
    				sommeP = sommeP + nbr;
    			} else {
    				char c = str.charAt (i+1);
    				String nb = "" + c;
    				int nbr = Integer.parseInt (nb);
    				sommeN = sommeN - nbr;

    			}
    		}
    	}
    		
    			System.out.println("positif" + sommeP);
    			System.out.println("négatif" + sommeN);
     }
}
