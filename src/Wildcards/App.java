package Wildcards;

import java.util.ArrayList;

class Machine{

    @Override
    public String toString(){
        return "I ama a machine.";
    }

    public void start(){
        System.out.println("Machine starting.");
    }

}

class Camera extends Machine{

}

public class App {
    public static void main(String[] args){
        ArrayList<Machine> list = new ArrayList<Machine>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list2);

    }

    public static void showList(ArrayList<? extends Machine> list){
        for(Machine value: list){
            System.out.println(value);
            value.start();
        }
    }
}
