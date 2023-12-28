package practice_projects;

//Define a class representing a geometric shape
class Shape {
 // Attributes
 private String name;

 // Constructor
 public Shape(String name) {
     this.name = name;
 }

 // Method for getting the name of the shape
 public String getName() {
     return name;
 }

 // Method for calculating and displaying the area
 public void calculateArea() {
     System.out.println("Cannot calculate area for a generic shape.");
 }
}

//Define a subclass Circle, inheriting from Shape
class Circle extends Shape {
 // Additional attribute
 private double radius;

 // Constructor
 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 // Override the calculateArea method for circles
 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of " + getName() + " (circle) is: " + area);
 }
}

//Define a subclass Rectangle, inheriting from Shape
class Rectangle extends Shape {
 // Additional attributes
 private double length;
 private double width;

 // Constructor
 public Rectangle(String name, double length, double width) {
     super(name);
     this.length = length;
     this.width = width;
 }

 // Override the calculateArea method for rectangles
 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Area of " + getName() + " (rectangle) is: " + area);
 }
}

//Main class to demonstrate the program
public class ObjectOriented {

 public static void main(String[] args) {
     // Create objects of the Circle and Rectangle classes
     Circle circle = new Circle("Circle", 5.0);
     Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

     // Demonstrate polymorphism
     displayArea(circle);
     displayArea(rectangle);
 }

 // Polymorphic method to display the area of any Shape
 public static void displayArea(Shape shape) {
     System.out.println("Calculating area for " + shape.getName());
     shape.calculateArea();
 }
}

