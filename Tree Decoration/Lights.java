package HW2;

public class Lights extends TreeDecorator {
    public Lights(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Lights, ";
    }

    public double getCost(){
        return tree.getCost() + 5.00;
    }
}
