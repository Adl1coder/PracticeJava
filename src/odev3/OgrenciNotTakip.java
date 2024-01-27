package odev3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciNotTakip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> ogrenciNotlari = new HashMap<>();

        while (true) {
            System.out.println("1.  Oğrenci Ekle");
            System.out.println("2. Notunu Öğren");
            System.out.println("3. Cikis");
            System.out.print("Seciminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Ogrenci Adi: ");
                    String ogrenciAdi = scanner.next();
                    System.out.print("Notu: ");
                    int notu = scanner.nextInt();
                    ogrenciNotlari.put(ogrenciAdi, notu);
                    break;

                case 2:
                    System.out.print("Sorgulamak istediginiz ogrenci adi: ");
                    String sorguAdi = scanner.next();
                    if (ogrenciNotlari.containsKey(sorguAdi)) {
                        System.out.println(sorguAdi + " adli ogrencinin notu: " + ogrenciNotlari.get(sorguAdi));
                    } else {
                        System.out.println("Bu isimde bir ogrenci bulunamadi.");
                    }
                    break;

                case 3:
                    System.out.println("Programdan cikiliyor...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Gecersiz secim! Tekrar deneyin.");
            }
        }
    }
}
