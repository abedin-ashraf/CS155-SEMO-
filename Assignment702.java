/*
  (Reverse the numbers entered) Write a program that reads 10 integers then displays them in the reverse of the order in which they were read
 */

import java.util.Arrays;
import java.util.Scanner;
public class Assignment702{


    public static int[] reverse(int[] arr){
        int last = arr.length-1;
        int temp;
        for (int i = 0; i < last/2; i++) {
            temp = arr[i];
            arr[i]=arr[last-i];
            arr[last-i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.print("Enter numbers: ");
        for(int i=0; i<10; i++){
            nums[i]=input.nextInt();
        }
        int[] rev = reverse(nums);
        System.out.print("After reverse: ");
        System.out.println(Arrays.toString(rev));
    }

}
