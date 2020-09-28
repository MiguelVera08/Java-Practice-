package method.world;

import method.world.Plant;

public class Oak extends Plant {

    public Oak(){

        //Won't work -- type is private
        //type = "tree";


        //This works --- size is protected, and Oak is a subclass of plant
        this.size = "large";

        // No access specifier; works because Oak and Plant in same package
        this.height = 10;
    }
}
