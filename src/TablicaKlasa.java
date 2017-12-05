
public class TablicaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int nazwaTablicy[] = new int[5];
		
		for(int i = 0; i < nazwaTablicy.length ; i++) {
			nazwaTablicy[i] = i * i;
			System.out.println(i + " " + nazwaTablicy[i]);
			
		}
		
	
		
		System.out.println(nazwaTablicy[4]);
		
		
		
		int tablicaInna[] = (5, 10, 15);
		System.out.println(tablicaInna[1]);
 
        */ // ????????/
		/*
		
		int tabliczkaMnozenia[][] = new int[10][10];
		
		for(int wiersz = 1; wiersz < 10; wiersz++)
		{
			for(int kolumna = 1; wiersz < 10; kolumna++)
			{
				tabliczkaMnozenia[wiersz][kolumna] = wiersz * kolumna;
				System.out.print(tabliczkaMnozenia[wiersz][kolumna]);
				
			}
			
			System.out.println("");
			
			*/
		
		// Tablica szarpana
		/*
		
		int tablicaSzarpana[][] = {{1, 2, 3, 0}, {4, 5, 6}, {7, 8}};
		
		System.out.println(tablicaSzarpana[0][2]);
		System.out.println(tablicaSzarpana[1][2]);
		
		
		
		it wiaderko[] = {5, 10, 15};
		for(int szufelka : wiaderko);
		{
			System.out.println(szufelka);
		}
		*/
		
		int tabliczka[][] = new int[10][10];
	
		for (int x = 1; x <10; x++) {
			for(int y = 1 ; y < 10; y++) {
				
				tabliczka[x][y] = x*y;
				int a = tabliczka[x][y] % 2;
				if (a == 0 ) {
				System.out.print(tabliczka[x][y]);
				
			}		
			System.out.println("");
			}
			
		}
		
		
		
		
		
		
		
		

		
		
		
		
	}
	

}
