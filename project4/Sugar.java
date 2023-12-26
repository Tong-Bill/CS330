public class Sugar extends LiquorDecorator {

  public Sugar(Liquor newLiquor) {
    super(newLiquor);

    System.out.println("Adding Sugar");
  }

  public String getDescription() {
    return tempLiquor.getDescription() + ", Sugar";
  }

  public double getCalories() {

    System.out.println("Calories of Sugar: " + 300);

    return tempLiquor.getCalories() + 300;
  }
}