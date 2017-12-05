
public class Silnia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//System.out.println(silnia(5));
		System.out.println(silniaRek(6));
	}
	
	// static int silnia(int a) {
		// int x = 
		
		/*
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < a; i++) {
			x=y;
			y=z;
			z=x+y;
			
			*/
		 //}
		// return x;
	
	static int silniaRek(int b) { // rekurencja
		if (b == 0) {
			return 0;
		}
		if (b == 1) {
			return 1;
		}
		return b * silniaRek(b - 1);

  
	}
	}


