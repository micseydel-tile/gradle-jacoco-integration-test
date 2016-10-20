class Experimentation {
  public static boolean unitTestable() {
    System.out.println("unitTestable " + System.currentTimeMillis());
    return true;
  }

  public static boolean integrationTestable() {
    System.out.println("integrationTestable " + System.currentTimeMillis());
    return false;
  }
}
