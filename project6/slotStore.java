public abstract class slotStore {
  protected slot slotMachine = null;
  protected SlotFactory slotFactory = null;

  public slot orderSlotMachine(String type) {
    slotMachine = createSlotMachine(type);
    slotMachine.fetchComponents();
    slotMachine.assemble();
    slotMachine.testHardware();
    slotMachine.uploadSoftware();
    slotMachine.testSoftware();
    slotMachine.deliver();
    return slotMachine;
  }

  protected abstract slot createSlotMachine(String type);
}