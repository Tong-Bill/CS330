public class WashingtonSlotFactory implements SlotFactory {
  public slot straight() {
    OS os = new Linux();
    GPU gpu = new Arm();
    Payment payment = new Bills();
    Display display = new Reels();
    Cabinet cabinet = new largeCabinet();
    slot machine = new slot(os, cabinet, display, gpu, payment);
    return machine;
  }

  public slot bonus() {
    OS os = new Symbian();
    GPU gpu = new Arm();
    Payment payment = new TicketInTicketOut();
    Display display = new Vga();
    Cabinet cabinet = new mediumCabinet();
    slot machine = new slot(os, cabinet, display, gpu, payment);
    return machine;
  }

  public slot progressive() {
    OS os = new Android();
    GPU gpu = new Arm();
    Payment payment = new Coins();
    Display display = new Reels();
    Cabinet cabinet = new largeCabinet();
    slot machine = new slot(os, cabinet, display, gpu, payment);
    return machine;
  }
}