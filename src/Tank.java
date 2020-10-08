import ocean.Fish;
import ocean.plants.Algae;
import ocean.plants.Seaweed;

public class Tank {

    public static void main(String[] args){

        Fish fish = new Fish();
        Seaweed weed = new Seaweed();
        Algae algae = new Algae();

        fish.show();
        weed.show();
        algae.show();
    }
}
