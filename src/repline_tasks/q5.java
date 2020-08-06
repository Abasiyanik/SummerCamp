package repline_tasks;

public class q5 {
    public static void main(String[] args) {


    int [] nums ={14,1,84,97,1243,46};
    int total=0;
    for (int i=0; i<nums.length; i++){
        if (nums[i]%2!=0){
            total+=3;

        } else{
            total+=10;
        }
        if (i%3==0){total-=15; }


    }
        System.out.println(total);

int g=0%3;
        System.out.println(g);
}}
