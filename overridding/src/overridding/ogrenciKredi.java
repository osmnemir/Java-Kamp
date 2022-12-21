package overridding;

public class ogrenciKredi extends basKredi{
	public double hesapla (double tutar) {
		return tutar * 1.17;
	}

}
