import java.util.*;
public class CompareSubString {


        public static void main(String[] args) {
            String str1 = "three big apple trees";
            String str2 = "apple tree";

            if (str2.length() > str1.length()) {
                System.out.println("Invalid input");
            }
            else {
                int index = findSubstringIndex(str1, str2);

                if (index != -1) {
                    System.out.println( index);
                } else {
                    System.out.println("'" + str2 + "' not found in '" + str1 + "'.");
                }
            }
        }
        private static int findSubstringIndex(String str1, String str2) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            for (int i = 0; i <= charArray1.length - charArray2.length; i++) {
                int j;
                for (j = 0; j < charArray2.length; j++) {
                    if (charArray1[i + j] != charArray2[j]) {
                        break;
                    }
                }
                if (j == charArray2.length) {
                    return i;
                }
            }
            return -1; // Return -1 if the substring is not found
        }
    }




