import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
     /*   for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
         }
         for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        } */
          /*
        int mid=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                boolean check=true;
                if(mid%2==0) {
                    if(j-i==0){
                        check=false;
                        System.out.print(" "+"*");
                    }
                }
                if(j-i==mid || j-i==-mid ){
                    check=false;
                    System.out.print(" "+"*");
                }
                if(check == true){
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */
        int mid=(n/2)+1;
        int count=mid;
        int count2 =mid+1;
        for (int i = 1; i <= n; i++) {
            if(i<=mid) {
                for (int j = 1; j <= n; j++) {

                    if (j == count) {
                        count--;
                        System.out.print(" "+"*");
                    }

                    else {
                        System.out.print(" ");
                    }

                }


            }
            System.out.println();
        }




    }

}

/*

* */