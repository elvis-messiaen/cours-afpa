import java.io.*;

public class TableauCr {
	public static void main(String[] args){
	int dimension = Integer.parseInt(args[0]);
	int conv;
	int stock;
	int tab [] = new int [dimension];
	
	for (int i = 0; i <= dimension - 1 ; i++) {
	conv = Integer.parseInt(args[i+1]);
	tab[i] = conv;
	}
	
	for (int i = 0; i <= dimension - 2 ; i++) {
		for (int j = i + 1; j <= dimension - 1; j++) {
			if (tab[i] > tab[j]) {
				stock = tab[i];
				tab[i] = tab [j];
				tab[j] = stock;
			}
		}
	}
	
	for (int i = 0; i <= dimension -1; i++) {
		System.out.print(tab[i]+ " ");
	}
}
}