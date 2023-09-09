import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);

    public static void main(String[] args) {
        guess(41);
        guess(42);
    }

    public static void guess(Integer num) {
        if(num == myNumber) {
            System.out.println("Guessed Correct!");
        }else {
            System.out.println("Guessed wrong!");

            if (num < myNumber) {
                System.out.println("Your number is to small");
            } else {
                System.out.println("Your number is to big");
            }
        }
    }
}