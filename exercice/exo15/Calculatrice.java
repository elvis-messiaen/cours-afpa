public class Calculatrice{
	public static void main (String args []){
			;
			String str = args [0];

			char a = str.charAt (0);
			String nombre = ("" + a);
			int nombrea = Integer.parseInt (nombre);

			char b = str.charAt (1);
			String operateur = ("" + b);
			int total = 0;

			char c = str.charAt (2);
			String nombre2 = ("" + c);
			int nombreb = Integer.parseInt (nombre2);

			int total = nombrea + nombreb;
			System.out.println("le resultat est : " + total);

			 if (operateur.equals('+')){
				total = nombrea + nombreb;
				System.out.println("le resultat est : " + total);
			}
			else if (operateur.equals('-')){
				total = nombrea - nombreb;
				System.out.println("le resultat est : " + total);
			}
			else if (operateur.equals('*')){
				total = nombrea * nombreb;
				System.out.println("le resultat est : " + total);
			}
			else if (operateur.equals('/')){
				total = nombrea / nombreb;
				System.out.println("le resultat est : " + total);
			} 

	}
}