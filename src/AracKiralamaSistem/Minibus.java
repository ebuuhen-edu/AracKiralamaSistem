package AracKiralamaSistem;

public class Minibus extends Arac {
    private int yolcuKapasitesi;
    private boolean klimali;

    public Minibus(int id, String marka, String model, int yil, double gunlukKiraBedeli, String plaka, int yolcuKapasitesi, boolean klimali) {
        // Düzeltme: true eklendi
        super(id, marka, model, yil, gunlukKiraBedeli, true, plaka);
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.klimali = klimali;
    }

    @Override
    public double gunlukKiraHesapla(int gunSayisi) {
        double toplam = getGunlukKiraBedeli() * gunSayisi;
        if (klimali) {
            toplam += 50 * gunSayisi; // Klima farkı
        }
        if (gunSayisi > 10) {
            toplam *= 0.85; // %15 indirim
        }
        return toplam;
    }

    // Arayüz gereği eklenen metot
    @Override
    public double kiraHesapla(int gunSayisi) {
        return gunlukKiraHesapla(gunSayisi);
    }

    public int getYolcuKapasitesi() { return yolcuKapasitesi; }
    public boolean isKlimali() { return klimali; }

    @Override
    public String toString() {
        return getMarka() + " " + getModel() + " (" + getYolcuKapasitesi() + " kişilik) - " + getPlaka();
    }
}