public class Currency {
    public static void main(String[] args) {
        Double money = (double) 10;

        ConvertToDollars(money);
        ConvertToPounds(money);
        ConvertToYen(money);
    }

    public static void ConvertToDollars(Double eur) {
        System.out.println(eur * 1.20 + "$" );
    }

    public static void ConvertToPounds(Double eur) {
        System.out.println(eur * 0.86 + "£");
    }

        public static void ConvertToYen(Double eur) {
        System.out.println(eur * 158.34 + "Yen");
    }
}