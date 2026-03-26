public class HelloApp {
    public static void main(String[] args) {
        // Concept: Check if the array has any items
        if (args.length > 0) {
            // Concept: Join all elements in the args array with a comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            // Default fallback
            System.out.println("Hello, World!");
        }
    }
}