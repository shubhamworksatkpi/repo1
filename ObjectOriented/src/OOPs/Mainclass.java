package OOPs;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("---a transport system ---");
        Truck truck = new Truck("SK's ");
        Bus bus = new Bus("SK's ");
        Bike bike = new Bike("SK's ");
        Yoot yoot = new Yoot("SK's ");
        //truck.accelerate();
        //truck.breaking();
        //bus.accelerate();
        //bus.breaking();
        bike.accelerate();
        bike.breaking();
        //yoot.accelerate();
        //yoot.breaking();
}
}
