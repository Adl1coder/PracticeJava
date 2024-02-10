package oop_task.odev1;

import java.util.ArrayList;

// Yemek sınıfı
class Yemek {
    private String ad;
    private double fiyat;

    public Yemek(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }
}

// Menü sınıfı
class Menu {
    private ArrayList<Yemek> yemekler;

    public Menu() {
        yemekler = new ArrayList<>();
    }

    public void yemekEkle(Yemek yemek) {
        yemekler.add(yemek);
    }

    public void menuGoster() {
        System.out.println("Menü:");
        for (Yemek yemek : yemekler) {
            System.out.println(yemek.getAd() + " - $" + yemek.getFiyat());
        }
    }
}

// Sipariş sınıfı
class Siparis {
    private Yemek yemek;
    private int adet;

    public Siparis(Yemek yemek, int adet) {
        this.yemek = yemek;
        this.adet = adet;
    }

    public double toplamFiyatHesapla() {
        return yemek.getFiyat() * adet;
    }
}

// Müşteri sınıfı
class Musteri {
    private String ad;
    private ArrayList<Siparis> siparisler;

    public Musteri(String ad) {
        this.ad = ad;
        siparisler = new ArrayList<>();
    }

    public void siparisVer(Yemek yemek, int adet) {
        Siparis siparis = new Siparis(yemek, adet);
        siparisler.add(siparis);
    }

    public void siparisleriGoster() {
        System.out.println("Siparişleriniz:");
        for (Siparis siparis : siparisler) {
            System.out.println(siparis.toplamFiyatHesapla() + "$");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Örnek kullanım
        Yemek yemek1 = new Yemek("Köfte", 10.99);
        Yemek yemek2 = new Yemek("Pizza", 12.99);

        Menu menu = new Menu();
        menu.yemekEkle(yemek1);
        menu.yemekEkle(yemek2);
        menu.menuGoster();

        Musteri musteri = new Musteri("Ahmet");
        musteri.siparisVer(yemek1, 2);
        musteri.siparisVer(yemek2, 1);
        musteri.siparisleriGoster();
    }
}

