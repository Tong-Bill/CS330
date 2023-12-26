public class bike extends Vehicle {
    String helmet;

    bike(String name, String color, String type, int wheels, String helmet){
        super(name, color, type, wheels);
        this.helmet = helmet;
    }

    public void display(){
        super.display();
        System.out.println("Helmet status: " + helmet);
    }
    
}
