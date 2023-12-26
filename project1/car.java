public class car extends Vehicle {
    boolean engineON;

    car(String name, String color, String type, int wheels, boolean engineON){
    super(name, color, type, wheels);
    this.engineON = engineON;
    }

    public void display(){
        super.display();
        System.out.println("Active Engine: " + engineON);
    }

}
