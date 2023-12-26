public class NewJerseySlotStore extends slotStore {
  NewJerseySlotStore() {
    this.slotFactory = new NewJerseySlotFactory();
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