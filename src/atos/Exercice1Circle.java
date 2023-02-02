package atos;

public class Exercice1Circle {
	
	
	 private double radius;

	    public Exercice1Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public Exercice1Circle(){
	        this(1);
	    }

	    public double getArea() {
	        return Math.PI * Math.pow(radius, 2);
	    }

	    public double getRadius() {
	        return radius;
	    }

	public static void main(String[] args) {
		Exercice1Circle circle1 = new Exercice1Circle(2);
		Exercice1Circle circle2 = new Exercice1Circle(0);
		Exercice1Circle circle3 = new Exercice1Circle(12);
		Exercice1Circle circle4 = new Exercice1Circle(24);

        System.out.println("Circle 1 Radius: " + circle1.getRadius() + " Area: " + circle1.getArea());
        System.out.println("Circle 2 Radius: " + circle2.getRadius() + " Area: " + circle2.getArea());
        System.out.println("Circle 3 Radius: " + circle3.getRadius() + " Area: " + circle3.getArea());
        System.out.println("Circle 4 Radius: " + circle4.getRadius() + " Area: " + circle4.getArea());
	}

}
