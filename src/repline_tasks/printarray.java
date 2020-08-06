package repline_tasks;

public class printarray {
    public static void main(String[] args) {
        String [] arr={"apple", "banana","kiwi", "grape","milk","soda"};
        int t=0;
        for (int k=0; k<3; k++){
            System.out.println(arr[k+t]+" , "+arr[k+t+1]+" , "+arr[k+t+2]);
            System.out.println();
            t+=2;
        }
    }
}
