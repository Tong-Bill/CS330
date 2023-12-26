package Exercise_3;

public class driver {
    public static void main(String[] args){
        baby tim = new baby();
        baby jessica = new baby();
        SimpleMonitor simplemonitor = new SimpleMonitor(tim);
        AdvancedMonitor advancedmonitor = new AdvancedMonitor(tim);
        advancedmonitor.registerSubject(jessica);

        tim.setCrying(true, 2);

        simplemonitor.monitorBroken();

        tim.setCrying(false, 0);

        jessica.setCrying(true, 0);

        tim.setCrying(true, 2);

        advancedmonitor.monitorBroken();
    }
}
