public class Stringarray {

    public static void main(String[] args){

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you.";

        /*Displays the contents of the second index of the array
        System.out.println(words[2]);
         */


        String[] fruits = {"apples","bananas","pears","kiwis"};


        //Display the fruits array using a for each loop
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
