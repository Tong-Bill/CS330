public class NevadaSlotStore extends slotStore {
  NevadaSlotStore() {
    this.slotFactory = new NevadaSlotFactory();
  }

  protected slot createSlotMachine(String type) {
    if (type.equals("straight")) {
      return slotFactory.straight();
    } else if (type.equals("bonus")) {
      return slotFactory.bonus();
    } else {
      return slotFactory.progressive();
    }
  }
}