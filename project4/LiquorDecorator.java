 abstract class LiquorDecorator implements Liquor{
   Liquor tempLiquor;

  public LiquorDecorator (Liquor newLiquor){
    tempLiquor = newLiquor;
  }

  public String getDescription(){
    return tempLiquor.getDescription();
  }

  public double getCalories(){
    return tempLiquor.getCalories();
  }
}