public class mime{
	public static void main (String args []){

		String fichier ="";
		for (int i = 0 ;i < args.length;i++){
			fichier = fichier +args[i];
		}

		int taille = fichier.length();
		char point = '.';
		char lettre ='a';
		String ext = "";
		taille--;
		int i = taille;

	
		while (i > 0) {
			 lettre = fichier.charAt(i);

			if (lettre.equals(point)) {
				ext = lettre + ext;
				i--;
			} else {
				i = 0;
			}
			if (ext.equals("pdf")){
				System.out.println("Fichier pdf ");
			}else if (ext.equals("html")) {
				System.out.println("Fichier HTML ");
			} else {
				System.out.println("Unknown");
			}
		}

	}
}