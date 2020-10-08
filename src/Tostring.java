class Fox{

    private int id;
    private String name;


    public Fox(int id, String name){
        this.id = id;
        this.name = name;
    }


    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
   }

}

public class Tostring {

    public static void main(String[] args){

        Fox fox1 = new Fox(7, "Freddy");
        Fox fox2 = new Fox(5, "Roger");

        System.out.println(fox1);
        System.out.println(fox2);

    }
}
