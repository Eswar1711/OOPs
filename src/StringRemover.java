import java.util.HashMap;
import java.util.Scanner;

public class StringRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = {"apple","mango","grapes","mango"};
        String[] s2={"mango"};



    }

    static HashMap<String,Integer> hash(String[] s1){
        HashMap<String,Integer> s3=new HashMap<>();
        for (String num : s1) {
            if (!s3.containsKey(num)) {
                s3.put(num, 1);
            } else {
                s3.put(num, s3.get(num) + 1);
            }
        }
        return s3;
    }
    static String[] hash2(HashMap hash){
        String[] removeOccurance=new String[hash.size()];
        for(int i=0;i<hash.size();i++){

        }
        return s;
    }

}