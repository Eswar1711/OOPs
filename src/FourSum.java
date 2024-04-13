
import java.util.Scanner;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int target=sc.nextInt();
        int[] arr= new int[size];           /* Input: nums = [1,0,-1,0,-2,2], target = 0
                                             Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]*/

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<arr.length;k++) {
                    for (int l = i; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k]+ arr[l] == target) {
                            System.out.println(arr[i] + "," + arr[j] + "," + arr[k]+","+arr[l]);
                        }
                    }
                }
            }
        }
    }
}



