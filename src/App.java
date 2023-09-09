public class App {
    public static void main(String[] args) throws Exception {
        String name = "Julian";
        String job = "Web Entwickler";
        Integer age = 16;

        Integer hour = 17;

        if(hour > 24) {
            if(hour < 12) {
                System.out.println("Good Morning!");
            }else if(hour > 12 && hour < 18) {
                System.out.println("Good Day!");
            }else {
                System.out.println("Good Evening!");
            }
        } else {
            System.out.print("Please enter a valid hour.");
        }

        System.out.println("My name is  " + name + ", I'm "+age+" years old. I work as an " + job + ".");
    }
}
