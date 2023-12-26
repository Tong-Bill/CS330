// Original group members: Bill Tong, James Looney

class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("The Taj Mahal orders a:");
    System.out.println("---Making a New Jersey style Bonus Slot Machine---");
    slotStore slotmachine = new NewJerseySlotStore();
    slotmachine.orderSlotMachine("bonus");

    System.out.println("\nThe Peppermill orders a:");
    System.out.println("---Making a Nevada style Progressive Slot Machine---");
    slotmachine = new NevadaSlotStore();
    slotmachine.orderSlotMachine("progressive");

    System.out.println("\nThe Design Patterns Class orders a:");
    System.out.println("---Making a Custom Class style Straight Slot Machine---");
    slotmachine = new WashingtonSlotStore();
    slotmachine.orderSlotMachine("straight");
  }
}