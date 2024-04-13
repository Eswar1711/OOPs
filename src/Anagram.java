import java.util.HashMap;
import java.util.Scanner;



public class Anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         String str1=sc.nextLine(); // listen
        String str2=sc.nextLine(); //  stilne
        char[] arr1= new char[str1.length()];
        char[] arr2= new char[str2.length()];

        for(int i=0;i<str1.length();i++){
            arr1[i]=Character.toUpperCase(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++){
            arr2[i]=Character.toUpperCase(str2.charAt(i));
        }
        System.out.println(search(arr1,arr2));
    }
    static  boolean search(char[] arr1, char[] arr2) {

        if(arr1.length !=arr2.length){
            return false;
        }
        HashMap<Integer,Integer> s1=new HashMap<>();
        HashMap<Integer,Integer> s2=new HashMap<>();
        for (int num : arr1) {
            if (!s1.containsKey(num)) {
                s1.put(num, 1);
            } else {
                s1.put(num, s1.get(num) + 1);
            }
        }
        for (int num : arr2) {
            if (!s2.containsKey(num)) {
                s2.put(num, 1);
            } else {
                s2.put(num, s2.get(num) + 1);
            }
        }

        for(int check :s1.keySet()){
            int count=0;
            for(int check2: s2.keySet()){

                if(check==check2){
                    count++;
                    int value1=s1.get(check);
                    int value2 =s2.get(check2);
                    if(value1 != value2){
                        return false;
                    }
                }

            }
            if(count==0){
                return false;
            }

        }
        return true;
    }
}
