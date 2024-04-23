import java.util.HashMap;

public class Frequency extends  UserSpecificLargestSmallest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 1, 1, 2, 3, 4};
        int target=1;
        System.out.println(Fre(array,target));
    }
    static int Fre(int[] arr1, int target){

        HashMap<Integer,Integer> s1=hash(arr1);
        for(int check :s1.keySet()){
            if(check==target){
                return s1.get(check);
            }
        }
        return -1;
    }

}
