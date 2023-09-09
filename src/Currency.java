import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number in Euros!");
            Double money = scanner.nextDouble();

            ConvertToDollars(money);
            ConvertToPounds(money);
            ConvertToYen(money);
        }
    }

    public static void ConvertToDollars(Double eur) {
        System.out.println(eur * 1.20 + "$" );
    }

    public static void ConvertToPounds(Double eur) {
        System.out.println(eur * 0.86 + "£");
    }

        public static void ConvertToYen(Double eur) {
        System.out.println(eur * 158.34 + " Yen");
    }
}