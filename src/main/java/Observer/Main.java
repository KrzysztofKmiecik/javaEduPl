package Observer;

public class Main {

    public static void main(String[] args) {
        Observer sub1 = new ConcreteObserver("Sub1");
        Observer sub2 = new ConcreteObserver("Sub2");
        Observer sub3 = new ConcreteObserver("Sub3");

        Subject subject = new ConcreteSubject();
        subject.attach(sub1);
        subject.attach(sub2);
        subject.notifyUpdate(new Message("Pierwsza Wiadomość"));

        subject.detach(sub1);
        subject.attach(sub3);
        subject.notifyUpdate(new Message("Druga wiadomość"));


    }


}
