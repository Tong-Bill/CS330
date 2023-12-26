package HW2;

public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Silver Balls, ";
    }

    public double getCost(){
        return tree.getCost() + 3.00;
    }
}
