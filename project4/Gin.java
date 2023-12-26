public class Gin extends BaseLiquor {

  public Gin (Liquor newLiquor){
    tempLiquor = newLiquor;
  }
  
  public String getDescription(){
    return tempLiquor.getDescription() + " Gin ";
  }

  public double getCalories() {
    System.out.println("Calories of Gin: " + 70);

    return 70 + tempLiquor.getCalories();
  }
}