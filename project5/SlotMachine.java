package Exercise_5;

//import java.util.ArrayList;

public abstract class SlotMachine {
  String name;
  String cabinet;
  String display;
  String payment;
  String GPU;
  String OS;

  public String getName() {
    return name;
  }

  public void fetch() {
    System.out.println(
        "fetching componenets: " + cabinet + " Cabinet, " + payment + " validator," + display + " display, " + GPU);
  }

  public void assembling() {
    System.out.println("assembiling components");
  }

  public void testingh() {
    System.out.println("testing hardware");
  }

  public void uploading() {
    System.out.println("uploading software: " + OS);
  }

  public void testings() {
    System.out.println("testing software");
  }

  public void wrapping() {
    System.out.println("wrapping slot machine in Newspaper and have cousin Vinnie drop it off");
  }
}