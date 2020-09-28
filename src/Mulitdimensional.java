public class Mulitdimensional {

    public static void main(String[] args){


        int[] values = {3, 5, 2343};

        //Displays the contents of second index
        System.out.println(values[2]);

        //two-dimensional array
        int[][] grid = {
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };


        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];


        //Sets the grid location to string
        texts[0][1] = "Hello world";

        //Displays the string
        System.out.println(texts[0][1]);

        //Nested for loop to display grid
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
