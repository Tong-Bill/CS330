public class Vehicle {
    String name;
    String color;
    String type;
    int wheels;

    Vehicle(String name, String color, String type, int wheels){
        this.name = name;
        this.color = color;
        this.type = type;
        this.wheels = wheels;
    }

    public void display(){
        System.out.println("Information for vehicle: ");
        System.out.println("Name: " + name + "\tColor: " + color + "\tType: " + type + "\tWheels: " + wheels);

    }

}
