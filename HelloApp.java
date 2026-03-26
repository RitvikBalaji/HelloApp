public class HelloApp {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length > 0) {
            // Personalize the greeting with the first argument
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Default greeting if no argument is passed
            System.out.println("Hello, World!");
        }
    }
}