public class Exception {

    public static void main(String[] args){

        String[] texts = {"one","two","three"};

        //  Try catch statement to help with out of bounds exception error
        try{
            System.out.println(texts[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
