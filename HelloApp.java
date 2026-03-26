public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String names = "";
            // Use enhanced for loop to build the string
            for (String name : args) {
                names += name + ", ";
            }
            
            // Concept: substring(startIndex, endIndex) 
            // We remove the last 2 characters (the extra comma and space)
            names = names.substring(0, names.length() - 2);
            
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}