import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class GuessNumber {
    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);

    public static void main(String[] args) {
        nextRound();
    }

    public static void nextRound() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number!");
            Integer number = scanner.nextInt();
            guess(number);
        }
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
            nextRound();
        }
    }
}