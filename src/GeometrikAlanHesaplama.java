import java.util.Scanner;

public class GeometrikAlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alanını hesaplamak istediğiniz şekli seçin:");
        System.out.println("1 - Dikdörtgen");
        System.out.println("2 - Kare");
        System.out.println("3 - Üçgen");
        int secim = scanner.nextInt();

        double alan = 0;

        switch (secim) {
            case 1:
                System.out.print("Dikdörtgenin uzun kenarını girin: ");
                double uzunKenar = scanner.nextDouble();
                System.out.print("Dikdörtgenin kısa kenarını girin: ");
                double kisaKenar = scanner.nextDouble();
                alan = uzunKenar * kisaKenar;
                break;
            case 2:
                System.out.print("Karenin bir kenarını girin: ");
                double kenar = scanner.nextDouble();
                alan = kenar * kenar;
                break;
            case 3:
                System.out.print("Üçgenin taban uzunluğunu girin: ");
                double taban = scanner.nextDouble();
                System.out.print("Üçgenin yüksekliğini girin: ");
                double yukseklik = scanner.nextDouble();
                alan = (taban * yukseklik) / 2;
                break;
            default:
                System.out.println("Geçersiz şekil seçimi");
        }

        System.out.println("Alan: " + alan);
    }
}
