public class Bourbon extends BaseLiquor {

  public Bourbon (Liquor newLiquor){
    tempLiquor = newLiquor;
  }
  
  public String getDescription(){
    return tempLiquor.getDescription() + " Bourbon ";
  }

  public double getCalories() {
    System.out.println("Calories of Bourbon: " + 80);

    return 80 + tempLiquor.getCalories();
  }
}