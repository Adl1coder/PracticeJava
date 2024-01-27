package odev3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
public class CiftSayiFiltreleme {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        Set<Integer> ciftSayilar = new HashSet<>();
        List<Integer> tekSayilar = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sayilar.add(random.nextInt(100));
        }

        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }

        System.out.println("Rastgele Sayilar: " + sayilar);
        System.out.println("Cift Sayilar: " + ciftSayilar);
        System.out.println("Tek Sayilar: " + tekSayilar);
    }
}
