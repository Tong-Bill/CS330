package HW2;

public class BallsBlue extends TreeDecorator {
    public BallsBlue(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Blue Balls, ";
    }

    public double getCost(){
        return tree.getCost() + 2.00;
    }
}
