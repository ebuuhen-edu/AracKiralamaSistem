package AracKiralamaSistem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rezervasyon {
	private int id;
	private int musteriId;
	private int aracId;
	private String baslangicTarihi;
	private String bitisTarihi;
	private String durum;
	private double toplamUcret;
	
	public Rezervasyon(int id, int musteriId, int aracId, String baslangicTarihi, String bitisTarihi, String durum) {
		this.id=id;
		this.musteriId=musteriId;
		this.aracId=aracId;
		this.baslangicTarihi=baslangicTarihi;
		this.bitisTarihi=bitisTarihi;
		this.durum=durum;
		this.toplamUcret = 0;
	}
	
	public long gunHesapla() {
		LocalDate baslangic = LocalDate.parse(baslangicTarihi);
		LocalDate bitis = LocalDate.parse(bitisTarihi);
		return ChronoUnit.DAYS.between(baslangic, bitis);
	}
	public int getId() { return id; }
	public int getMusteriId() { return musteriId; }
	public int getAracId() { return aracId; }
	public String getBaslangicTarihi() { return baslangicTarihi; }
	public String getBitisTarihi() { return bitisTarihi; }
	public String getDurum() { return durum; }
	public double getToplamUcret() { return toplamUcret; }	
	public void setDurum() { this.durum=durum; }
	public void setToplamUcret() { this.toplamUcret=toplamUcret; }
	
	@Override 
	public String toString() {
		return "Rezervasyon ID: " + id + ", Müşteri: "+ musteriId + ", Araç: " + aracId + ", Tarih: " + baslangicTarihi + " - " + bitisTarihi + ", Durum: " + durum + ", Ücret: "+ toplamUcret + " TL";
		
	}
}
	
	
	


