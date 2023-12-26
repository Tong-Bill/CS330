public class Vodka extends BaseLiquor {

  public Vodka (Liquor newLiquor){
    tempLiquor = newLiquor;
  }
  
  public String getDescription(){
    return tempLiquor.getDescription() + " Vodka ";
  }

  public double getCalories() {
    System.out.println("Calories of Vodka: " + 30);

    return 30 + tempLiquor.getCalories();
  }
}