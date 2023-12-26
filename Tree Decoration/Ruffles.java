package HW2;

public class Ruffles extends TreeDecorator {
    public Ruffles(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Ruffles, ";
    }

    public double getCost(){
        return tree.getCost() + 1.00;
    }
}
