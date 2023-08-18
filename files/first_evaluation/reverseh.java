class main {
  public static void main(String[] args) {
    String x = "harshi";
    String bag = "";
    for (int i = 0; i <x.length(); i++) {
      bag =x.charAt(i) + bag;
    }
    
    System.out.println(bag);
  }
}
