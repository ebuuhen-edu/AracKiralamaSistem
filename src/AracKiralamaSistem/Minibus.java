package AracKiralamaSistem;

public class Minibus extends Arac {
	private int yolcuKapasitesi;
	private boolean klimali;
	
	public Minibus(int id, String marka, String model, int yil, double gunlukKiraBedeli, String plaka, int yolcuKapasitesi, boolean klimali) {
		super(id, marka, model, yil, gunlukKiraBedeli, plaka);
		this.yolcuKapasitesi=yolcuKapasitesi;
		this.klimali=klimali;
		}
	@Override
	public double gunlukKiraHesapla(int gunSayisi) {
		double toplam = gunlukKiraBedeli * gunSayisi;
		// Klimali minibüslerde ek ücret
		if (klimali) {
			toplam += 50 * gunSayisi;
			// 10 günden fazla kiralama için %15 indirim
			if (gunSayisi > 10) {
				toplam *= 0.85;
			}
			return toplam;
		}
		
		public int getYolcuKapasitesi() { return yolcuKapasitesi; }
		public boolean isKlimali() { return klimali; }
		
	@Override
	public String toString() { return marka + " " + model + " (" + yil + ") - " + plaka + " - " + gunlukKiraBedeli + " TL/gün";
	
		
		
		
	}
	

}
