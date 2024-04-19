import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class MedianOfSortedArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size1 =sc.nextInt();
        int size2 =sc.nextInt();
        int[] arr1= new int[size1];
        int[] arr2= new int[size2];
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Median(arr1,arr2));
    }
    static double Median(int[] arr1, int[] arr2){
        int[] merged=new int[arr1.length+arr2.length];
        double median;
        int i=0;
            for(int j=0;j<arr1.length;j++)
            {
                merged[i]=arr1[j];
                i++;
            }
            for(int k=0;k<arr2.length;k++)
            {
                merged[i]=arr2[k];
                i++;
            }


        for(int m=0;m<merged.length;m++)
        {
           for(int n=m;n< merged.length;n++)
           {
               if(merged[m]>merged[n])
               {
                   int temp=merged[m];
                   merged[m]=merged[n];
                   merged[n]=merged[m];
               }
           }
        }
        int sum=0;
        for(int p=0;p<merged.length;p++){
            merged[p] +=sum;
        }

        if(sum==0){
            return 0;
        }

        int mid1=merged.length/2;
        if(merged.length%2 !=0){
            return merged[mid1];
        }
        else{
            double mid2=((merged[mid1]+merged[mid1-1])/2);
            return(mid2+0.5);
        }
    }

}
