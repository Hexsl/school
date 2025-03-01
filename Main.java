/*
1. Two access modifiers in Java are public and private. Public allows data to be accessed from outside 
of the class, whereas private data can only be accessed from within the class itself. Public is most commonly
used in the driver class, and private is most commonly used in class fields.

2. One of the main benefits of inheritance is the ability to include fields and methods from another 
related class without needing to redefine them. 
*/
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        
        int circleSides = circle.getNumOfSides();
        int rectangleSides = rectangle.getNumOfSides();
        
        System.out.println(rectangleSides + "\n" + circleSides);
    }
}

class Shape {
	private int numOfSides;
	
	Shape(int numOfSides) {
	    this.numOfSides = numOfSides;
	}
	
	public int getNumOfSides() {
	    return numOfSides;
	}
}

class Rectangle extends Shape {
    Rectangle() {
        super(4);
    }
}

class Circle extends Shape {
    Circle() {
        super(0);
    }
}
