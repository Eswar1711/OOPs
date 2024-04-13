package test;
import java.util.Scanner;


public class MyClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
       /* If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.*/

        if(num %2 !=0){
            System.out.println("weird");
        }
        if(num %2==0) {
             if (num > 2 && num < 6) {
                System.out.println("not weird");

            } else if (num >= 6 && num <= 20) {
                System.out.println("not weired");
            } else {
                System.out.println(" not weired");
            }
        }
    }
}
