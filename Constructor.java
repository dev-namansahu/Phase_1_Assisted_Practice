package practice_projects;

public class Constructor {
	 private int id;
	    private String name;

	    // Default (no-argument) constructor
	    public Constructor() {
	        System.out.println("Default Constructor called");
	        id = 0;
	        name = "Default";
	    }

	    // Parameterized constructor
	    public Constructor(int id, String name) {
	        System.out.println("Parameterized Constructor called");
	        this.id = id;
	        this.name = name;
	    }

	    // Copy constructor
	    public Constructor(Constructor other) {
	        System.out.println("Copy Constructor called");
	        this.id = other.id;
	        this.name = other.name;
	    }

	    // Method to display object information
	    public void displayInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        Constructor obj1 = new Constructor(); // Default constructor
	        Constructor obj2 = new Constructor(1, "John"); // Parameterized constructor

	        // Displaying information of objects
	        System.out.println("\nObject 1:");
	        obj1.displayInfo();

	        System.out.println("\nObject 2:");
	        obj2.displayInfo();

	        // Creating an object using copy constructor
	        Constructor obj3 = new Constructor(obj2); // Copy constructor

	        // Displaying information of the copied object
	        System.out.println("\nObject 3 (Copy of Object 2):");
	        obj3.displayInfo();
	    }

}
