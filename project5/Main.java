package Exercise_5;

class Main {
  public static void main(String[] args) {
    SlotMachineFactory nj = new NewJerseyFactory();
	SlotMachineFactory nv = new NevadaFactory();

	System.out.println("The Taj Majal orders a: ");
	SlotMachine slotMachine = nj.makeSlotMachine("bonus");
	

	System.out.println("The Peppermill orders a: ");	  
	slotMachine = nv.makeSlotMachine("progressive");
	
  }
}