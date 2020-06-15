package _1_decorator._3_notifier;

public class Application {
    private Notifier notifier = null;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSomething() {
        this.notifier.send("Hello");
    }
}
