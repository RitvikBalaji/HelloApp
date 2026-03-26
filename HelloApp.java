public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Concept: String.join(delimiter, elements)
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}