import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İki sayı girin: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Bölme: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi");
        }
    }
}
