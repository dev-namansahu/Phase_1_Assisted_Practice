package practice_projects;

public class InnerClass {
	  private int outerVariable = 10;

	    // Member Inner Class
	    class MemberInnerClass {
	        public void display() {
	            System.out.println("Member Inner Class: Outer Variable = " + outerVariable);
	        }
	    }

	    // Method with Local Inner Class
	    public void outerMethod() {
	        final int localVariable = 20;

	        // Local Inner Class
	        class LocalInnerClass {
	            public void display() {
	                System.out.println("Local Inner Class: Outer Variable = " + outerVariable);
	                System.out.println("Local Inner Class: Local Variable = " + localVariable);
	            }
	        }

	        // Creating an instance of the LocalInnerClass
	        LocalInnerClass localInner = new LocalInnerClass();
	        localInner.display();
	    }

	    // Main method
	    public static void main(String[] args) {
	        InnerClass outerObject = new InnerClass();

	        // Creating an instance of the MemberInnerClass
	        InnerClass.MemberInnerClass memberInner = outerObject.new MemberInnerClass();
	        memberInner.display();

	        // Invoking the outer method which has a local inner class
	        outerObject.outerMethod();
	    }

}
