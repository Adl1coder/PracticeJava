import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu girin: ");
        int not = scanner.nextInt();

        if (not >= 90 && not <= 100) {
            System.out.println("AA");
        } else if (not >= 80 && not < 90) {
            System.out.println("BA");
        } else if (not >= 70 && not < 80) {
            System.out.println("BB");
        } else if (not >= 60 && not < 70) {
            System.out.println("CB");
        } else if (not >= 50 && not < 60) {
            System.out.println("CC");
        } else {
            System.out.println("FF");
        }
    }
}
