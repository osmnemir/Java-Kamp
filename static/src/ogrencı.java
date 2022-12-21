
public class ogrencý {
	private String ad ;
	private int id;
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static String no;
 
	
	
	
	
	public static void numarayazdýr() {
		
	}
	
	
	public void ogrencýBýlgýlerý() {
		
		System.out.println("id"+ getId());
		System.out.println("ad"+getAd());
		numarayazdýr();
	}
}
