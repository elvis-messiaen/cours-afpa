

public class Conversion{
	public static void main (String args []){
		String str = args [0];

		char a = str.charAt(0);
		String nombre = ("" + a);
		int secondes = Integer.parseInt(nombre);

		char b = str.charAt(1);
		String nombre = ("" + b);
		int minutes = Integer.parseInt(nombre);

		char c = str.charAt(2);
		String nombre = ("" + c);
		int heures = Integer.parseInt(nombre);

		char d = str.charAt(3);
		String nombre = ("" + d);
		int jours = Integer.parseInt(nombre);

		if  (secondes >= 60){
			int temps = secondes - 60;
			minutes = minutes + temps;
			secondes = 60;
		}
		else if  (minutes >= 60){
			int temps = minutes - 60;
			heures = minutes + temps;
			temps = temps / 60;
			minutes = 60;
			
		}
		else if  (heures >= 24){
			int temps = minutes - 24;
			heures = minutes + temps;
			temps = temps / 24;
			minutes = 24;
			jours = jours + temps;
		
		}
	}
}