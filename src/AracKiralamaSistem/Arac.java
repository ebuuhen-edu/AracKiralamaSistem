package AracKiralamaSistem;

public abstract class Arac implements Kiralanabilir {
	protected int id;
	protected String marka;
	protected String model;
	protected int yil;
	protected double gunlukKiraBedeli;
	protected boolean kiralanabilirDurum;
	protected String plaka;
	public Arac(int id, String marka, String model, int yil, double gunlukKiraBedeli, boolean kiralanabilirDurum, String plaka) {
		this.id=id;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.gunlukKiraBedeli=gunlukKiraBedeli;
		this.plaka=plaka;
		this.kiralanabilirDurum=true;
	}
	@Override
	public boolean durumKontrol() {
		return kiralanabilirDurum;

	}

	@Override
	public void kiralamaYap() {
		if(kiralanabilirDurum) {
			kiralanabilirDurum=false;
			System.out.println("Araç kiralandı: "+ plaka);
		} else {
			System.out.println("Araç zaten kiralanmış!");
		}
	}
	@Override
	public void kiralamaIade() {
		kiralanabilirDurum=true;
		System.out.println("Araç iade edildi:" + plaka);
	}

	// Getter ve Setter metodları
	public int getId() { return id; }
	public String getMarka() { return marka; }
	public String getModel() { return model; }
	public int getYil() { return yil; }
	public double getGunlukKiraBedeli() { return gunlukKiraBedeli; }
	public boolean isKiralanabilirDurum() { return kiralanabilirDurum; }
	public String getPlaka() { return plaka; }
	public void  getGunlukKiraBedeli(double gunlukKiraBedeli) {
		this.gunlukKiraBedeli=gunlukKiraBedeli;
	}




	}



