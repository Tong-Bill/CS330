package HW2;

public class LEDS extends TreeDecorator {
    public LEDS(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "L.E.D's, ";
    }

    public double getCost(){
        return tree.getCost() + 10.00;
    }
}
