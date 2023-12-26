public class Bitters extends LiquorDecorator{
 
  public Bitters (Liquor newLiquor){
    super(newLiquor);

    System.out.println("Adding Bitters");
  }

    public String getDescription(){
    return tempLiquor.getDescription() + ", bitters";
  }

  public double getCalories(){

    System.out.println("Calories of Bitters: " + 20);
    
    return tempLiquor.getCalories() + 20;
  }
}