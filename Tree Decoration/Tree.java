package HW2;

public abstract class Tree {
    boolean haveStar = false;
    String description = "Unknown Tree";

    public String getDescription(){
        return description;
    }
    public abstract double getCost();

    public void setStar(){
        haveStar = true;
    }

    public boolean getStar(){
        return haveStar;
    }
}
