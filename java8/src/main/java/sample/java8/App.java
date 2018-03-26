package sample.java8;

public class App {
  public static void main(String[] args) {
    Runnable r = () -> System.out.println("123");
    r.run();
  }
}
