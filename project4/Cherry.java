public class Cherry extends LiquorDecorator{
 
  public Cherry (Liquor newLiquor){
    super(newLiquor);

    System.out.println("Adding Cherry");
  }

    public String getDescription(){
    return tempLiquor.getDescription() + ", Cherry";
  }

  public double getCalories(){

    System.out.println("Calories of Cherry: " + 40);
    
    return tempLiquor.getCalories() + 40;
  }
}