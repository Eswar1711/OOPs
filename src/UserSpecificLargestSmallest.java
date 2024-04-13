import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UserSpecificLargestSmallest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={4,3,2,1,8,98,16,34,46,78};
        int smallest=sc.nextInt();
        int largest=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,smallest,largest)));
    }
    static  int[] search(int[] arr1,int smallest,int largest) {

      HashMap<Integer,Integer> s1=hash(arr1);
        int[] arr2= new int[s1.size()];
          int i=0;
        for(int check :s1.keySet()){
                 arr2[i]=check;
                 i++;
        }
        Arrays.sort(arr2);
        for(int j=0;j<arr2.length;j++){

            if(j==(smallest-1)) {
                for(int k=0;k<arr2.length;k++)
                {
                   if(k==(arr2.length-largest))
                   {
                     return new int[]{arr2[j],arr2[k]};
                   }
                }
                return new int[]{arr2[j],-1};
            }

            else if(j==arr2.length-1 && j!=smallest-1 )
            {
                for (int k = 0; k < arr2.length; k++)
                {
                    if (k == (arr2.length - largest))
                    {
                        return new int[]{-1, arr2[k]};
                    }
                }
            }

        }
        return new int[] {-1,-1};
    }

    static HashMap<Integer,Integer> hash(int[] arr1){
        HashMap<Integer,Integer> s2=new HashMap<>();
        for (int num : arr1) {
            if (!s2.containsKey(num)) {
                s2.put(num, 1);
            } else {
                s2.put(num, s2.get(num) + 1);
            }
        }
        return s2;
    }

}
