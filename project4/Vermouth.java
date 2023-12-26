public class Vermouth extends LiquorDecorator {

  public Vermouth(Liquor newLiquor) {
    super(newLiquor);

    System.out.println("Adding Vermouth");
  }

  public String getDescription() {
    return tempLiquor.getDescription() + ", Vermouth";
  }

  public double getCalories() {

    System.out.println("Calories of Vermouth: " + 40);

    return tempLiquor.getCalories() + 40;
  }
}