package transfer;

import java.util.ArrayList;
import java.util.List;

public class TransferIstasyonu {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void atikKabulEt(String atikTuru) {
        System.out.println(atikTuru + " türündeki atıklar transfer istasyonuna kabul edildi.");
        notifyObservers(atikTuru + " türündeki atıklar kabul edildi.");
    }
}
