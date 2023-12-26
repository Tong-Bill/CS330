package Exercise_5;

public abstract class SlotMachineFactory {
  abstract SlotMachine createSlotMachine(String type);

  public SlotMachine makeSlotMachine(String type) {
    SlotMachine slotMachine = createSlotMachine(type);
    System.out.println("--- Making a " + slotMachine.getName() + " ---");
    slotMachine.fetch();
    slotMachine.assembling();
    slotMachine.testingh();
    slotMachine.uploading();
    slotMachine.testings();
    slotMachine.wrapping();
    return slotMachine;
  }
}