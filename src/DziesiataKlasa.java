
public class DziesiataKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// przeciazanie metod
		//System.out.println(zwrocSume(2, 5));
		double wynik = zwrocSume(2, 4);
		System.out.println(wynik);
		int wiaderko[] = {5, 10, 15};
		wypiszLiczby(wiaderko); // 
		
		
		// przeciazanie metody ponizej
	}
	static int zwrocSume()
	{
		return 0;
	}
	
	static int zwrocSume(int liczbaA, int liczbaB) 
	{
		return liczbaA + liczbaB;
	}
	static double zwrocSume(double liczbaA, double liczbaB) 
	{
		return liczbaA + liczbaB;
	}
	
	
	
	public static void wypiszLiczby(int tablicaIntow[]) // wypisuje liczby z wiaderka
	{
		for(int i = 0; i < tablicaIntow.length; i++)
		{
		System.out.println(tablicaIntow[i]);	
		}
	}

}
