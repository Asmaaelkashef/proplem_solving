package arrays;

public class Countries {
    public static void main(String[] args) {
        Countries cities = new Countries();
        System.out.println("countries are : \n");
        cities.city(); 
    }

    public void city() {
        String[][] country = {
            {"Paris ", "Rome ", "Munich"},
            {"Madrid ", "New York ", "Hong Kong"},
            {"Cairo ", "Accra ", "Johannesburg"}};

        for (int rows = 0; rows < country.length; rows++) {           
            for (int columns = 0; columns < country[rows].length; columns++) {   
                System.out.print(country[rows][columns] + " ");
            }
            System.out.println("\n");
        }
    }
}