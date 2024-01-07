import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir.");
        } else {
            System.out.println("Girilen sayı tektir.");
        }
    }
}
