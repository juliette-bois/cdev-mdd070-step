package _3_observator._2_exercice;

public interface Observable {
  void add(Observer observer);

  void remove(Observer observer);

  void notify(String event);
}
