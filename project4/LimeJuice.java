public class LimeJuice extends LiquorDecorator{
 
  public LimeJuice (Liquor newLiquor){
    super(newLiquor);

    System.out.println("Adding LimeJuice");
  }

    public String getDescription(){
    return tempLiquor.getDescription() + ", LimeJuice";
  }

  public double getCalories(){

    System.out.println("Calories of LimeJuice: " + 8);
    
    return tempLiquor.getCalories() + 8;
  }
}