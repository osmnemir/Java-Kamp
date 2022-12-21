package overridding;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basKredi[] krediMiktarý = new basKredi[] 
				{new ogrenciKredi() ,new tarýmKredi()
			};
		for ( basKredi krediMiktars:krediMiktarý) {
			System.out.println(krediMiktars.hesapla(1000));
			
		}

	}

}
