public class NevadaSlotFactory implements SlotFactory {

  public slot straight() {
    Cabinet cabinet = new largeCabinet();
    Display display = new Reels();
    Payment payment = new TicketInTicketOut();
    GPU gpu = new Arm();
    OS os = new Linux();
    slot slotMachine = new slot(os, cabinet, display, gpu, payment);
    return slotMachine;

  }

  public slot progressive() {
    Cabinet cabinet = new mediumCabinet();
    Display display = new Lcd();
    Payment payment = new TicketInTicketOut();
    GPU gpu = new x77();
    OS os = new Android();
    slot slotMachine = new slot(os, cabinet, display, gpu, payment);
    return slotMachine;
  }

  public slot bonus() {
    Cabinet cabinet = new smallCabinet();
    Display display = new Crt();
    Payment payment = new TicketInTicketOut();
    GPU gpu = new x86();
    OS os = new Linux();
    slot slotMachine = new slot(os, cabinet, display, gpu, payment);
    return slotMachine;
  }
}