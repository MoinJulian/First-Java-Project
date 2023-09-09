public class App {
    public static void main(String[] args) {
        String name = "Julian";
        String job = "Web Entwickler";
        Integer age = 16;

        showGreeting(10);
        showGreeting(20);

        System.out.println("My name is  " + name + ", I'm "+age+" years old. I work as an " + job + ".");
    }

    public static void showGreeting(Integer hour) {
        if(hour < 12) {
            System.out.println("Good Morning!");
        }else if(hour > 12 && hour < 18) {
            System.out.println("Good Day!");
        }else {
            System.out.println("Good Evening!");
        }
    }
}
