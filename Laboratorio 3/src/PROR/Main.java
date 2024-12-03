package PROR;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle myEV = new ElectricVehicle("TOYOTA", "KIA", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();
       
    }
}