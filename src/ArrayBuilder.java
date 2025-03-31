import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuilder {

    public static void main(String[] args) {
        //Input an Array
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        // Reverse the Array
        int [] reverse = new int[5];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            reverse[index] = nums[i];
            index += 1;
        }
        System.out.println("Reversed Array: " + Arrays.toString(reverse));

        //Find the Maximum and Minimum Values
        int max = nums[0];
        int min = nums[0];
        for (int num:nums){
            if (num > max){
                max = num;
            } if (num < min){
                min = num;
            }
        }
        System.out.println("The maximum number in the array is " + max);
        System.out.println("The minimum number in the array is " + min);

        //Sum of the Array
        int sum = 0;
        for (int num:nums){
            sum += num;
        }
        System.out.println("The sum of all the elements in the array is " + sum);

        //Check for an Even Number
        int count = 0;
        for (int num:nums){
            if (num % 2 == 0){
                count += 1;
            }
        }
        System.out.println("There are " + count + " even numbers in the array.");
    }
}
