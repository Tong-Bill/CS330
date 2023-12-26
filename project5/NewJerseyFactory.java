package Exercise_5;

public class NewJerseyFactory extends SlotMachineFactory{

	SlotMachine createSlotMachine(String type){
		if (type.equals("straight")){
			return new NewJerseyStraightMachine();
		} else if (type.equals("bonus")){
			return new NewJerseyBonusMachine();
		} else if (type.equals("progressive")){
			return new NewJerseyProgressiveMachine();
		} else return null;
	}
  
}