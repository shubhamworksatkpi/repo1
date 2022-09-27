package OOPs;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("---a transport system ---\n");
        Truck truck = new Truck("SK's ");
        Bus bus = new Bus("SK's ");
        Bike bike = new Bike("SK's ");
        Yoot yoot = new Yoot("SK's ");
        Pulsar pulsar = new Pulsar("SK's ");
        truck.accelerate(); 
        //System.out.println("\n");
        truck.breaking();
        bus.accelerate();
        bus.breaking();
        bike.accelerate();
        bike.breaking();
        yoot.accelerate();
        yoot.breaking();
        pulsar.accelerate();
        pulsar.breaking();
}
}
