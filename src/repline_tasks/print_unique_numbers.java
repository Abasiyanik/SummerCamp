package repline_tasks;

import java.util.Scanner;

public class print_unique_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }



    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
    int count;
        for (int i=0; i<=nums.length-1; i++){
        count=0;
        for (int each:nums){
            if (nums[i]==each){
                count++;
            }
            continue;
        }
        if (count==1)
        {
            System.out.println(nums[i]);
        }



    }

    }
}
