import java.util.Scanner;

public class StringMatcher {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1="three big apple trees";
        String str2= "apple trees";

        if (str2.length() > str1.length()) {
            System.out.println("Invalid input: String 2 is Greater than String 1");
        } else {
            int exactMatchIndex = getLevenshteinDistance(str1, str2);

            if (exactMatchIndex == -1) {
                System.out.println("No exact match found");
            }

            int closestMatchIndex = getLevenshteinDistance(str1, str2);

            if (closestMatchIndex == -1) {
                System.out.println("No Close Match found");
            }
        }
    }

    // Function to find the index of the first exact match
    private static int getLevenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = min(
                            dp[i - 1][j - 1] + (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1),
                            dp[i][j - 1] + 1,
                            dp[i - 1][j] + 1
                    );
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    // Function to find the closest match between two strings
    private static String findClosestMatch(String s1, String s2) {
        // You can set a threshold for the maximum allowed edit distance
        int maxAllowedDistance = 3;

        int distance = getLevenshteinDistance(s1, s2);

        if (distance <= maxAllowedDistance) {
            return s2;
        } else {
            return "No close match found";
        }
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
