package Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "TextFiles/ReadingExample.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println(line);
        }
        in.close();

    }
}
