package array;

public class array {
	
	public array (String[]args) {
	String[] sehirler1 = new String[]{"ankara","istanbul","osmaniye"};
	
	for(String sehir : sehirler1 ) {
		System.out.println(sehir);
	}
	for(int i = 0 ; i<3 ;i++) {
		System.out.println(sehirler1[i]);
	}
}
}
