public class WashingtonSlotStore extends slotStore {
  WashingtonSlotStore() {
    this.slotFactory = new WashingtonSlotFactory();
  }

  protected slot createSlotMachine(String type) {
    if (type.equals("straight")) {
      return slotFactory.straight();
    }

    else if (type.equals("bonus")) {
      return slotFactory.bonus();
    }

    else {
      return slotFactory.progressive();
    }

  }
}