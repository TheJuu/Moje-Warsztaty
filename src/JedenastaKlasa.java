
public class JedenastaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacciRek(10));

	}
	
	static int zwrocSume(int liczbaA, int liczbaB) 
	{
		return liczbaA + liczbaB;
	}
	
	static int fibonacci(int a) // fibonacci iteracyjnie
	{
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < a; i++) {
			x=y;
			y=z;
			z=x+y;
		}
		return x;
	}
	
	static int fibonacciRek(int n)
	{
		System.out.println("Wartosc n" +n);
		
		if(n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		System.out.println(" suma dwoch poprzednich" + n);
		
		return fibonacciRek(n - 1) + fibonacciRek(n-2);
		
	}

}
