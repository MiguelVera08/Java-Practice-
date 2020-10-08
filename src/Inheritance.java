public class Inheritance {

    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle();

        vehicle1.start();
        vehicle1.stop();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
    }
}
