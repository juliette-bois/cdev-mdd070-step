package _3_observator._2_exercice;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {

  private List<Observer> observers = new ArrayList<>();

  public void click() {
    notify("click");
  }

  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void remove(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notify(String event) {
    for (Observer observer: observers) {
      observer.update(event, this);
    }
  }
}
