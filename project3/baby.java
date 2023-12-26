package Exercise_3;

import java.util.ArrayList;

public class baby implements Subject {
    private Boolean crying;
    private int cryingLevel;
    private ArrayList<Observer> observers;

    public baby(){
        observers = new ArrayList<Observer>();
    }

    public void setCrying(Boolean crying, int cryingLevel){
        this.crying = crying;
        this.cryingLevel = cryingLevel;
        cryingDetected();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >=0){
            observers.remove(i);
        }
    }

    public void notifyObserver(){
        for(int i=0; i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(crying, cryingLevel);
        }
    }

    public void cryingDetected(){
        notifyObserver();
    } 

}
