package HW2;

public class BallsRed extends TreeDecorator {
    public BallsRed(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Red Balls, ";
    }

    public double getCost(){
        return tree.getCost() + 1.00;
    }
}
