public class Maclasse{
	public static void main(String args []){
		
		String a = args [0];

		int taille = a.length();
		int [] tab = new int [taille];
		
		for (int i = 0;i != args.length;i++) {
				if (args [i] < args.length) {
					int temp = i;
					i = args.length;
					args.length = temp;
				}
			System.out.print(args[i]);	
			
			
		}
	}
}