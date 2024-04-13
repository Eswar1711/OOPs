import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int target=sc.nextInt();
        int[] arr= new int[size]; // candidates = [2,3,6,7], target = 7 //output :[[2,2,3],[7]]
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<arr.length;k++)
                {
                    if (arr[i] + arr[j]+arr[k] == target)
                    {
                        System.out.println(arr[i] + "," + arr[j]+","+ arr[k]);
                    }
                }
                if (arr[i] + arr[j] == target)
                {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
            if(arr[i] ==target)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
