package AracKiralamaSistem;

public abstract class Kullanici {
	protected int id;
	protected String ad;
	protected String soyad;
	protected String email;
	protected String telefon;
	protected String kullaniciAdi;
	protected String sifre;
	
	public Kullanici(int id, String ad, String soyad, String email, String telefon, String kullaniciAdi, String sifre) {
		this.id=id;
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.telefon=telefon;
		this.kullaniciAdi=kullaniciAdi;
		this.sifre=sifre;
		}
	public abstract void girisYap();
	public abstract void cikisYap();
	
	// Getter ve Setter metodları
	public int getId() { return id; }
	public String getAd() { return ad; }
	public String getSoyad() { return soyad; }
	public String getEmail() { return email; }
	public String getTelefon() { return telefon; }
	public String getKullaniciAdi() {return kullaniciAdi; }
	public void setSifre(String sifre) {
		this.sifre=sifre;
		}
	public boolean sifreKontrol(String sifre) {
		return this.sifre.equals(sifre);
	}
	

}
