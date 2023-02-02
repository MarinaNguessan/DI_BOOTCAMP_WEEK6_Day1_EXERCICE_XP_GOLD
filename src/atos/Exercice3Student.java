package atos;

public class Exercice3Student {
	
	// Création des propriétés
	  private String name;
	  private int age;
	  private String course;
	  private char grade;
	  
	  //constructeur sans paramètre
	  
	  public Exercice3Student() {
	    this.name = "";
	    this.age = 0;
	    this.course = "";
	    this.grade = ' ';
	  }
	  
	  //constructeur  avec les paramètres
	  
	  public Exercice3Student(String name, int age) {
	    this();
	    this.name = name;
	    this.age = age;
	  }
	  
	  //constructeur paramétré avec le reste des proprietes
	  
	  public Exercice3Student(String name, int age, String course, char grade) {
	    this(name, age);
	    this.course = course;
	    this.grade = grade;
	  }
	  
	  //methode displayStudentInfo()
	  
	  public void displayStudentInfo() {
	    System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade);
	  }

	public static void main(String[] args) {
		
		Exercice3Student student1 = new Exercice3Student();
	    student1.displayStudentInfo();

	    Exercice3Student student2 = new Exercice3Student("N'GUESSAN Emmanuelle", 7);
	    student2.displayStudentInfo();

	    Exercice3Student student3 = new Exercice3Student("TOURE Princesse", 8, "Computer Science", 'A');
	    student3.displayStudentInfo();
	

	}

}
