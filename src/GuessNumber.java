public class GuessNumber {
    static Integer myNumber = 42;

    public static void main(String[] args) {
        guess(41);
        guess(42);
    }

    public static void guess(Integer num) {
        if(num == myNumber) {
            System.out.println("Guessed Correct!");
        }else {
            System.out.println("Guessed wrong!");
        }
    }
}