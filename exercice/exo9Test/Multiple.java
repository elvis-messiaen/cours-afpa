import java.util.Scanner;
import java.io.*;

public class Multiple{
    public static void main(String [] args){
        String azert=args[0];
        int a = azert.length();
        String azert2;
        int j=1;
        int nb1;
        char c;
        	for(int i=0;i<=a-1;i++){
           	 	c = azert.charAt(i);
           	 	azert2 = "" + azert.charAt(i);
            		if(c>='0' && c<='9'){
                nb1 = Integer.parseInt(azert2);
             for(j=1;j<=nb1;j++){
                    System.out.print(azert.charAt(i+1));
                }
                i++;
            }else{
                System.out.print(azert.charAt(i));
            }
        }
    }
}
