package AracKiralamaSistem;

public class Musteri extends Kullanici{
	private String ehliyetNo;
	private String adres;
	
	public Musteri(int id, String ad, String soyad, String email,String telefon,String kullaniciAdi, String sifre, String ehliyetNo) {
		super(id, ad, soyad, email, telefon, kullaniciAdi, sifre);
		this.ehliyetNo=ehliyetNo;
		this.adres=adres;
		}
	
	@Override
	public void girisYap() {
			System.out.println("Müşteri girişi yapıldı: "+ kullaniciAdi);
		}
	public void cıkışYap() {
		System.out.println("Müşteri cikisi yapıldı: "+ kullaniciAdi);
	}

	@Override
	public void cikisYap() {
		// TODO Auto-generated method stub
		
	}

}
