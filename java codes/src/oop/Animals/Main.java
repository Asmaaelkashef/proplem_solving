package OopClass.Animals;

public class Main {
  public static void main(String[] args) {
    animals animal = new fish();
    
    monkey monkey2 = new monkey("brown");

    System.out.println("monkey attributes : ");
    System.out.println("color is " + monkey2.print());

    fish fish = new fish();
    System.out.println("fish attributes : ");
    System.out.println("color is " + fish.animalColor()) ;
    System.out.println("legs : "+  fish.numberOfLegs()) ;
    System.out.println(animal.swim()) ;
    System.out.println(animal.eat());
    System.out.println(fish.print());




  }
}
