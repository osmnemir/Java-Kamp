package overridding;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basKredi[] krediMiktar� = new basKredi[] 
				{new ogrenciKredi() ,new tar�mKredi()
			};
		for ( basKredi krediMiktars:krediMiktar�) {
			System.out.println(krediMiktars.hesapla(1000));
			
		}

	}

}
