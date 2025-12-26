package AracKiralamaSistem;

public class Admin extends Kullanici {
	private String yetkiSeviyesi;
	
	public Admin(int id, String ad, String soyad, String email, String telefon, String kullaniciAdi, sifre) {
		super(id, ad, soyad, email, telefon, kullaniciAdi, sifre);
		this.yetkiSeviyesi=yetkiSeviyesi;
		}
	@Override
	public void girisYap() {
		System.out.println("Admin girişi yapıldı: "+ kullaniciAdi);
        }
	
	@Override
	public void cikisYap() {
		System.out.println("Admin çıkışı yapıldı: "+ kullaniciAdi);
	}
	
	public void aracEkle(Arac arac) {
		System.out.println("Araç eklendi: "+ arac.getPlaka());
	}
	public void aracSil(int aracId) {
		System.out.println("Araç silindi: " + aracId);
	}
	public void rezervasyonOnayla(int rezervasyonId) {
		System.out.println("Rezervasyon onaylandı: + rezervasyonId");
	}
	public void rezervasyonIptal(int rezervasyonId) {
		System.out.println("Rezervasyon iptal edildi: "+ rezervasyonId);
	}
	public String getYetkiSeviyesi() { return yetkiSeviyesi; }

}
