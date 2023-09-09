public class Currency {
    public static void main(String[] args) {
        Double money = (double) 10;

        ConvertToDollars(money);
        ConvertToPounds(money);
    }

    public static void ConvertToDollars(Double eur) {
        System.out.println("$" + eur * 1.20);
    }

    public static void ConvertToPounds(Double eur) {
        System.out.println(eur * 0.86 + "£");
    }
}