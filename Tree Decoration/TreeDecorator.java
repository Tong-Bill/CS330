package HW2;

public abstract class TreeDecorator extends Tree {
    Tree tree;

    public void setStar(){
        tree.setStar();
    }

    public boolean getStar(){
        return tree.getStar();
    }

    public abstract String getDescription();
    public abstract double getCost();

}
