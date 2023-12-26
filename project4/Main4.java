class Main4 {
  public static void main(String[] args) {
   Liquor liquor = new BaseLiquor();
    
    //  Liquor liquor = new LimeJuice (new Lime (new Vodka(new BaseLiquor())));
    liquor = new Vodka(liquor);
    liquor = new Lime(liquor);
    liquor = new LimeJuice(liquor);
    System.out.println(liquor.getDescription() + " is " + liquor.getCalories());
 
    
  }
}