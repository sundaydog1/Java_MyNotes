package day35_Polymorphism.transportationTask;

public interface AutoPilot extends Autopark { // interface can EXTEND interface
void selfDrive(); // the method of AutoPark will be also inherited here, no need to override it though
}
