import java.util.Scanner;

public class KdvSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tutarı girin: ");
        double tutar = scanner.nextDouble();

        double kdvOrani;
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.1;
        } else {
            kdvOrani = 0.22;
        }

        double kdvTutari = tutar * kdvOrani;
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}
