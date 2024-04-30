import java.util.HashMap;
import java.util.Scanner;

public class StringRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = {"apple","mango","grapes","mango"};
        String[] s2={"mango"};
        System.out.println(hash(s1,s2));



    }

    static HashMap<String,Integer> hash(String[] s1,String[] s2){
        HashMap<String,Integer> s3=new HashMap<>();
        for (String num : s1) {
            if (!s3.containsKey(num)) {
                s3.put(num, 1);
            } else {
                s3.put(num, s3.get(num) + 1);
            }
        }

        for(int i=0;i<s2.length;i++){
            if(s3.containsKey(s2[i])){
                s3.remove(s2[i]);
            }
        }
        return s3;
    }

}