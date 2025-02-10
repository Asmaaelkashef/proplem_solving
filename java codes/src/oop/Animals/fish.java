package OopClass.Animals;

public class fish extends animals {

  public fish(){}

  public fish(int legs, int eye, String color){
    this.legs = legs;
    this.eyes = eye;
    this.color = color;
  }

  int numberOfLegs() {
    return legs = 0;
  }

  String animalColor() {
    return color = "Blue"
  }

  public void walk (){
    System.out.println("I am swimming");
  }

  @Override
  public String print(){
    return "Fish Details:\n"+ "Color: "+this.color+", Eyes: " + this.eyes+", Legs: " + this.legs;
  }
  
}
