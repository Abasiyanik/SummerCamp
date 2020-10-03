package repline_tasks;

public class unit1 {


    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique="";
        for (int i=0; i<=str.length()-1; i++){
            String currenChar=str.substring(i, i+1);
            if (!unique.contains(currenChar)){
                unique+=currenChar;
            }

        }
        return unique;

    }}