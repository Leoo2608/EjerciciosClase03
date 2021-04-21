package ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
		String[] nombres = {"Leo","Daniel","Cesar","André","Josué","Joaquín","Diego",
				"Jhon","Kevin","David"};
		
		for(String nom: nombres) {
			Hilo h1 = new Hilo(nom);
			Thread th = new Thread(h1);
			th.start();
			
		}
	}
}
