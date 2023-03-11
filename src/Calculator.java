import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelect an operation:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.print("\nYapmak istediğiniz işlemi seçin: ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Geçersiz İşlem!");
                break;
        }

        System.out.println("\nSonuç: " + result);

        scanner.close();
    }
}
