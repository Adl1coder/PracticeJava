package odev3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OyuncuPuanii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> oyuncuPuanlari = new HashMap<>();

        while (true) {
            System.out.println("1. Puan Ekle");
            System.out.println("2. Puan Goruntule");
            System.out.println("3. Cikis");
            System.out.print("Seciminizi yapin: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Oyuncu Adi: ");
                    String oyuncuAdi = scanner.next();
                    System.out.print("Eklenen Puan: ");
                    int eklenenPuan = scanner.nextInt();
                    oyuncuPuanlari.merge(oyuncuAdi, eklenenPuan, Integer::sum);
                    break;

                case 2:
                    System.out.print("Puanlarini gormek istediginiz oyuncu adi: ");
                    String goruntuleAdi = scanner.next();
                    if (oyuncuPuanlari.containsKey(goruntuleAdi)) {
                        System.out.println(goruntuleAdi + " adli oyuncunun toplam puani: " + oyuncuPuanlari.get(goruntuleAdi));
                    } else {
                        System.out.println("Bu isimde bir oyuncu bulunamadi.");
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
