package repline_tasks;

public class question {
    public static void main(String[] args) {

String [] things={"house", "shed", "slide", "zebra", "park", "garden"};
for (String s:things){
    System.out.print(s.charAt(1));
    switch (s.charAt(1)){
        case 'h':
            System.out.print(1);
            break;
        case 'a':
            System.out.print(2);
           // break;
        case 's':
            System.out.print(3);
            break;
        case 'o':
        default:
            System.out.print(4);
            //System.out.println(1);
            //break;
        case 'p':
            System.out.print(5);
            break;
        case 'z':
            System.out.print(6);
            //break;
        case 'l':
           // System.out.println(5);
            break;
        case 'g':
            System.out.print(7);
          //  break;
    }
}

}
}


