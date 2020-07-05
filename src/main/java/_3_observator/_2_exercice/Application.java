package _3_observator._2_exercice;

public class Application implements Observer {
  private Button button;

  public void init() {
    button = new Button();
  }

  public void register() {
    System.out.println("Enregistrement...");
  }

  @Override
  public void update(String event, Observable observable) {
    if (event.equals("click")) {
      register();
    }
  }
}
