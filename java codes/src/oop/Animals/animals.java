package OopClass.Animals;

public abstract class  animals {

    int eyes = 2;
    int legs = 4;
    String color = "" ;

    public animals () {

    }

     abstract void walk ();

    String swim ()
    {
    return "animal can swim" ;
    }

    String eat ()
    {
     return "animal can eat";
    }

    public abstract String print();
}
