public class BaseLiquor implements Liquor{
  protected Liquor tempLiquor;

  // public BaseLiquor (Liquor newLiquor){
  //   tempLiquor = newLiquor;
  // }
  
  public String getDescription (){
    return "Glass of ";
  }

  public double getCalories() {
    // System.out.println("Calories of current drink: " + 0);
    return 0;
  }
}