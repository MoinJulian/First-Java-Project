public class Currency {
    public static void main(String[] args) {
        Double money = (double) 10;

        ConvertToDollars(money);
    }

    public static void ConvertToDollars(Double eur) {
        System.out.println("$" + eur * 1.20);
    }
}