package odev3;

import java.util.HashMap;
import java.util.Map;

public class SatisTakibi {

    public static void main(String[] args) {
        Map<String, Double> satislar = new HashMap<>();

        satislar.put("ayse", 9900.0);
        satislar.put("ali", 7600.0);
        satislar.put("eda", 1890.0);
        satislar.put("ece", 7500.0);


        double toplamSatis = 0.0;
        String enCokSatisYapanMusteri = null;
        double enCokSatisMiktari = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : satislar.entrySet()) {
            String musteriAdi = entry.getKey();
            double satisMiktari = entry.getValue();
            toplamSatis += satisMiktari;

            if (satisMiktari > enCokSatisMiktari) {
                enCokSatisYapanMusteri = musteriAdi;
                enCokSatisMiktari = satisMiktari;
            }
        }

        System.out.println("Toplam Satis: " + toplamSatis);
        System.out.println("En Cok Satis Yapan Musteri: " + enCokSatisYapanMusteri + ", Satis Miktari: " + enCokSatisMiktari);
    }
}

