package repline_tasks;

public class shortestword {
    public static void main(String[] args) {
        String a []= {"java", "cable", "red", "vivid", "remedy", "grace"};
        String shortest= a[0];
        for (String each : a){
            if (shortest.length()>each.length()){
                shortest=each;
                continue;
            }
            continue;
        }
        System.out.println(shortest);
    }

}
