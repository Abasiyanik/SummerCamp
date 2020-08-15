package repline_tasks;

public class unique_words {
    public static void main(String[] args) {


    String[] words={ "5", "swift", "assembly", "java", "java", "java"};

    for (int i=0; i<=words.length-1; i++){
        int count=0;
        for (String each: words){
        if (words[i].equals(each)){
            count++;
        } }
        if (count==1){
        System.out.println(words[i]);}
        }
    }
}

