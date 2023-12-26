package Exercise_5;

public class NevadaFactory extends SlotMachineFactory{

	SlotMachine createSlotMachine(String type){
		if (type.equals("straight")){
			return new NevadaStraightMachine();
		} else if (type.equals("bonus")){
			return new NevadaBonusMachine();
		} else if (type.equals("progressive")){
			return new NevadaProgressiveMachine();
		} else return null;
	}
  
}