class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    logger.depositlog("Joe", 10);
    logger.withdrawlog("Bob", 4);
    logger.depositlog("Joe", 6);
    logger.withdrawlog("Bob", 4);
    logger.withdrawlog("Bob", 4);
  }
}