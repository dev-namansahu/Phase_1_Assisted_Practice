package practice_projects;

public class Method {
	public static void printHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and a return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with a default parameter value
    public static void greetUser(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }

    // Main method
    public static void main(String[] args) {
        // Calling a method with no parameters and no return value
        printHello();

        // Calling a method with parameters and a return value
        int sum = addNumbers(5, 7);
        System.out.println("Sum of numbers: " + sum);

        // Calling a method with default parameter value
        greetUser("Alice", "Good morning");

        // Calling a method with different parameter values
        greetUser("Bob", "Hello");

        // Calling a method and ignoring the return value
        addNumbers(10, 20);

        // Calling a method and using the return value
        int result = addNumbers(15, 25);
        System.out.println("Result: " + result);

        // Calling a method with expressions as arguments
        greetUser("Charlie", "Hi" + " there");

        // Calling a method with variables as arguments
        String myName = "David";
        String myGreeting = "Hola";
        greetUser(myName, myGreeting);
    }

}
