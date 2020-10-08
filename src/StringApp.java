public class StringApp {

    public static void main(String[] args){

        // Inefficient for creating string
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")
        .append(" ")
        .append("I am a skydiver.");

        System.out.println(s.toString());

        // Formatting strings
        System.out.println("Here is some text.\tThat was a tab. \nThat was a newline");


        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);


        for(int i=0; i<20; i++){
            System.out.printf("%-2d: %s\n", i,"here is some text");
        }

        System.out.printf("Total value: %.2f\n", 5.687);
        System.out.printf("Total value: %6.1f\n", 343.23456);
    }
}
