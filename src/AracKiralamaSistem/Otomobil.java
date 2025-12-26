package AracKiralamaSistem;

public class Otomobil extends Arac {
	private String yakitTuru;
	private int koltukSayisi;
	
	public Otomobil(int id, String marka, String model, int yil, double gunlukKiraBedeli, String plaka, String yakitTuru, int koltukSayisi) {
		super(id, marka, model, yil, gunlukKiraBedeli,  plaka);
		this.yakitTuru=yakitTuru;
		this.koltukSayisi=koltukSayisi;
	}
	@Override
	public double kiraHesapla(int gunSayisi) {
		double toplam=gunlukKiraBedeli;
		// 7 günden fazla kiralama için %10 indirim
		if (gunSayisi > 7) {
			toplam *= 0.9;
		}
		return toplam;
		}
	
	// Getter metodları
	public String getYakitTuru() { return yakitTuru; }
	public int getKoltukSayisi() { return koltukSayisi; }
	
	@Override
	public String toString() {
		return marka + " " + model + "(" + yil + ") - " + plaka + " - " + yakitTuru + " - " + gunlukKiraBedeli + " TL/gun";
	}
	

}
