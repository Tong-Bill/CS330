public class Logger {
  private static Logger logger = null;

  private Logger() {
  }
  
  public static synchronized Logger getInstance() {
    if (logger == null) {
      logger = new Logger();
    }
    return logger;
  }

  public void withdrawlog(String person, double numlogs) {
    System.out.println(person + " withdraws " + numlogs);
  }

  public void depositlog(String person, double numlogs) {
    System.out.println(person + " deposits " + numlogs);
  }
}