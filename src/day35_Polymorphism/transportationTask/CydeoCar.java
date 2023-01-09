package day35_Polymorphism.transportationTask;

import day34_Interface.animalTask.Flyable;

public class CydeoCar extends Car implements Electric, AutoPilot, Flyable {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
