package Exercise_5;

public class WashingtonFactory extends SlotMachine{

	SlotMachine createSlotMachine(String type){
		if (type.equals("straight")){
			return new WashingtonStraightMachine();
		} else if (type.equals("bonus")){
			return new WashingtonBonusMachine();
		} else if (type.equals("progressive")){
			return new WashingtonProgressiveMachine();
		} else return null;
	}
}