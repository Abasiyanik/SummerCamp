package repline_tasks;

public class uniqueletter2 {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
}
    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique="";
        String [] charAll=str.split("");

        for (String eachchar: charAll){

        if (!unique.contains(eachchar)){
                unique+=eachchar;
            }

        }
        return unique;

    }}