package practice_projects;

public class AccessModifier {

	 
		    public static void main(String[] args) {
		        // Creating an object of the MyClass
		        MyClass myObject = new MyClass();

		       
		        myObject.publicMethod();
		        System.out.println("Public variable: " + myObject.publicVariable);

		        
		        myObject.protectedMethod();
		        System.out.println("Protected variable: " + myObject.protectedVariable);

		        
		        myObject.defaultMethod();
		        System.out.println("Default variable: " + myObject.defaultVariable);

		        // Accessing private members (only within the same class)
		        myObject.accessPrivateMembers();
		    }
		}

		// MyClass.java
		class MyClass {
		    // Public members
		    public int publicVariable = 10;

		    public void publicMethod() {
		        System.out.println("Public method called");
		    }

		    // Protected members
		    protected int protectedVariable = 20;

		    protected void protectedMethod() {
		        System.out.println("Protected method called");
		    }

		    // Default (package-private) members
		    int defaultVariable = 30;

		    void defaultMethod() {
		        System.out.println("Default method called");
		    }

		    // Private members
		    private int privateVariable = 40;

		    private void privateMethod() {
		        System.out.println("Private method called");
		    }

		    // Access private members through a public method
		    public void accessPrivateMembers() {
		        System.out.println("Accessing private variable: " + privateVariable);
		        privateMethod();
		    }}
