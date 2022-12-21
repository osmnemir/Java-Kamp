
package methodreis;

import java.util.Random;
import java.util.Scanner;

public class mainc {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		
		sayýbulmaca();
		topla();

	}
	
	public static void topla () {
		Random rastgele = new Random();
		int rastgeleSayi = rastgele.nextInt(100);
		int rastgeleSayi2 = rastgele.nextInt(100);
		 int sonuc2 = rastgeleSayi + rastgeleSayi2;
		 System.out.println("toplam="+ sonuc2);
		 
		 
		 
		 
		 Scanner girdi = new Scanner(System.in);
			System.out.print("sayý 1 gir	  : ");
			int sayi1 = girdi.nextInt();
			System.out.print("sayý 2 gir	  : ");
			int sayi2 = girdi.nextInt();
			
			int sonuc = sayi1 + sayi2;
		
		System.out.println("toplam="+ sonuc);
	}

	

	public static void sayýbulmaca() {
		int[]sayýlar=new  int[] {1,2,5,6,87,4,94,5};
		
		int aranacak = 1;
		boolean varMi=false;
		
		
		for (int sayi: sayýlar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("sayý mevcuttur");
		}
		else {
			System.out.println("sayý mevcut deðildir");
		}
		
	}


}
