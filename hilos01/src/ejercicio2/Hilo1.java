package ejercicio2;

public class Hilo1 extends Thread{
	@Override
	public void run() {
		int s = 0;
		for(int x=1; x<=10; x++) {
			if(x%2 == 0 ) {
				s = s + x;
				System.out.println(x);
			}
		
		}
		System.out.println(s);
	}
	
}
