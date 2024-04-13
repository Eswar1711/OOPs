import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        for(int i=0;i<r;i++){
            if(i==0 || i==r-1) {
                System.out.print("  ");
                for (int j = 0; j < c; j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

           else if(i==1  || i==r-2)
           {
                System.out.print("  ");
                for (int j = 0; j <c; j++) {
                    if(j==0 || j==c-1) {
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
           }

            else if(i>1 && i<r-2){
                System.out.print("  ");
                for (int j = 0; j <c; j++) {
                    if(j==i-1){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

    }
}
