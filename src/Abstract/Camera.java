package Abstract;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting camera.");
    }

    @Override
    public void doStuff() {
        System.out.println("Take picture");
    }

    @Override
    public void shutDown() {
        System.out.println("Turn off camera.");
    }
}
