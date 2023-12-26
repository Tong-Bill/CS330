public class NewJerseySlotFactory implements SlotFactory {

 // slot slotmachine;
  
  public slot straight() {
    Cabinet cabinet = new smallCabinet();
    Display display = new Lcd();
    Payment payment = new Coins();
    GPU gpu = new Arm();
    OS os = new Wme();
    slot machine =  new slot(os, cabinet, display, gpu, payment);
    return machine;
  }

  public slot bonus() {
     Cabinet cabinet = new largeCabinet();
    Display display = new Reels();
    Payment payment = new Coins();
    GPU gpu = new Arm();
    OS os = new Wme();
    slot machine =  new slot(os, cabinet, display, gpu, payment);
    return machine;
  }

  public slot progressive() {
    Cabinet cabinet = new smallCabinet();
    Display display = new Lcd();
    Payment payment = new Coins();
    GPU gpu = new x86();
    OS os = new Wxp();
    slot machine =  new slot(os, cabinet, display, gpu, payment);
    return machine;
  }
}