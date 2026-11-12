package oopmodeling;

import oopmodeling.universe.BlackHole;

public class Test {
	
	public static void main(String[] args) {
		
		BlackHole bh1 = new BlackHole("Guille");
		System.out.println(bh1);
		System.out.println(bh1.name);
		
		BlackHole bh10 = new BlackHole("Asier");
		System.out.println(bh10);
		System.out.println(bh10.name);
		
		for (int i = 0; i < 10000000; i++) {
			System.out.println(new BlackHole("Anix"));
			new BlackHole("Anix");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
