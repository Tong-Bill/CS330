package Exercise_3;

public class SimpleMonitor implements Observer {
    private Subject subject;
    
    private Boolean crying;
    
    public SimpleMonitor(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(Boolean crying, int cryingLevel){
        this.crying = crying;
        System.out.println("New update");
        display();
    }

    public void display(){
        if (crying){
            System.out.println("The baby is crying.");
        }
        else{
            System.out.println("The baby is not crying.");
        }
    }

    public void monitorBroken(){
        subject.removeObserver(this);
        System.out.println("Simple Monitor has been removed from observer.");
    }
}
