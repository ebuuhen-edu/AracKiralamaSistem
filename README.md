Araç Kiralama Otomasyon Sistemi
Bu proje, Java ve MySQL kullanılarak geliştirilmiş kapsamlı bir Araç Kiralama ve Filo Takip Otomasyonudur. Nesne Tabanlı Programlama (OOP) prensiplerine uygun olarak; güvenli veri saklama, araç takibi ve otomatik fiyat hesaplama mantığı üzerine kurgulanmıştır.

Projenin Amacı
Bir araç kiralama işletmesinin (Rent A Car) elindeki araç envanterini dijital ortamda yönetmesini, müşteri kayıtlarını tutmasını ve kiralama işlemlerindeki fiyat hesaplamalarını hatasız bir şekilde gerçekleştirmesini sağlamaktır.

Kullanılan Teknolojiler
Dil: Java (JDK 21)

Arayüz (GUI): Java Swing (WindowBuilder)

Veritabanı: MySQL

Bağlantı: JDBC (MySQL Connector)

IDE: Eclipse

Özellikler
1. Yönetici (Admin) Modülü

Kullanıcı adı ve şifre ile sisteme güvenli giriş yapabilir.

Veritabanına yeni yönetici (Admin) kaydı oluşturabilir.

Tüm sistemin kontrolünü tek panelden sağlayabilir.

2. Araç (Vehicle) Yönetimi

Sisteme yeni araç (Otomobil, Minibüs vb.) ekleyebilir.

Araçların marka, model, plaka ve günlük kira bedelini kaydedebilir.

Hangi aracın kirada, hangisinin garajda (müsait) olduğunu takip edebilir.

3. Kiralama ve Müşteri İşlemleri

Kiralama yapılacak müşterileri sisteme kaydedebilir.

Açılır listelerden (ComboBox) kolayca Müşteri ve Araç seçimi yapabilir.

Girilen gün sayısına göre Toplam Tutarı sistem otomatik olarak hesaplar.

Kiralama işlemi tamamlandığında veritabanını günceller.
