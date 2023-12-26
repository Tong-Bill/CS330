public class slot {
  OS os;
  Cabinet cabinet;
  Display display;
  GPU gpu;
  Payment payment;

  slot(OS os, Cabinet cabinet, Display display, GPU gpu, Payment payment){
    this.os = os;
    this.cabinet = cabinet;
    this.display = display;
    this.gpu = gpu;
    this.payment = payment;
  }

  public void fetchComponents() {
    System.out.println("fetching components: " + cabinet.toString() + " Cabinet, " + payment.toString() + " validator, " + display.toString() + " display, " + gpu.toString() + " CPU");
  }

  public void testHardware() {
    System.out.println("testing hardware");
  }

  public void assemble() {
    System.out.println("assembling components");
  }

  public void uploadSoftware() {
    System.out.println("uploading software: " + os);
  }

  public void testSoftware() {
    System.out.println("testing software");
  }

  public void deliver() {}
}