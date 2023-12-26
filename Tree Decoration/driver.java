package HW2;

public class driver {
    public static void main(String[] args){
        Tree mytree = new ColoradoBlue();

        //Testing with different tree types
        //Tree mytree = new FraserFir();
        //Tree mytree = new DouglasFir();
        //Tree mytree = new BalsamFir();

        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);

        //Testing with different decorations
        //mytree = new BallsRed(mytree);
        //mytree = new BallsBlue(mytree);
        //mytree = new BallsSilver(mytree);
        //mytree = new Ribbons(mytree);
        //mytree = new Lights(mytree);
        //mytree = new LEDS(mytree);

        System.out.println(mytree.getDescription() + "Costs $" + mytree.getCost());
    }
}
