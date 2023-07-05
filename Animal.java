class Animal {

  private String species;
  private String coloration;
  private int birthYear;
  private String name;

  public Animal(String species, String coloration, int birthYear, String name) {
    this.species = species;
    this.coloration = coloration;
    this.birthYear = birthYear;
    this.name = name;
  }

  public void printDetails() {
    System.out.println("Species: " + species);
    System.out.println("Coloration: " + coloration);
    System.out.println("Birth Year: " + birthYear);
    System.out.println("Name: " + name);
  }

}

class Dog extends Animal {

  private String breed;

  public Dog(String species, String coloration, int birthYear, String name, String breed) {
    super(species, coloration, birthYear, name); 
    this.breed = breed;
  }

  public void dogDetails() {
    printDetails(); 
    System.out.println("Breed: " + breed);
  }

}

class Main {

  public static void main(String[] args) {
    Dog goldenRetriever = new Dog("Dog", "Golden", 2017, "Buddy", "Golden Retriever"); 
    goldenRetriever.dogDetails(); 
  }

}
