package HW2;

public class Star extends TreeDecorator {
    String description;
    double priceFix;
    
    public Star(Tree tree){
        this.tree = tree;
        description = "a Star, ";
        priceFix = 4.00;

        if (this.getStar()){
            System.out.println("Tree already has a star!");
            description = "";
            priceFix = 0.00;
        }
        this.setStar();
    }

    public String getDescription(){
        return tree.getDescription() + description;
    }

    public double getCost(){
        return tree.getCost() + priceFix;
    }
}
