package ejercicio2;



public class Principal {
	static Hilo1 h1, h2;
	static Hilo2 h3, h4;
	
	public static void main(String[] args) {
		h1 = new Hilo1();
		h2 = new Hilo1();

		Thread t1 = new Thread(new Hilo2());
		Thread t2 = new Thread(new Hilo2());
		
		h1.start();
		h2.start();
		
		t1.start();
		t2.start();
	}
}
