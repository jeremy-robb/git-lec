public class Human {
  // instance variables
  String name;
  int age;
  
  // static variable
  // this is used by all Human
  static int numHumans = 0;

  // constructors -- to instantiate an object (initialize, and add some values)
  public Human() {
    this.name = "john";
    this.age = 10;
  }

  // constructors
  public Human(String n, int age) {
    this.name = n;
    this.age = age;
  }
  
  // instance method -- run on a particular instance
  public void solveCancer() {
    // an individual human, trying to solve cancer
    System.out.println("lol nope");
    sing();
  }

  public void solveCancer(int profit) {
    profit -= 10;
    System.out.println("i make " + profit + " solving cancer");
  }
  
  public void solveCancer(Human friend) {
    friend.age++;
  }

  private static void sing() {
      System.out.println("la la la");
  }

  // static method -- run on the Human class
  public static void runElection() {
      System.out.println("vote!");
  }
}
