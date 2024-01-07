import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava durumu kodunu girin: ");
        int havaKodu = scanner.nextInt();

        switch (havaKodu) {
            case 1:
                System.out.println("Hava güneşli");
                break;
            case 2:
                System.out.println("Hava bulutlu");
                break;
            case 3:
                System.out.println("Hava yağmurlu");
                break;
            default:
                System.out.println("Geçersiz hava durumu kodu");
        }
    }
}
