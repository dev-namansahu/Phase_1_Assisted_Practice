package practice_projects;

//Define a common interface with a default method
interface Shape {
 void draw();

 default void display() {
     System.out.println("Displaying shape");
 }
}

//Define two interfaces that extend Shape
interface CircleShape extends Shape {
 void drawCircle();
}

interface SquareShape extends Shape {
 void drawSquare();
}

//Implement classes that implement Circle and Square interfaces
class CircleImpl implements CircleShape {
 @Override
 public void draw() {
     System.out.println("Drawing circle");
 }

 @Override
 public void drawCircle() {
     System.out.println("Drawing specific circle");
 }
}

class SquareImpl implements SquareShape {
 @Override
 public void draw() {
     System.out.println("Drawing square");
 }

 @Override
 public void drawSquare() {
     System.out.println("Drawing specific square");
 }
}

//Implement a class that implements both Circle and Square interfaces
class CircleSquareImpl implements CircleShape, SquareShape {
 @Override
 public void draw() {
     System.out.println("Drawing circle-square");
 }

 @Override
 public void drawCircle() {
     System.out.println("Drawing specific circle in circle-square");
 }

 @Override
 public void drawSquare() {
     System.out.println("Drawing specific square in circle-square");
 }
}

public class DiamondProblem {
 public static void main(String[] args) {
     CircleShape circle = new CircleImpl();
     SquareShape square = new SquareImpl();
     CircleSquareImpl circleSquare = new CircleSquareImpl();

     // Call methods
     circle.draw();
     circle.drawCircle();
     circle.display();

     System.out.println();

     square.draw();
     square.drawSquare();
     square.display();

     System.out.println();

     circleSquare.draw();
     circleSquare.drawCircle();
     circleSquare.drawSquare();
     circleSquare.display();
 }
}

