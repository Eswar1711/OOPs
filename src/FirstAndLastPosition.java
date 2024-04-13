
import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*    Input: nums = [5,7,8,8,8,10], target = 8    Output: [2,4]*/
        int size=sc.nextInt();
        int target=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(position(arr,target)));

    }
    static int[] position(int[] arr, int target){
        int[] num=new int[arr.length];
        int k=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] ==target)
            {
                num[k]=i;
                k++;
            }
        }

       if(k >=1)
       {
           return new int[] {num[0],num[k-1]};
       }

        return new int[] {-1,-1};
    }

}
