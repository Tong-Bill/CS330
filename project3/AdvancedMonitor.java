package Exercise_3;

import java.util.ArrayList;

public class AdvancedMonitor implements Observer {
    private ArrayList<Subject> subjects;
    private Boolean crying;
    private int cryingLevel;

    public AdvancedMonitor(Subject subject){
        this.subjects = new ArrayList<Subject>();
        subject.registerObserver(this);
    }

    public void update(Boolean crying, int cryingLevel){
        this.crying = crying;
        this.cryingLevel = cryingLevel;
        System.out.println("New update");
        display();
    }

    public void display(){
        if (crying){
            switch(cryingLevel){
                case 0: System.out.println("The baby is sobbing");
                        break;
                case 1: System.out.println("The baby is crying");
                        break;
                case 2: System.out.println("The baby is screaming");
                        break;
            }
        }
        else{
            System.out.println("The baby is not crying.");
        }
    }

    public void monitorBroken(){
        for(int i = 0; i<subjects.size(); i++){
            subjects.get(i).removeObserver(this);
            System.out.println("Advanced Monitor has been removed from observer.");
        }
    }

    public void registerSubject(Subject s){
        subjects.add(s);
        subjects.get(subjects.size() -1).registerObserver(this);
    }
}
