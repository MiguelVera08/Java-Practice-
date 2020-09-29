package Polymorphism;

public class App {
    public static void main(String[] args){
        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

        //plant2.shedLeaves();

        doGrow(tree);

    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
