public class Main {
    public static void main(String[] args) {
        
        // Programming to an implementation
        //car newCar = new car("Chevy", "Blue", "Gas", 4, true);
        //bike newBike = new bike("Nike", "Red", "Electric", 2, "Absent");

        // Programming to an interface/supertype
        Vehicle newCar = new car("Chevy", "Blue", "Gas", 4, true);
        Vehicle newBike = new bike("Nike", "Red", "Electric", 2, "Absent");
        newCar.display();
        newBike.display();

    }
}
