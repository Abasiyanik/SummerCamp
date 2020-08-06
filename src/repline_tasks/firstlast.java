package repline_tasks;

public class firstlast {
    public static void main(String[] args) {
        String [] names={"hello", "why", "by", "apple" , "note"};

        for (String b:names){

            System.out.println(b.substring(0,1)+b.substring(b.length()-1));
        }

    }
}
