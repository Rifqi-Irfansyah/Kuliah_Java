package eas;

import java.util.ArrayList;
import java.util.List;

public class Soal3 {
    public static void main(String[] args) {
        Employee<String> employee = new Employee<>();
        Observer<String> hrObserver = new EmployeeObserver<>("HR Department");
        Observer<String> managerObserver = new EmployeeObserver<>("Manager");

        employee.addObserver(hrObserver);
        employee.addObserver(managerObserver);

        employee.setState("Nama berubah menjadi Rifqi Irfansyah");
        employee.setState("Gaji berubah menjadi 15000000");
    }
}

interface Observer<T> {
    void update(T state);
}

class Employee<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private T state;

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void setState(T state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.update(state);
        }
    }
}

class EmployeeObserver<T> implements Observer<T> {
    private final String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(T state) {
        System.out.println(name + " menerima notifikasi: " + state);
    }
}


