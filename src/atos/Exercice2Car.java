package atos;

public class Exercice2Car {
	
 //Création des  proprietes de la class Exercice2Car
    
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    
    // Constructeur par défaut
    
    public Exercice2Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0.0;
    }
    
    // Constructeur paramétré
    
    public Exercice2Car(String make, String model, int year) {
        this();
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Autre constructeur paramétré avec toutes les informations
    
    public Exercice2Car(String make, String model, int year, String color, double price) {
        this(make, model, year);
        this.color = color;
        this.price = price;
    }
    
    
    // Méthode displayCarInfo
    
    public void displayCarInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
    }
    



	public static void main(String[] args) {
		Exercice2Car car1 = new Exercice2Car();
        car1.displayCarInfo();

        Exercice2Car car2 = new Exercice2Car("Brabus", "Classe G", 2021);
        car2.displayCarInfo();

        Exercice2Car car3 = new Exercice2Car("Peugot", "3008", 2022, "Bleu", 30000.0);
        car3.displayCarInfo();

	}

}
