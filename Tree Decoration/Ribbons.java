package HW2;

public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Ribbons, ";
    }

    public double getCost(){
        return tree.getCost() + 2.00;
    }
}
