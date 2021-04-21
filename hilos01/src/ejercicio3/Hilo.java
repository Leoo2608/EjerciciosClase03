package ejercicio3;

public class Hilo extends Thread{
	
	private String nom;
	public Hilo(String nom) {
		this.nom = nom;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3;i++) {
			System.out.println(nom +" esta comiendo "+ i +" sandwich de pollo");
		}
		System.out.println("\n****"+nom+" terminó su sandwich ****\n");
	}
	

}
