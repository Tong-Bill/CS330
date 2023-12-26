public class Lime extends LiquorDecorator{
 
  public Lime (Liquor newLiquor){
    super(newLiquor);

    System.out.println("Adding Lime");
  }

    public String getDescription(){
    return tempLiquor.getDescription() + ", Lime";
  }

  public double getCalories(){

    System.out.println("Calories of Lime: " + 2);
    
    return tempLiquor.getCalories() + 2;
  }
}